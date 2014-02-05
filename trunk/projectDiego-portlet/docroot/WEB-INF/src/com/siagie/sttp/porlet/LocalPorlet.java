package com.siagie.sttp.porlet;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.siagie.sttp.service.LocalLocalServiceUtil;
import com.siagie.sttp.util.PortletKeys;

public class LocalPorlet extends MVCPortlet{
	
	public void addLocal(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		//int birthdayMonth = ParamUtil.getInteger(actionRequest, "birthdayMonth");
		String nombre = ParamUtil.getString(actionRequest, PortletKeys.NOMBRE);
		Integer estado = ParamUtil.getInteger(actionRequest, PortletKeys.ESTADO);
		
		ServiceContext serviceContext = new ServiceContext();
		//serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		LocalLocalServiceUtil.addLocal(nombre,estado,serviceContext);
	}
	private static Log _log = LogFactoryUtil.getLog(LocalPorlet.class);

}
