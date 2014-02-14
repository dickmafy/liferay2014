
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="pe.edu.aprolab.base.service.InstitucionLocalServiceUtil"%>
<%@page import="pe.edu.aprolab.base.model.Institucion"%>
<%@ page contentType="text/html"%>
<%@ page pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.permission.UserPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.model.Contact"%>
<%@page import="com.liferay.portal.model.Group"%>
<%@page import="java.util.List"%>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<%
	String currentURL = PortalUtil.getCurrentURL(request);
	Group group = themeDisplay.getScopeGroup();
	
	Institucion institucion=null;
	Organization organization = null;
	boolean isInstitucion = false;
	if (group.isOrganization()) {
		organization = OrganizationLocalServiceUtil.getOrganization(group.getClassPK());
		isInstitucion = InstitucionLocalServiceUtil.isInstitucion(group);
		if(isInstitucion)
			institucion = InstitucionLocalServiceUtil.getInstitucion(group.getGroupId());
	}
%>