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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link pe.edu.aprolab.base.service.http.InstitucionServiceSoap}.
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.base.service.http.InstitucionServiceSoap
 * @generated
 */
public class InstitucionSoap implements Serializable {
	public static InstitucionSoap toSoapModel(Institucion model) {
		InstitucionSoap soapModel = new InstitucionSoap();

		soapModel.setInstitucionId(model.getInstitucionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFormacionId(model.getFormacionId());
		soapModel.setRUC(model.getRUC());
		soapModel.setCodigoModular(model.getCodigoModular());

		return soapModel;
	}

	public static InstitucionSoap[] toSoapModels(Institucion[] models) {
		InstitucionSoap[] soapModels = new InstitucionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstitucionSoap[][] toSoapModels(Institucion[][] models) {
		InstitucionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstitucionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstitucionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstitucionSoap[] toSoapModels(List<Institucion> models) {
		List<InstitucionSoap> soapModels = new ArrayList<InstitucionSoap>(models.size());

		for (Institucion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstitucionSoap[soapModels.size()]);
	}

	public InstitucionSoap() {
	}

	public long getPrimaryKey() {
		return _institucionId;
	}

	public void setPrimaryKey(long pk) {
		setInstitucionId(pk);
	}

	public long getInstitucionId() {
		return _institucionId;
	}

	public void setInstitucionId(long institucionId) {
		_institucionId = institucionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getFormacionId() {
		return _formacionId;
	}

	public void setFormacionId(long formacionId) {
		_formacionId = formacionId;
	}

	public String getRUC() {
		return _RUC;
	}

	public void setRUC(String RUC) {
		_RUC = RUC;
	}

	public String getCodigoModular() {
		return _codigoModular;
	}

	public void setCodigoModular(String codigoModular) {
		_codigoModular = codigoModular;
	}

	private long _institucionId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _formacionId;
	private String _RUC;
	private String _codigoModular;
}