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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Persona}.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see Persona
 * @generated
 */
public class PersonaWrapper implements Persona, ModelWrapper<Persona> {
	public PersonaWrapper(Persona persona) {
		_persona = persona;
	}

	@Override
	public Class<?> getModelClass() {
		return Persona.class;
	}

	@Override
	public String getModelClassName() {
		return Persona.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("personaId", getPersonaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("codigoId", getCodigoId());
		attributes.put("nombres", getNombres());
		attributes.put("apellidoPaterno", getApellidoPaterno());
		attributes.put("apellidoMaterno", getApellidoMaterno());
		attributes.put("genero", getGenero());
		attributes.put("estadoCivil", getEstadoCivil());
		attributes.put("fechaNacimiento", getFechaNacimiento());
		attributes.put("ubigeoNacimiento", getUbigeoNacimiento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long personaId = (Long)attributes.get("personaId");

		if (personaId != null) {
			setPersonaId(personaId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String codigoId = (String)attributes.get("codigoId");

		if (codigoId != null) {
			setCodigoId(codigoId);
		}

		String nombres = (String)attributes.get("nombres");

		if (nombres != null) {
			setNombres(nombres);
		}

		String apellidoPaterno = (String)attributes.get("apellidoPaterno");

		if (apellidoPaterno != null) {
			setApellidoPaterno(apellidoPaterno);
		}

		String apellidoMaterno = (String)attributes.get("apellidoMaterno");

		if (apellidoMaterno != null) {
			setApellidoMaterno(apellidoMaterno);
		}

		Boolean genero = (Boolean)attributes.get("genero");

		if (genero != null) {
			setGenero(genero);
		}

		Integer estadoCivil = (Integer)attributes.get("estadoCivil");

		if (estadoCivil != null) {
			setEstadoCivil(estadoCivil);
		}

		Date fechaNacimiento = (Date)attributes.get("fechaNacimiento");

		if (fechaNacimiento != null) {
			setFechaNacimiento(fechaNacimiento);
		}

		String ubigeoNacimiento = (String)attributes.get("ubigeoNacimiento");

		if (ubigeoNacimiento != null) {
			setUbigeoNacimiento(ubigeoNacimiento);
		}
	}

	/**
	* Returns the primary key of this persona.
	*
	* @return the primary key of this persona
	*/
	@Override
	public long getPrimaryKey() {
		return _persona.getPrimaryKey();
	}

	/**
	* Sets the primary key of this persona.
	*
	* @param primaryKey the primary key of this persona
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_persona.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the persona ID of this persona.
	*
	* @return the persona ID of this persona
	*/
	@Override
	public long getPersonaId() {
		return _persona.getPersonaId();
	}

	/**
	* Sets the persona ID of this persona.
	*
	* @param personaId the persona ID of this persona
	*/
	@Override
	public void setPersonaId(long personaId) {
		_persona.setPersonaId(personaId);
	}

	/**
	* Returns the company ID of this persona.
	*
	* @return the company ID of this persona
	*/
	@Override
	public long getCompanyId() {
		return _persona.getCompanyId();
	}

	/**
	* Sets the company ID of this persona.
	*
	* @param companyId the company ID of this persona
	*/
	@Override
	public void setCompanyId(long companyId) {
		_persona.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this persona.
	*
	* @return the create date of this persona
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _persona.getCreateDate();
	}

	/**
	* Sets the create date of this persona.
	*
	* @param createDate the create date of this persona
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_persona.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this persona.
	*
	* @return the modified date of this persona
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _persona.getModifiedDate();
	}

	/**
	* Sets the modified date of this persona.
	*
	* @param modifiedDate the modified date of this persona
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_persona.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the codigo ID of this persona.
	*
	* @return the codigo ID of this persona
	*/
	@Override
	public java.lang.String getCodigoId() {
		return _persona.getCodigoId();
	}

	/**
	* Sets the codigo ID of this persona.
	*
	* @param codigoId the codigo ID of this persona
	*/
	@Override
	public void setCodigoId(java.lang.String codigoId) {
		_persona.setCodigoId(codigoId);
	}

	/**
	* Returns the nombres of this persona.
	*
	* @return the nombres of this persona
	*/
	@Override
	public java.lang.String getNombres() {
		return _persona.getNombres();
	}

	/**
	* Sets the nombres of this persona.
	*
	* @param nombres the nombres of this persona
	*/
	@Override
	public void setNombres(java.lang.String nombres) {
		_persona.setNombres(nombres);
	}

	/**
	* Returns the apellido paterno of this persona.
	*
	* @return the apellido paterno of this persona
	*/
	@Override
	public java.lang.String getApellidoPaterno() {
		return _persona.getApellidoPaterno();
	}

	/**
	* Sets the apellido paterno of this persona.
	*
	* @param apellidoPaterno the apellido paterno of this persona
	*/
	@Override
	public void setApellidoPaterno(java.lang.String apellidoPaterno) {
		_persona.setApellidoPaterno(apellidoPaterno);
	}

	/**
	* Returns the apellido materno of this persona.
	*
	* @return the apellido materno of this persona
	*/
	@Override
	public java.lang.String getApellidoMaterno() {
		return _persona.getApellidoMaterno();
	}

	/**
	* Sets the apellido materno of this persona.
	*
	* @param apellidoMaterno the apellido materno of this persona
	*/
	@Override
	public void setApellidoMaterno(java.lang.String apellidoMaterno) {
		_persona.setApellidoMaterno(apellidoMaterno);
	}

	/**
	* Returns the genero of this persona.
	*
	* @return the genero of this persona
	*/
	@Override
	public boolean getGenero() {
		return _persona.getGenero();
	}

	/**
	* Returns <code>true</code> if this persona is genero.
	*
	* @return <code>true</code> if this persona is genero; <code>false</code> otherwise
	*/
	@Override
	public boolean isGenero() {
		return _persona.isGenero();
	}

	/**
	* Sets whether this persona is genero.
	*
	* @param genero the genero of this persona
	*/
	@Override
	public void setGenero(boolean genero) {
		_persona.setGenero(genero);
	}

	/**
	* Returns the estado civil of this persona.
	*
	* @return the estado civil of this persona
	*/
	@Override
	public int getEstadoCivil() {
		return _persona.getEstadoCivil();
	}

	/**
	* Sets the estado civil of this persona.
	*
	* @param estadoCivil the estado civil of this persona
	*/
	@Override
	public void setEstadoCivil(int estadoCivil) {
		_persona.setEstadoCivil(estadoCivil);
	}

	/**
	* Returns the fecha nacimiento of this persona.
	*
	* @return the fecha nacimiento of this persona
	*/
	@Override
	public java.util.Date getFechaNacimiento() {
		return _persona.getFechaNacimiento();
	}

	/**
	* Sets the fecha nacimiento of this persona.
	*
	* @param fechaNacimiento the fecha nacimiento of this persona
	*/
	@Override
	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		_persona.setFechaNacimiento(fechaNacimiento);
	}

	/**
	* Returns the ubigeo nacimiento of this persona.
	*
	* @return the ubigeo nacimiento of this persona
	*/
	@Override
	public java.lang.String getUbigeoNacimiento() {
		return _persona.getUbigeoNacimiento();
	}

	/**
	* Sets the ubigeo nacimiento of this persona.
	*
	* @param ubigeoNacimiento the ubigeo nacimiento of this persona
	*/
	@Override
	public void setUbigeoNacimiento(java.lang.String ubigeoNacimiento) {
		_persona.setUbigeoNacimiento(ubigeoNacimiento);
	}

	@Override
	public boolean isNew() {
		return _persona.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_persona.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _persona.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_persona.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _persona.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _persona.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_persona.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _persona.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_persona.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_persona.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_persona.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PersonaWrapper((Persona)_persona.clone());
	}

	@Override
	public int compareTo(pe.edu.aprolab.identidad.model.Persona persona) {
		return _persona.compareTo(persona);
	}

	@Override
	public int hashCode() {
		return _persona.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<pe.edu.aprolab.identidad.model.Persona> toCacheModel() {
		return _persona.toCacheModel();
	}

	@Override
	public pe.edu.aprolab.identidad.model.Persona toEscapedModel() {
		return new PersonaWrapper(_persona.toEscapedModel());
	}

	@Override
	public pe.edu.aprolab.identidad.model.Persona toUnescapedModel() {
		return new PersonaWrapper(_persona.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _persona.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _persona.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_persona.persist();
	}

	@Override
	public com.liferay.portal.model.User getUser()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _persona.getUser();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PersonaWrapper)) {
			return false;
		}

		PersonaWrapper personaWrapper = (PersonaWrapper)obj;

		if (Validator.equals(_persona, personaWrapper._persona)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Persona getWrappedPersona() {
		return _persona;
	}

	@Override
	public Persona getWrappedModel() {
		return _persona;
	}

	@Override
	public void resetOriginalValues() {
		_persona.resetOriginalValues();
	}

	private Persona _persona;
}