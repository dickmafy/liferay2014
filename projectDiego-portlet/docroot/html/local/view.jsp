<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<portlet:defineObjects />

LISTADOS DE <b>Local</b> en Marco Educativo

<%
PortletURL updateBookURL = renderResponse.createActionURL();
updateBookURL.setParameter(
ActionRequest.ACTION_NAME, "updateBook");
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateBookURL.toString() %>">
Local nombre: <input type="text" name="<portlet:namespace/>nombre" />
<br/>Estado: <input type="text" name="<portlet:namespace/>estado" />
<br/><input type="submit" value="Guardar" />
</form>
