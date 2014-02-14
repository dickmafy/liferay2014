package pe.edu.aprolab.base.portlet;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;




import pe.edu.aprolab.base.service.LocalLocalServiceUtil;
import pe.edu.aprolab.base.util.PortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class LocalPortlet extends MVCPortlet{
	
	public void addLocal(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String nombre = ParamUtil.getString(actionRequest, PortletKeys.NOMBRE);
		Integer estado = ParamUtil.getInteger(actionRequest, PortletKeys.ESTADO);
		ServiceContext serviceContext = new ServiceContext();
		
		
		LocalLocalServiceUtil.addLocal(themeDisplay.getCompanyId() ,nombre,estado);
	}
	private static Log _log = LogFactoryUtil.getLog(LocalPortlet.class);

}
