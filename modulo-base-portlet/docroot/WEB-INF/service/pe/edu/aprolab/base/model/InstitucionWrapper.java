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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Institucion}.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see Institucion
 * @generated
 */
public class InstitucionWrapper implements Institucion,
	ModelWrapper<Institucion> {
	public InstitucionWrapper(Institucion institucion) {
		_institucion = institucion;
	}

	@Override
	public Class<?> getModelClass() {
		return Institucion.class;
	}

	@Override
	public String getModelClassName() {
		return Institucion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("institucionId", getInstitucionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("codigoId", getCodigoId());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long institucionId = (Long)attributes.get("institucionId");

		if (institucionId != null) {
			setInstitucionId(institucionId);
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

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this institucion.
	*
	* @return the primary key of this institucion
	*/
	@Override
	public long getPrimaryKey() {
		return _institucion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this institucion.
	*
	* @param primaryKey the primary key of this institucion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_institucion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the institucion ID of this institucion.
	*
	* @return the institucion ID of this institucion
	*/
	@Override
	public long getInstitucionId() {
		return _institucion.getInstitucionId();
	}

	/**
	* Sets the institucion ID of this institucion.
	*
	* @param institucionId the institucion ID of this institucion
	*/
	@Override
	public void setInstitucionId(long institucionId) {
		_institucion.setInstitucionId(institucionId);
	}

	/**
	* Returns the company ID of this institucion.
	*
	* @return the company ID of this institucion
	*/
	@Override
	public long getCompanyId() {
		return _institucion.getCompanyId();
	}

	/**
	* Sets the company ID of this institucion.
	*
	* @param companyId the company ID of this institucion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_institucion.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this institucion.
	*
	* @return the create date of this institucion
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _institucion.getCreateDate();
	}

	/**
	* Sets the create date of this institucion.
	*
	* @param createDate the create date of this institucion
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_institucion.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this institucion.
	*
	* @return the modified date of this institucion
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _institucion.getModifiedDate();
	}

	/**
	* Sets the modified date of this institucion.
	*
	* @param modifiedDate the modified date of this institucion
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_institucion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the codigo ID of this institucion.
	*
	* @return the codigo ID of this institucion
	*/
	@Override
	public java.lang.String getCodigoId() {
		return _institucion.getCodigoId();
	}

	/**
	* Sets the codigo ID of this institucion.
	*
	* @param codigoId the codigo ID of this institucion
	*/
	@Override
	public void setCodigoId(java.lang.String codigoId) {
		_institucion.setCodigoId(codigoId);
	}

	/**
	* Returns the nombre of this institucion.
	*
	* @return the nombre of this institucion
	*/
	@Override
	public java.lang.String getNombre() {
		return _institucion.getNombre();
	}

	/**
	* Sets the nombre of this institucion.
	*
	* @param nombre the nombre of this institucion
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_institucion.setNombre(nombre);
	}

	@Override
	public boolean isNew() {
		return _institucion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_institucion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _institucion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_institucion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _institucion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _institucion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_institucion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _institucion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_institucion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_institucion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_institucion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InstitucionWrapper((Institucion)_institucion.clone());
	}

	@Override
	public int compareTo(Institucion institucion) {
		return _institucion.compareTo(institucion);
	}

	@Override
	public int hashCode() {
		return _institucion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Institucion> toCacheModel() {
		return _institucion.toCacheModel();
	}

	@Override
	public Institucion toEscapedModel() {
		return new InstitucionWrapper(_institucion.toEscapedModel());
	}

	@Override
	public Institucion toUnescapedModel() {
		return new InstitucionWrapper(_institucion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _institucion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _institucion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_institucion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstitucionWrapper)) {
			return false;
		}

		InstitucionWrapper institucionWrapper = (InstitucionWrapper)obj;

		if (Validator.equals(_institucion, institucionWrapper._institucion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Institucion getWrappedInstitucion() {
		return _institucion;
	}

	@Override
	public Institucion getWrappedModel() {
		return _institucion;
	}

	@Override
	public void resetOriginalValues() {
		_institucion.resetOriginalValues();
	}

	private Institucion _institucion;
}