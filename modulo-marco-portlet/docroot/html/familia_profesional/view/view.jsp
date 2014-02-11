<%@ include file="/html/familia_profesional/init.jsp" %>

LISTADO FAMILIA

<liferay-ui:search-container>
<%  
List<FamiliaProfesional> misFamilias=  FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionals(searchContainer.getStart(), searchContainer.getEnd());
int totalFamilia = FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionalsCount();
%>

<%@include file="/html/familia_profesional/contenedor.jspf" %>

</liferay-ui:search-container>