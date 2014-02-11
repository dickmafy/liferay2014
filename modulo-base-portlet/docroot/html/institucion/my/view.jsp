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
<c:choose>
	<c:when test="">
			<div class="summary-container">
				<h2>
					<%= HtmlUtil.escape(organization.getName()) %>
				</h2>
			
				<c:if test="<%= themeDisplay.isSignedIn() %>">
					<c:choose>
						<c:when test="<%= SocialRequestLocalServiceUtil.hasRequest(user.getUserId(), Organization.class.getName(), organization.getOrganizationId(), MembersRequestKeys.ADD_MEMBER, SocialRequestConstants.STATUS_PENDING) %>">
							<div class="portlet-msg-info join-organization pending">
								<liferay-ui:message key="membership-requested" />
							</div>
						</c:when>
						<c:when test="<%= UserLocalServiceUtil.hasOrganizationUser(organization.getOrganizationId(), user.getUserId()) %>">
			
							<%
							PortletURL leaveOrganizationURL = renderResponse.createActionURL();
			
							leaveOrganizationURL.setParameter(ActionRequest.ACTION_NAME, "leaveOrganization");
							leaveOrganizationURL.setParameter("redirect", currentURL);
			
							String leaveOrganizationHREF = "javascript:if (confirm('" + LanguageUtil.get(pageContext, "are-you-sure-you-want-to-leave-this-organization") + "')) { submitForm(document.hrefFm, '" + leaveOrganizationURL + "'); }";
							%>
			
							<p class="leave-organization">
								<liferay-ui:icon
									image="leave"
									label="<%= true %>"
									message="leave-organization"
									url="<%= leaveOrganizationHREF %>"
								/>
							</p>
						</c:when>
						<c:otherwise>
			
							<%
							PortletURL joinOrganizationURL = renderResponse.createActionURL();
			
							joinOrganizationURL.setParameter(ActionRequest.ACTION_NAME, "joinOrganization");
							joinOrganizationURL.setParameter("redirect", currentURL);
							%>
			
							<p class="join-organization">
								<liferay-ui:icon
									image="join"
									label="<%= true %>"
									message="join-organization"
									url="<%= joinOrganizationURL.toString() %>"
								/>
							</p>
						</c:otherwise>
					</c:choose>
				</c:if>
			</div>
	</c:when>
	<c:otherwise>
		<div class="alert alert-error">
             <liferay-ui:message key="this-application-will-only-function-when-placed-on-a-organization-page" />
       </div>
	</c:otherwise>
</c:choose>