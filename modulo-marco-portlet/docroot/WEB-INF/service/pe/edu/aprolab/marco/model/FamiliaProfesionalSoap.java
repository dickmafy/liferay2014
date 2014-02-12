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

package pe.edu.aprolab.marco.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Diego
 * @generated
 */
public class FamiliaProfesionalSoap implements Serializable {
	public static FamiliaProfesionalSoap toSoapModel(FamiliaProfesional model) {
		FamiliaProfesionalSoap soapModel = new FamiliaProfesionalSoap();

		soapModel.setFamiliaProfesionalId(model.getFamiliaProfesionalId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setSector(model.getSector());
		soapModel.setEstado(model.getEstado());

		return soapModel;
	}

	public static FamiliaProfesionalSoap[] toSoapModels(
		FamiliaProfesional[] models) {
		FamiliaProfesionalSoap[] soapModels = new FamiliaProfesionalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FamiliaProfesionalSoap[][] toSoapModels(
		FamiliaProfesional[][] models) {
		FamiliaProfesionalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FamiliaProfesionalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FamiliaProfesionalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FamiliaProfesionalSoap[] toSoapModels(
		List<FamiliaProfesional> models) {
		List<FamiliaProfesionalSoap> soapModels = new ArrayList<FamiliaProfesionalSoap>(models.size());

		for (FamiliaProfesional model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FamiliaProfesionalSoap[soapModels.size()]);
	}

	public FamiliaProfesionalSoap() {
	}

	public long getPrimaryKey() {
		return _familiaProfesionalId;
	}

	public void setPrimaryKey(long pk) {
		setFamiliaProfesionalId(pk);
	}

	public long getFamiliaProfesionalId() {
		return _familiaProfesionalId;
	}

	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesionalId = familiaProfesionalId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public int getSector() {
		return _sector;
	}

	public void setSector(int sector) {
		_sector = sector;
	}

	public int getEstado() {
		return _estado;
	}

	public void setEstado(int estado) {
		_estado = estado;
	}

	private long _familiaProfesionalId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _descripcion;
	private int _sector;
	private int _estado;
}