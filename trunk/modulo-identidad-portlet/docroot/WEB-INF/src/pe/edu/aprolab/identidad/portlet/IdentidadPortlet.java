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
package pe.edu.aprolab.identidad.portlet;


import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;



import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import pe.edu.aprolab.identidad.model.Persona;
import pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil;
import pe.edu.aprolab.identidad.utils.PortletKeys;

/**
 * @author Jorge Loayza
 */
public class IdentidadPortlet extends MVCPortlet {

	public void addPersona(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		int birthdayMonth = ParamUtil.getInteger(actionRequest, "birthdayMonth");
		int birthdayDay = ParamUtil.getInteger(actionRequest, "birthdayDay");
		int birthdayYear = ParamUtil.getInteger(actionRequest, "birthdayYear");
		
		String codigoId = "pe.dni."+ParamUtil.getString(actionRequest, PortletKeys.CODIGO_ID);
		String nombres = ParamUtil.getString(actionRequest, PortletKeys.NOMBRES);
		String apellidoPaterno = ParamUtil.getString(actionRequest, PortletKeys.APELLIDO_PATERNO);
		String apellidoMaterno = ParamUtil.getString(actionRequest, PortletKeys.APELLIDO_MATERNO);
		boolean genero = ParamUtil.getBoolean(actionRequest, PortletKeys.GENERO);
		int estadoCivil = ParamUtil.getInteger(actionRequest, PortletKeys.ESTADO_CIVIL);
		String ubigeoNacimiento = ParamUtil.getString(actionRequest, PortletKeys.UBIGEO_NACIMIENTO);
		String emailAddress = ParamUtil.getString(actionRequest, PortletKeys.EMAIL);
		
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		PersonaLocalServiceUtil.addPersona(themeDisplay.getCompanyId(), codigoId, emailAddress, 
				nombres, apellidoPaterno, apellidoMaterno, genero, 
				estadoCivil, birthdayMonth, birthdayDay, birthdayYear, 
				ubigeoNacimiento, serviceContext);
	}
	private static Log _log = LogFactoryUtil.getLog(IdentidadPortlet.class);

}