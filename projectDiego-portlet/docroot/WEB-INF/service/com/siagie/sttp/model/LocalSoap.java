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

package com.siagie.sttp.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.siagie.sttp.service.http.LocalServiceSoap}.
 *
 * @author Diego
 * @see com.siagie.sttp.service.http.LocalServiceSoap
 * @generated
 */
public class LocalSoap implements Serializable {
	public static LocalSoap toSoapModel(Local model) {
		LocalSoap soapModel = new LocalSoap();

		soapModel.setLocalId(model.getLocalId());
		soapModel.setNombre(model.getNombre());
		soapModel.setEstado(model.getEstado());

		return soapModel;
	}

	public static LocalSoap[] toSoapModels(Local[] models) {
		LocalSoap[] soapModels = new LocalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocalSoap[][] toSoapModels(Local[][] models) {
		LocalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LocalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocalSoap[] toSoapModels(List<Local> models) {
		List<LocalSoap> soapModels = new ArrayList<LocalSoap>(models.size());

		for (Local model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocalSoap[soapModels.size()]);
	}

	public LocalSoap() {
	}

	public long getPrimaryKey() {
		return _localId;
	}

	public void setPrimaryKey(long pk) {
		setLocalId(pk);
	}

	public long getLocalId() {
		return _localId;
	}

	public void setLocalId(long localId) {
		_localId = localId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public int getEstado() {
		return _estado;
	}

	public void setEstado(int estado) {
		_estado = estado;
	}

	private long _localId;
	private String _nombre;
	private int _estado;
}