<%@page import="com.siagie.sttp.model.Local"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.siagie.sttp.service.LocalLocalServiceUtil"%>
<%@ include file="/html/local/init.jsp" %>

LISTADOS DEEEEE1 <b>Local</b> en Marco Educativo solo listando
BEGIN



<jsp:useBean id="localBean" class="com.siagie.sttp.model.impl.LocalImpl" scope="request"  >
</jsp:useBean>


<form 
method="post"	action=<portlet:actionURL name="miFunction"/>
>
<br/>Nomber: <input type="text" name="nombre"  />
<br/>Estado: <input type="text" name="estado" />
<br/><input type="submit" value="Guardar" />
</form>



<liferay-ui:search-container
	total="<%=LocalLocalServiceUtil.getLocalsCount() %>"
>
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