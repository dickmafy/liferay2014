/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package pe.edu.aprolab.base.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import pe.edu.aprolab.base.service.ClpSerializer;
import pe.edu.aprolab.base.service.FormacionLocalServiceUtil;
import pe.edu.aprolab.base.service.FormacionServiceUtil;
import pe.edu.aprolab.base.service.InstitucionLocalServiceUtil;
import pe.edu.aprolab.base.service.InstitucionServiceUtil;
import pe.edu.aprolab.base.service.LocalLocalServiceUtil;
import pe.edu.aprolab.base.service.LocalServiceUtil;

/**
 * @author Jorge Loayza Soloisolo
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			FormacionLocalServiceUtil.clearService();

			FormacionServiceUtil.clearService();
			InstitucionLocalServiceUtil.clearService();

			InstitucionServiceUtil.clearService();
			LocalLocalServiceUtil.clearService();

			LocalServiceUtil.clearService();
		}
	}
}