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
import com.liferay.portal.model.Group;

import pe.edu.aprolab.base.NoSuchInstitucionException;
import pe.edu.aprolab.base.model.Institucion;
import pe.edu.aprolab.base.service.base.InstitucionLocalServiceBaseImpl;

/**
 * The implementation of the institucion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pe.edu.aprolab.base.service.InstitucionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.base.service.base.InstitucionLocalServiceBaseImpl
 * @see pe.edu.aprolab.base.service.InstitucionLocalServiceUtil
 */
public class InstitucionLocalServiceImpl extends InstitucionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link pe.edu.aprolab.base.service.InstitucionLocalServiceUtil} to access the institucion local service.
	 */
	
	public boolean isInstitucion(Group group) throws SystemException, PortalException{
		try{
			institucionLocalService.getInstitucion(group.getGroupId());
			return true;
		}catch(NoSuchInstitucionException e){
			return false;
		}
	}
	
	public Institucion setInstitucion(Group group ,String RUC, String codigoModular) throws SystemException, PortalException{
		Institucion institucion = null;
		try{
			institucion = institucionLocalService.getInstitucion(group.getGroupId());
		}catch(NoSuchInstitucionException e){
			institucion = institucionLocalService.createInstitucion(group.getGroupId());
		}
		institucion.setRUC(RUC);
		institucion.setCodigoModular(codigoModular);
		institucion.persist();
		return institucion;
	}
}