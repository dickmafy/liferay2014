package com.siagie.sttp.porlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.siagie.sttp.model.impl.LocalImpl;

public class LocalPorlet extends MVCPortlet{
	
	
	
	
	public void miFunction(LocalImpl local) throws IOException, PortletException {
		
		System.out.println(local.getNombre());
		
		
		
		
	}


}
