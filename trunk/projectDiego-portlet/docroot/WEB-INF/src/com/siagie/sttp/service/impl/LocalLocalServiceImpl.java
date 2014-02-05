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

package com.siagie.sttp.service.impl;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.siagie.sttp.model.Local;
import com.siagie.sttp.service.base.LocalLocalServiceBaseImpl;

/**
 * The implementation of the local local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.siagie.sttp.service.LocalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Diego
 * @see com.siagie.sttp.service.base.LocalLocalServiceBaseImpl
 * @see com.siagie.sttp.service.LocalLocalServiceUtil
 */
public class LocalLocalServiceImpl extends LocalLocalServiceBaseImpl {
	

	public Local addLocal(String nombre, Integer estado,ServiceContext serviceContext) throws SystemException, PortalException {
		Local local =  localLocalService.createLocal(counterLocalService.increment(Local.class.getName()));
		
		local.setNombre(nombre);
		local.setEstado(estado);
		
		System.out.println("Se grabo Local");
		return localLocalService.addLocal(local);
		
	}

		
	
	
}