<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:p="http://primefaces.org/ui"
	xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:h="http://java.sun.com/jsf/html"	
	xmlns:f="http://java.sun.com/jsf/core">

<f:view contentType="text/html">
<h:head>   
	<meta http-equiv="X-UA-Compatible" content="EmulateIE8" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="web_author" content="APROLAB II" />
	<meta name="copyright" content="2013, PROYECTO APROLAB II" />	
	<link type="text/css" rel="stylesheet" href="#{request.contextPath}/recursos/estilos/index.css" />	
	
	
</h:head>
<h:body>
	<p:layout fullPage="true">  
  
  		<p:layoutUnit id="tmp_header" position="north" size="130">  	
  		
  		<table width="100%" cellpadding="0" cellspacing="0" style="border:2px white solid;">
		<tr>	
			<td width="320px">
			<img src="#{request.contextPath}/recursos/imagenes/sicad_1.png"/>
			</td>
			<td style="background:#59585d; background-repeat:repeat-x;">�
			<img src="#{request.contextPath}/recursos/imagenes/sicad_2.png"/>
			</td>
		</tr>
		</table>
  		
	    <h:form>
		<p:menubar autoDisplay="false" style="border:3px #393c8a solid; background: #393c8a; color:white">
			<p:submenu id="mnuUsr" label="Mi Cuenta">
	   			<p:menuitem url="#" value="#{usuarioSesion.ultimoAcceso}" style="color:black !important;" title="Fecha Ultima de Acceso"/>
	   			<p:menuitem value="Actualizar Datos" action="usr_pas" actionListener="#{usuarioController.optionCleanPasswords}" icon="session_password"  style="color:black !important;" ajax="false"/>
				<p:menuitem value="Actualizar Clave" action="usr_pas" actionListener="#{usuarioController.optionCleanPasswords}" icon="session_password"  style="color:black !important;" ajax="false"/>  
	            <p:separator/>  
	       		<p:menuitem value="�Cerrar Sesi�n" action="login" actionListener="#{loginController.logout}" icon="session_logout" ajax="false" style="color:black !important;"/>
	        </p:submenu>
	      	<c:forEach items="#{opcionController.modulos}" var="modulo"> 
		   		<p:menuitem id="mnu_#{modulo.id}" value="#{modulo.titulo}" actionListener="#{opcionController.processAction}" style="#{opcionController.moduloSelected eq modulo.id ? 'color:#87CEEB !important;':'' }" ajax="false"/>  
	       	</c:forEach>	       	  
    		
        </p:menubar>  
    	</h:form>
	    </p:layoutUnit>  
	  
	    <p:layoutUnit id="tmp_menu" position="west" size="178" header="Menus" collapsible="true">  
	  	<h:form>
	       <p:menu style="border:none;">  
           	<c:forEach items="#{opcionController.menus}" var="menu">
		   		<p:menuitem id="mnu_#{menu.id}" value="#{menu.titulo}"  actionListener="#{opcionController.processAction}" style="#{opcionController.menuSelected eq menu.id ? 'color:blue !important;':'color:black !important;' }" ajax="false"/>  
	       	</c:forEach>
	    	</p:menu>
	    </h:form>
	    </p:layoutUnit>  
	  
	    <p:layoutUnit id="tmp_body" position="center" style="background:white;">
	     	<ui:insert name="body"/>
	    </p:layoutUnit>
	    
	    <p:layoutUnit id="tmp_footer" position="south" size="32">  
	        <h:outputText value="� Derechos Reservados 2013 - APROLAB II" />  
	    </p:layoutUnit>    
  
	</p:layout>	
</h:body>
</f:view>
</html>
