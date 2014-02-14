<%@page import="pe.edu.aprolab.base.members.MembersRequestKeys"%>
<%@page import="com.liferay.portlet.social.model.SocialRequestConstants"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portlet.social.service.SocialRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<%@ include file="/html/institucion/init.jsp" %>
<%
	boolean isAdmin = permissionChecker.isOrganizationAdmin(organization.getParentOrganizationId());
%>

<c:choose>
	<c:when test="<%=group.isOrganization() &&  isInstitucion %>">
			<div class="summary-container">
				<h2>
					Institución: <%= HtmlUtil.escape(organization.getName()) %>
				</h2>
				
				<c:if test="<%=isAdmin %>">	
					<div class="alert alert-info">
						<liferay-ui:message key="Utiliza el panel de control para cambiar los datos adicionales" />
					</div>
				</c:if>
			</div>
	</c:when>
	<c:when test="<%=group.isOrganization() %>">
			<div class="summary-container">
				<h2>
					Institución: <%= HtmlUtil.escape(organization.getName()) %>
				</h2>
				
				<c:if test="<%=isAdmin %>">	
					
				</c:if>
			</div>
	</c:when>
	<c:otherwise>
		<div class="alert alert-error">
             <liferay-ui:message key="Esta aplicación solo funciona en un espacio de trabajo de una Institución" />
       </div>
	</c:otherwise>
</c:choose>