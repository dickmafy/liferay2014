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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Formacion}.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see Formacion
 * @generated
 */
public class FormacionWrapper implements Formacion, ModelWrapper<Formacion> {
	public FormacionWrapper(Formacion formacion) {
		_formacion = formacion;
	}

	@Override
	public Class<?> getModelClass() {
		return Formacion.class;
	}

	@Override
	public String getModelClassName() {
		return Formacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("formacionId", getFormacionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long formacionId = (Long)attributes.get("formacionId");

		if (formacionId != null) {
			setFormacionId(formacionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this formacion.
	*
	* @return the primary key of this formacion
	*/
	@Override
	public long getPrimaryKey() {
		return _formacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this formacion.
	*
	* @param primaryKey the primary key of this formacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_formacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the formacion ID of this formacion.
	*
	* @return the formacion ID of this formacion
	*/
	@Override
	public long getFormacionId() {
		return _formacion.getFormacionId();
	}

	/**
	* Sets the formacion ID of this formacion.
	*
	* @param formacionId the formacion ID of this formacion
	*/
	@Override
	public void setFormacionId(long formacionId) {
		_formacion.setFormacionId(formacionId);
	}

	/**
	* Returns the company ID of this formacion.
	*
	* @return the company ID of this formacion
	*/
	@Override
	public long getCompanyId() {
		return _formacion.getCompanyId();
	}

	/**
	* Sets the company ID of this formacion.
	*
	* @param companyId the company ID of this formacion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_formacion.setCompanyId(companyId);
	}

	/**
	* Returns the nombre of this formacion.
	*
	* @return the nombre of this formacion
	*/
	@Override
	public java.lang.String getNombre() {
		return _formacion.getNombre();
	}

	/**
	* Sets the nombre of this formacion.
	*
	* @param nombre the nombre of this formacion
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_formacion.setNombre(nombre);
	}

	@Override
	public boolean isNew() {
		return _formacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_formacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _formacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_formacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _formacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _formacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_formacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _formacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_formacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_formacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_formacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FormacionWrapper((Formacion)_formacion.clone());
	}

	@Override
	public int compareTo(pe.edu.aprolab.base.model.Formacion formacion) {
		return _formacion.compareTo(formacion);
	}

	@Override
	public int hashCode() {
		return _formacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<pe.edu.aprolab.base.model.Formacion> toCacheModel() {
		return _formacion.toCacheModel();
	}

	@Override
	public pe.edu.aprolab.base.model.Formacion toEscapedModel() {
		return new FormacionWrapper(_formacion.toEscapedModel());
	}

	@Override
	public pe.edu.aprolab.base.model.Formacion toUnescapedModel() {
		return new FormacionWrapper(_formacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _formacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _formacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_formacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FormacionWrapper)) {
			return false;
		}

		FormacionWrapper formacionWrapper = (FormacionWrapper)obj;

		if (Validator.equals(_formacion, formacionWrapper._formacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Formacion getWrappedFormacion() {
		return _formacion;
	}

	@Override
	public Formacion getWrappedModel() {
		return _formacion;
	}

	@Override
	public void resetOriginalValues() {
		_formacion.resetOriginalValues();
	}

	private Formacion _formacion;
}