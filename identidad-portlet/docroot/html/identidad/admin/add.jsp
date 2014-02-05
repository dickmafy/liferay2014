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

<%@page import="pe.edu.aprolab.identidad.utils.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/html/identidad/init.jsp" %>
<%
		Calendar birthday = CalendarFactoryUtil.getCalendar();
		
		birthday.set(Calendar.MONTH, Calendar.JANUARY);
		birthday.set(Calendar.DATE, 1);
		birthday.set(Calendar.YEAR, 1970);
%>

<portlet:actionURL var="addPersona" name="addPersona"></portlet:actionURL>

<portlet:renderURL var="redirectURL" windowState="<%= WindowState.NORMAL.toString() %>" />

<strong><liferay-ui:message key="Registrar Persona" /></strong>

<aui:form name="addNuevaPersona" action="<%=addPersona %>" method="post">
<div class="row-fluid">
	<aui:fieldset cssClass="span6">
		
		<aui:input label="DNI" name="<%=PortletKeys.CODIGO_ID %>" >
			<aui:validator name="required" />
			<aui:validator name="alphanum"/>
		</aui:input>
		
		<aui:input label="Apellido Paterno" name="<%=PortletKeys.APELLIDO_PATERNO %>" >
			<aui:validator name="required" />
			<aui:validator name="alpha"/>
		</aui:input>
		
		<aui:input label="Apellido Materno" name="<%=PortletKeys.APELLIDO_MATERNO %>" >
			<aui:validator name="required" />
			<aui:validator name="alpha"/>
		</aui:input>
		
		<aui:input label="Nombres" name="<%=PortletKeys.NOMBRES %>" >
			<aui:validator name="required" />
			<aui:validator name="alpha"/>
		</aui:input>
		
		<aui:input label="Email" name="<%=PortletKeys.EMAIL %>" >
			<aui:validator name="required" />
			<aui:validator name="email"/>
		</aui:input>
		
	</aui:fieldset>

	<aui:fieldset cssClass="span5">
		<aui:select  label="Sexo" name="<%=PortletKeys.GENERO %>">
			<aui:option label="male" value="true" />
			<aui:option label="female" value="false" />
		</aui:select>
		
		<aui:select  label="Estado Civil" name="<%=PortletKeys.ESTADO_CIVIL %>">
			<aui:option label="Soltero(a)" value="1" />
			<aui:option label="Casado(a)" value="2" />
			<aui:option label="Divorciado(a)" value="3" />
			<aui:option label="Viudo(a)" value="4" />
		</aui:select>
		
		<aui:input  label="Fecha Nacimiento" name="birthday"  model="<%= Contact.class %>" value="<%= birthday %>" />
		
		<aui:input label="Ubigeo Nacimiento" name="<%=PortletKeys.UBIGEO_NACIMIENTO %>" >
			<aui:validator name="required" />
			<aui:validator name="alphanum"/>
		</aui:input>
	</aui:fieldset>	
</div>
<div class="row-fluid">		
		<aui:button-row>
			<aui:button type="submit" />
	
			<aui:button href="<%= redirectURL %>" value="cancel" />
		</aui:button-row>
</div>			

</aui:form>		