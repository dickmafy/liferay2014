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

package pe.edu.aprolab.base.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import pe.edu.aprolab.base.model.Local;

import pe.edu.aprolab.base.service.base.LocalLocalServiceBaseImpl;

/**
 * The implementation of the local local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pe.edu.aprolab.base.service.LocalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.base.service.base.LocalLocalServiceBaseImpl
 * @see pe.edu.aprolab.base.service.LocalLocalServiceUtil
 */
public class LocalLocalServiceImpl extends LocalLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link pe.edu.aprolab.base.service.LocalLocalServiceUtil} to access the local local service.
	 */
	
	public Local addLocal(long companyId, String nombre, Integer estado) throws SystemException, PortalException {
		Local objeto =  localLocalService.createLocal(counterLocalService.increment(Local.class.getName()));
		
		objeto.setCompanyId(companyId);
		objeto.setNombre(nombre);
		objeto.setEstado(estado);
		
		objeto.persist();
		return objeto;
		
	}
	
}