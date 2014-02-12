
<%@ include file="/html/familia_profesional/init.jsp" %>
LISTADO FAMILIA
<% 
	PortletURL addURL = renderResponse.createRenderURL(); 
	//addURL.setWindowState(WindowState.MAXIMIZED);
	addURL.setParameter("mvcPath", "/html/familia_profesional/admin/edit.jsp");
%>
	
<aui:button-row>
	<aui:button type="button" value="Agregar Familia" onClick="<%= addURL.toString()%>" cssClass="btn-primary"/>
</aui:button-row>
  
 <liferay-ui:search-container>      
<% 
List<FamiliaProfesional> lista=  FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionals(searchContainer.getStart(), searchContainer.getEnd());
int totalLista = FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionalsCount();
%>
	
<%@include file="/html/familia_profesional/contenedor.jspf" %>

</liferay-ui:search-container>