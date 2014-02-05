/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package pe.edu.aprolab.identidad.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.ContactBirthdayException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.util.PortalUtil;

import pe.edu.aprolab.identidad.model.Persona;
import pe.edu.aprolab.identidad.service.base.PersonaLocalServiceBaseImpl;
import pe.edu.aprolab.identidad.utils.DateUtils;

/**
 * The implementation of the persona local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pe.edu.aprolab.identidad.service.PersonaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.identidad.service.base.PersonaLocalServiceBaseImpl
 * @see pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil
 */
public class PersonaLocalServiceImpl extends PersonaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil} to access the persona local service.
	 */
	public Persona addPersona( long companyId,String codigoId, String emailAddress, String nombres, 
			String apellidoPaterno,String apellidoMaterno, boolean genero, 
			int estadoCivil, int birthdayMonth, int birthdayDay, int birthdayYear, 
			String ubigeoNacimiento, ServiceContext serviceContext) throws SystemException, PortalException {
		
		boolean autoPassword = true;
		String screenName = "PE.DNI."+codigoId;
		User user = UserServiceUtil.addUser( companyId, autoPassword, 
				"", "", false, screenName,emailAddress, 0, "", 
				LocaleUtil.getDefault(), nombres, "", apellidoPaterno, 
				0, 0, genero, birthdayMonth, 
				birthdayDay, birthdayYear, "", (long[])null, 
				(long[])null, (long[])null, (long[])null, 
				true, serviceContext);
		
		Persona persona = personaLocalService.createPersona(user.getUserId());
		Date now = new Date();
		Date birthday = DateUtils.getBirthday(birthdayMonth, birthdayDay, birthdayYear);
		
		persona.setCompanyId(companyId);
		persona.setCreateDate(now);
		persona.setModifiedDate(now);
		persona.setCodigoId(screenName);
		persona.setNombres(nombres);
		persona.setApellidoPaterno(apellidoPaterno);
		persona.setApellidoMaterno(apellidoMaterno);
		persona.setGenero(genero);
		persona.setEstadoCivil(estadoCivil);
		persona.setFechaNacimiento(birthday);
		persona.setUbigeoNacimiento(ubigeoNacimiento);
		return personaLocalService.addPersona(persona);
		
	}
	
	public List<Persona> findByCompanyId(long companyId, int start, int end) throws SystemException{
		return personaPersistence.findByCompanyId(companyId);
	}
	public long countByCompanyId(long companyId) throws SystemException{
		return personaPersistence.countByCompanyId(companyId);
	}
	
}