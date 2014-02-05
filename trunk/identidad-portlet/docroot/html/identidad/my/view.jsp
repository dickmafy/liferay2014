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

<%@ include file="/html/identidad/init.jsp" %>

<c:choose>
	<c:when test="<%= group.isUser() %>">
		<aui:container cssClass="summary-container">
			<aui:row>
				<h2>
					<%= HtmlUtil.escape(user2.getFullName()) %>
				</h2>
		
				<aui:col cssClass="user-container">
					<img alt="<liferay-ui:message key="user-portrait" />" class="user-profile-image" src="<%= user2.getPortraitURL(themeDisplay) %>" />
		
					<c:if test="<%= UserPermissionUtil.contains(permissionChecker, user2.getUserId(), ActionKeys.UPDATE) %>">
		
						<%
						PortletURL editURL = renderResponse.createRenderURL();
		
						editURL.setWindowState(WindowState.MAXIMIZED);
		
						editURL.setParameter("mvcPath", "/html/identidad/my/edit.jsp");
						%>
		
						<p class="edit-profile">
							<aui:icon
								image="edit"
								label="edit-profile"
								url="<%= editURL.toString() %>"
							/>
						</p>
					</c:if>
				</aui:col>
		
			</aui:row>
		</aui:container>
	</c:when>
	<c:otherwise>
		<div class="alert alert-error">
             <liferay-ui:message key="this-application-will-only-function-when-placed-on-a-user-page" />
       </div>
	</c:otherwise>
</c:choose>