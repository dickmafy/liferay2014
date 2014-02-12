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


<%@page import="pe.edu.aprolab.marco.util.CarreraProfesionalPortletKeys"%>
<%@ include file="/html/carrera_profesional/init.jsp" %>

<portlet:actionURL var="addCarreraProfesional" name="addCarreraProfesional" />
<portlet:renderURL var="redirectURL" windowState="<%=WindowState.NORMAL.toString()%>" />

<strong><liferay-ui:message key="Registrar Carrera Profesonal" /></strong>


<aui:form name="addCarreraProfesional" action="<%=addCarreraProfesional%>" method="post">
<div class="row-fluid">
	<aui:fieldset cssClass="span6">
		
		<aui:input label="NOMBRE" name="<%=CarreraProfesionalPortletKeys.NOMBRE%>" >
			<aui:validator name="required" />
		</aui:input>
		
		<aui:input label="DESCRIPCION" name="<%=CarreraProfesionalPortletKeys.DESCRIPCION%>" >

		</aui:input>
		
		<aui:input label="FORMACION" name="<%=CarreraProfesionalPortletKeys.FORMACION%>" >
		</aui:input>
		
		<liferay-ui:message key="Duracion Fecha Inicio"  ></liferay-ui:message>
		<liferay-ui:input-date formName="date" 
		 yearValue="2010" monthValue="3" dayValue="21"
            dayParam="d1" monthParam="m1" yearParam="y1" 
            name="<%=CarreraProfesionalPortletKeys.DURACION_FECHA_INICIO%>" />
        <br/>
        <liferay-ui:message key="Duracion Fecha Fin"  ></liferay-ui:message>
        <liferay-ui:input-date formName="date" 
			 yearValue="2010" monthValue="3" dayValue="21"
            dayParam="d1" monthParam="m1" yearParam="y1"
            name="<%=CarreraProfesionalPortletKeys.DURACION_FECHA_FIN%>" />
          
		<aui:input label="ESTADO" name="<%=CarreraProfesionalPortletKeys.ESTADO%>" >
			
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