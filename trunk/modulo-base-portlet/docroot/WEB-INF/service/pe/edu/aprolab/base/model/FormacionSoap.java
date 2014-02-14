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

package pe.edu.aprolab.base.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link pe.edu.aprolab.base.service.http.FormacionServiceSoap}.
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.base.service.http.FormacionServiceSoap
 * @generated
 */
public class FormacionSoap implements Serializable {
	public static FormacionSoap toSoapModel(Formacion model) {
		FormacionSoap soapModel = new FormacionSoap();

		soapModel.setFormacionId(model.getFormacionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static FormacionSoap[] toSoapModels(Formacion[] models) {
		FormacionSoap[] soapModels = new FormacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FormacionSoap[][] toSoapModels(Formacion[][] models) {
		FormacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FormacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FormacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FormacionSoap[] toSoapModels(List<Formacion> models) {
		List<FormacionSoap> soapModels = new ArrayList<FormacionSoap>(models.size());

		for (Formacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FormacionSoap[soapModels.size()]);
	}

	public FormacionSoap() {
	}

	public long getPrimaryKey() {
		return _formacionId;
	}

	public void setPrimaryKey(long pk) {
		setFormacionId(pk);
	}

	public long getFormacionId() {
		return _formacionId;
	}

	public void setFormacionId(long formacionId) {
		_formacionId = formacionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	private long _formacionId;
	private long _companyId;
	private String _nombre;
}