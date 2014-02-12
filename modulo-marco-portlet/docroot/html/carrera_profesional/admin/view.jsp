<%@ include file="/html/carrera_profesional/init.jsp" %>

LISTADO CARRERA PROFESIONAL

<%
	PortletURL addURL = renderResponse.createRenderURL();
	//addURL.setWindowState(WindowState.MAXIMIZED);
	addURL.setParameter("mvcPath", "/html/carrera_profesional/admin/edit.jsp");
%>

<aui:button-row>
	<aui:button type="button" value="Agregar Carrera Profesional" onClick="<%= addURL.toString()%>" cssClass="btn-primary"/>
</aui:button-row>
 <liferay-ui:search-container>      
<% 
List<CarreraProfesional> lista= CarreraProfesionalLocalServiceUtil.getCarreraProfesionals(searchContainer.getStart(), searchContainer.getEnd());
int totalLista = CarreraProfesionalLocalServiceUtil.getCarreraProfesionalsCount();
%>
	
<%@include file="/html/carrera_profesional/contenedor.jspf" %>

</liferay-ui:search-container>