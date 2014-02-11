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


<%@ include file="/html/familia_profesional/init.jsp" %>

<portlet:actionURL var="addFamilia" name="addFamilia" />

<portlet:renderURL var="redirectURL" windowState="<%=WindowState.NORMAL.toString()%>" />
<strong><liferay-ui:message key="Registrar Familia Profesional" /></strong>


<aui:form name="addNuevoLocal" action="<%=addFamilia%>" method="post">
<div class="row-fluid">
	<aui:fieldset cssClass="span6">
		
		<aui:input label="NOMBRE" name="<%=FamiliaProfesionalPortletKeys.NOMBRE%>" >
			<aui:validator name="required" />
		</aui:input>
		
		<aui:input label="DESCRIPCION" name="<%=FamiliaProfesionalPortletKeys.DESCRIPCION%>" >

		</aui:input>
		
		<aui:input label="SECTOR" name="<%=FamiliaProfesionalPortletKeys.SECTOR%>" >
			
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