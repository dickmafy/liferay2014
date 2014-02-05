<%--
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
--%>

<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil"%>
<%@page import="pe.edu.aprolab.identidad.model.Persona"%>
<%@page import="java.util.List"%>
<%@ include file="/html/identidad/init.jsp" %>
<%PortletURL portletURL = renderResponse.createRenderURL(); %>

<h3><liferay-ui:message key="Personas Registradas" /></h3>

<c:if test="<%= UserPermissionUtil.contains(permissionChecker, themeDisplay.getUserId(), ActionKeys.UPDATE) %>">
		
	<%
	PortletURL addURL = renderResponse.createRenderURL();

	addURL.setWindowState(WindowState.MAXIMIZED);

	addURL.setParameter("mvcPath", "/html/identidad/admin/add.jsp");
	%>
		<aui:button-row>
             <aui:button type="button" value="Agregar Persona" onClick="<%= addURL.toString()%>" cssClass="btn-primary"/>
        </aui:button-row>
</c:if>	

<liferay-ui:search-container 
	emptyResultsMessage="No hay personas registradas"
	
>
<%
		List<Persona> personas = PersonaLocalServiceUtil.findByCompanyId(
				themeDisplay.getCompanyId(), searchContainer.getStart(), searchContainer.getEnd());
		System.out.println("Tamanyo personas: " + personas.size());
		
%>

	<liferay-ui:search-container-results
		results="<%=personas %>"
		total="<%=(int)PersonaLocalServiceUtil.countByCompanyId(themeDisplay.getCompanyId()) %>"
	>
		<liferay-ui:search-container-row
			className="pe.edu.aprolab.identidad.model.Persona"
			keyProperty="personaId"
			modelVar="persona"
		>
			<liferay-ui:search-container-column-text
				name="Id"
				property="codigoId" />
			<liferay-ui:search-container-column-text
				name="name"
				value="<%=persona.getApellidoPaterno() + \" \"+
				          persona.getApellidoMaterno() + \", \"+
				          persona.getNombres()%>" />
				
		</liferay-ui:search-container-row>
		
	</liferay-ui:search-container-results>
</liferay-ui:search-container>