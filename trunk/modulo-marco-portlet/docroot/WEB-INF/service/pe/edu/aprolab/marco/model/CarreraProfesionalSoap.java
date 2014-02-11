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
public class CarreraProfesionalSoap implements Serializable {
	public static CarreraProfesionalSoap toSoapModel(CarreraProfesional model) {
		CarreraProfesionalSoap soapModel = new CarreraProfesionalSoap();

		soapModel.setCarreraProfesionalorId(model.getCarreraProfesionalorId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFamiliaProfesionalId(model.getFamiliaProfesionalId());
		soapModel.setFormacion(model.getFormacion());
		soapModel.setNombre(model.getNombre());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setDuracionFechaInicio(model.getDuracionFechaInicio());
		soapModel.setDuracionFechaFin(model.getDuracionFechaFin());
		soapModel.setEstado(model.getEstado());

		return soapModel;
	}

	public static CarreraProfesionalSoap[] toSoapModels(
		CarreraProfesional[] models) {
		CarreraProfesionalSoap[] soapModels = new CarreraProfesionalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CarreraProfesionalSoap[][] toSoapModels(
		CarreraProfesional[][] models) {
		CarreraProfesionalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CarreraProfesionalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CarreraProfesionalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CarreraProfesionalSoap[] toSoapModels(
		List<CarreraProfesional> models) {
		List<CarreraProfesionalSoap> soapModels = new ArrayList<CarreraProfesionalSoap>(models.size());

		for (CarreraProfesional model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CarreraProfesionalSoap[soapModels.size()]);
	}

	public CarreraProfesionalSoap() {
	}

	public long getPrimaryKey() {
		return _carreraProfesionalorId;
	}

	public void setPrimaryKey(long pk) {
		setCarreraProfesionalorId(pk);
	}

	public long getCarreraProfesionalorId() {
		return _carreraProfesionalorId;
	}

	public void setCarreraProfesionalorId(long carreraProfesionalorId) {
		_carreraProfesionalorId = carreraProfesionalorId;
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

	public long getFamiliaProfesionalId() {
		return _familiaProfesionalId;
	}

	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesionalId = familiaProfesionalId;
	}

	public int getFormacion() {
		return _formacion;
	}

	public void setFormacion(int formacion) {
		_formacion = formacion;
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

	public Date getDuracionFechaInicio() {
		return _duracionFechaInicio;
	}

	public void setDuracionFechaInicio(Date duracionFechaInicio) {
		_duracionFechaInicio = duracionFechaInicio;
	}

	public Date getDuracionFechaFin() {
		return _duracionFechaFin;
	}

	public void setDuracionFechaFin(Date duracionFechaFin) {
		_duracionFechaFin = duracionFechaFin;
	}

	public int getEstado() {
		return _estado;
	}

	public void setEstado(int estado) {
		_estado = estado;
	}

	private long _carreraProfesionalorId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _familiaProfesionalId;
	private int _formacion;
	private String _nombre;
	private String _descripcion;
	private Date _duracionFechaInicio;
	private Date _duracionFechaFin;
	private int _estado;
}