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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link pe.edu.aprolab.identidad.service.http.PersonaServiceSoap}.
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.identidad.service.http.PersonaServiceSoap
 * @generated
 */
public class PersonaSoap implements Serializable {
	public static PersonaSoap toSoapModel(Persona model) {
		PersonaSoap soapModel = new PersonaSoap();

		soapModel.setPersonaId(model.getPersonaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCodigoId(model.getCodigoId());
		soapModel.setNombres(model.getNombres());
		soapModel.setApellidoPaterno(model.getApellidoPaterno());
		soapModel.setApellidoMaterno(model.getApellidoMaterno());
		soapModel.setGenero(model.getGenero());
		soapModel.setEstadoCivil(model.getEstadoCivil());
		soapModel.setFechaNacimiento(model.getFechaNacimiento());
		soapModel.setUbigeoNacimiento(model.getUbigeoNacimiento());

		return soapModel;
	}

	public static PersonaSoap[] toSoapModels(Persona[] models) {
		PersonaSoap[] soapModels = new PersonaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersonaSoap[][] toSoapModels(Persona[][] models) {
		PersonaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PersonaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersonaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersonaSoap[] toSoapModels(List<Persona> models) {
		List<PersonaSoap> soapModels = new ArrayList<PersonaSoap>(models.size());

		for (Persona model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PersonaSoap[soapModels.size()]);
	}

	public PersonaSoap() {
	}

	public long getPrimaryKey() {
		return _personaId;
	}

	public void setPrimaryKey(long pk) {
		setPersonaId(pk);
	}

	public long getPersonaId() {
		return _personaId;
	}

	public void setPersonaId(long personaId) {
		_personaId = personaId;
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

	public String getCodigoId() {
		return _codigoId;
	}

	public void setCodigoId(String codigoId) {
		_codigoId = codigoId;
	}

	public String getNombres() {
		return _nombres;
	}

	public void setNombres(String nombres) {
		_nombres = nombres;
	}

	public String getApellidoPaterno() {
		return _apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		_apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return _apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		_apellidoMaterno = apellidoMaterno;
	}

	public boolean getGenero() {
		return _genero;
	}

	public boolean isGenero() {
		return _genero;
	}

	public void setGenero(boolean genero) {
		_genero = genero;
	}

	public int getEstadoCivil() {
		return _estadoCivil;
	}

	public void setEstadoCivil(int estadoCivil) {
		_estadoCivil = estadoCivil;
	}

	public Date getFechaNacimiento() {
		return _fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		_fechaNacimiento = fechaNacimiento;
	}

	public String getUbigeoNacimiento() {
		return _ubigeoNacimiento;
	}

	public void setUbigeoNacimiento(String ubigeoNacimiento) {
		_ubigeoNacimiento = ubigeoNacimiento;
	}

	private long _personaId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _codigoId;
	private String _nombres;
	private String _apellidoPaterno;
	private String _apellidoMaterno;
	private boolean _genero;
	private int _estadoCivil;
	private Date _fechaNacimiento;
	private String _ubigeoNacimiento;
}