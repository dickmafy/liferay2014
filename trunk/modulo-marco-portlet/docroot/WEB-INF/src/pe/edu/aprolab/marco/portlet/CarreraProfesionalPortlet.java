package pe.edu.aprolab.marco.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil;
import pe.edu.aprolab.marco.util.CarreraProfesionalPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class CarreraProfesionalPortlet  extends MVCPortlet{

	public void addCarreraProfesional(ActionRequest actionRequest, ActionResponse actionResponse)
	throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		
		String nombre = ParamUtil.getString(actionRequest, CarreraProfesionalPortletKeys.NOMBRE);
		String descripcion = ParamUtil.getString(actionRequest, CarreraProfesionalPortletKeys.DESCRIPCION);
		Integer formacion = ParamUtil.getInteger(actionRequest, CarreraProfesionalPortletKeys.FORMACION);
		Integer estado = ParamUtil.getInteger(actionRequest, CarreraProfesionalPortletKeys.ESTADO);		
		
		CarreraProfesionalLocalServiceUtil
		.addCarreraProfesional(themeDisplay.getCompanyId(), nombre, descripcion, formacion, estado);
		
	}
	
	private static Log _log = LogFactoryUtil.getLog(FamiliaProfesionalPortlet.class);

}
