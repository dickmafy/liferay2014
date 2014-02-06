
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
<%@page import="pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil"%>
<%@page import="pe.edu.aprolab.identidad.model.Persona"%>
<%@page import="java.util.List"%>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<%
	Group group = themeDisplay.getScopeGroup();
	User user2=null;
	if(group.isUser())user2 = UserLocalServiceUtil.getUserById(group.getClassPK());
%>