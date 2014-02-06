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

package pe.edu.aprolab.identidad.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Persona service. Represents a row in the &quot;ID_Persona&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jorge Loayza Soloisolo
 * @see PersonaModel
 * @see pe.edu.aprolab.identidad.model.impl.PersonaImpl
 * @see pe.edu.aprolab.identidad.model.impl.PersonaModelImpl
 * @generated
 */
public interface Persona extends PersonaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link pe.edu.aprolab.identidad.model.impl.PersonaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.liferay.portal.model.User getUser()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}