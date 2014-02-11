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

package pe.edu.aprolab.marco.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import pe.edu.aprolab.marco.model.FamiliaProfesional;
import pe.edu.aprolab.marco.service.base.FamiliaProfesionalLocalServiceBaseImpl;

/**
 * The implementation of the familia profesional local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pe.edu.aprolab.marco.service.FamiliaProfesionalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Diego
 * @see pe.edu.aprolab.marco.service.base.FamiliaProfesionalLocalServiceBaseImpl
 * @see pe.edu.aprolab.marco.service.FamiliaProfesionalLocalServiceUtil
 */
public class FamiliaProfesionalLocalServiceImpl
	extends FamiliaProfesionalLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link pe.edu.aprolab.marco.service.FamiliaProfesionalLocalServiceUtil} to access the familia profesional local service.
	 */
	
	public  FamiliaProfesional addFamiliaProfesiona
	(
	long companyId, String nombre,String descripcion,Integer sector ,Integer estado
	) throws SystemException, PortalException
	{
	FamiliaProfesional familia = familiaProfesionalPersistence.create(counterLocalService.increment(FamiliaProfesional.class.getName()));
	familia.setCompanyId(companyId);
	familia.setNombre(nombre);
	familia.setDescripcion(descripcion);
	familia.setSector(sector);
	familia.setEstado(1);
	familia.persist();
	
	return familia;
	}
}