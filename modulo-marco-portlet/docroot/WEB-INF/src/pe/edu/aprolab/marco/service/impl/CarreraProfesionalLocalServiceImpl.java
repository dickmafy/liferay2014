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

import pe.edu.aprolab.marco.model.CarreraProfesional;
import pe.edu.aprolab.marco.service.base.CarreraProfesionalLocalServiceBaseImpl;

/**
 * The implementation of the carrera profesional local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pe.edu.aprolab.marco.service.CarreraProfesionalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Diego
 * @see pe.edu.aprolab.marco.service.base.CarreraProfesionalLocalServiceBaseImpl
 * @see pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil
 */
public class CarreraProfesionalLocalServiceImpl
	extends CarreraProfesionalLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil} to access the carrera profesional local service.
	 */
	
	public CarreraProfesional addCarreraProfesional
	(
	long companyId, String nombre,String descripcion,Integer formacion ,Integer estado
	) throws SystemException, PortalException
	
	{
	CarreraProfesional object = carreraProfesionalLocalService.createCarreraProfesional(counterLocalService.increment(CarreraProfesional.class.getName()));
	object.setCompanyId(companyId);
	object.setNombre(nombre);
	object.setDescripcion(descripcion);
	object.setFormacion(formacion);
	object.setEstado(1);
	object.persist();
	return object;
	}
	
}