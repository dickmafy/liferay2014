package pe.edu.aprolab.marco.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;





import pe.edu.aprolab.marco.model.FamiliaProfesional;
import pe.edu.aprolab.marco.service.FamiliaProfesionalLocalServiceUtil;
import pe.edu.aprolab.marco.util.FamiliaProfesionalPortletKeys;

import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;

/**
 * Portlet implementation class FamiliaPortlet
 */
public class FamiliaProfesionalPortlet extends MVCPortlet {
 
	
	public void addFamilia(ActionRequest actionRequest, ActionResponse actionResponse)
	throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		
		String nombre = ParamUtil.getString(actionRequest, FamiliaProfesionalPortletKeys.NOMBRE);
		String descripcion = ParamUtil.getString(actionRequest, FamiliaProfesionalPortletKeys.DESCRIPCION);
		Integer sector = ParamUtil.getInteger(actionRequest, FamiliaProfesionalPortletKeys.SECTOR);
		Integer estado = ParamUtil.getInteger(actionRequest, FamiliaProfesionalPortletKeys.ESTADO);		
		
		FamiliaProfesionalLocalServiceUtil
		.addFamiliaProfesiona(
				themeDisplay.getCompanyId(), nombre, descripcion, sector, estado);
	}
	private static Log _log = LogFactoryUtil.getLog(FamiliaProfesionalPortlet.class);

	

}
