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


<%@page import="javax.portlet.WindowState"%>
<%@page import="pe.edu.aprolab.base.util.PortletKeys"%>
<%@ include file="/html/local/init.jsp" %>

<portlet:actionURL var="addLocal" name="addLocal"></portlet:actionURL>
<portlet:renderURL var="redirectURL" windowState="<%= WindowState.NORMAL.toString() %>" />
<strong><liferay-ui:message key="Registrar Local" /></strong>


<aui:form name="addNuevoLocal" action="<%=addLocal %>" method="post">
<div class="row-fluid">
	<aui:fieldset cssClass="span6">
		
		<aui:input label="Nombre" name="<%=PortletKeys.NOMBRE %>" >
			<aui:validator name="required" />
			<aui:validator name="alpha"/>
		</aui:input>
		
		<aui:input label="Estado" name="<%=PortletKeys.ESTADO %>" >
			<aui:validator name="required" />
		</aui:input>
		
	</aui:fieldset>	
</div>
<div class="row-fluid">		
		<aui:button-row>
			<aui:button type="submit" />
	
			<aui:button href="<%=redirectURL%>" value="cancel" />
		</aui:button-row>
</div>			

</aui:form>		