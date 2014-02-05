<%@page import="javax.portlet.WindowState"%>
<%@page import="com.siagie.sttp.model.Local"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.siagie.sttp.service.LocalLocalServiceUtil"%>
<%@ include file="/html/local/init.jsp" %>

LISTADOS DEEEEE1 <b>Local</b> en Marco Educativo solo listando


<liferay-ui:search-container
	total="<%=LocalLocalServiceUtil.getLocalsCount() %>"
>

<%
	PortletURL addURL = renderResponse.createRenderURL();
	addURL.setWindowState(WindowState.MAXIMIZED);
	addURL.setParameter("mvcPath", "/html/local/add.jsp");
%>
	
<aui:button-row>
<aui:button type="button" value="Agregar Local" onClick="<%= addURL.toString()%>" cssClass="btn-primary"/>
</aui:button-row>
        
        
<% 
//interfaz de modelo  , 
List<Local> misLocales=  LocalLocalServiceUtil.getLocals(searchContainer.getStart(), searchContainer.getEnd());

%>
	<liferay-ui:search-container-results
		results="<%=misLocales %>"
	/>
	<liferay-ui:search-container-row
		className="com.siagie.sttp.model.Local"
		keyProperty="localId"
	 >
		<liferay-ui:search-container-column-text
			name="CODIGO"
			property="localId"
			valign="top"
		/>

		<liferay-ui:search-container-column-text
			name="NOMBRE"
			property="nombre"
			valign="top"
		>
		
		</liferay-ui:search-container-column-text>

		
	
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

END 