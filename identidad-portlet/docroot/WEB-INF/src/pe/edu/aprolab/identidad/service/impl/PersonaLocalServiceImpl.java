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

import com.liferay.portal.kernel.exception.SystemException;

import pe.edu.aprolab.identidad.model.Persona;
import pe.edu.aprolab.identidad.service.base.PersonaLocalServiceBaseImpl;

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
	public Persona addPersona(long companyId,String codigoId,String nombres, 
			String apellidoPaterno,String apellidoMaterno, boolean genero, 
			int estadoCivil, Date fechaNacimiento, String ubigeoNacimiento) throws SystemException {
		
		return null;
	}
}