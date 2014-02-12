<%@ include file="/html/familia_profesional/init.jsp" %>

LISTADO FAMILIA

<liferay-ui:search-container>
<%   
List<FamiliaProfesional> lista=  FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionals(searchContainer.getStart(), searchContainer.getEnd());
int totalLista = FamiliaProfesionalLocalServiceUtil.getFamiliaProfesionalsCount();
%>

<%@include file="/html/familia_profesional/contenedor.jspf" %>

</liferay-ui:search-container>