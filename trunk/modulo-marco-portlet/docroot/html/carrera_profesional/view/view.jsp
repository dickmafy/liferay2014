<%@ include file="/html/carrera_profesional/init.jsp" %>
LISTADO CARRERA PROFESIONAL
  <liferay-ui:search-container>      
<% 
List<CarreraProfesional> lista= CarreraProfesionalLocalServiceUtil.getCarreraProfesionals(searchContainer.getStart(), searchContainer.getEnd());
int totalObjeto = CarreraProfesionalLocalServiceUtil.getCarreraProfesionalsCount();
%>

<%@include file="/html/carrera_profesional/contenedor.jspf" %>

</liferay-ui:search-container>