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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Local}.
 * </p>
 *
 * @author Diego
 * @see Local
 * @generated
 */
public class LocalWrapper implements Local, ModelWrapper<Local> {
	public LocalWrapper(Local local) {
		_local = local;
	}

	@Override
	public Class<?> getModelClass() {
		return Local.class;
	}

	@Override
	public String getModelClassName() {
		return Local.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("localId", getLocalId());
		attributes.put("nombre", getNombre());
		attributes.put("estado", getEstado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long localId = (Long)attributes.get("localId");

		if (localId != null) {
			setLocalId(localId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Integer estado = (Integer)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}
	}

	/**
	* Returns the primary key of this local.
	*
	* @return the primary key of this local
	*/
	@Override
	public long getPrimaryKey() {
		return _local.getPrimaryKey();
	}

	/**
	* Sets the primary key of this local.
	*
	* @param primaryKey the primary key of this local
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_local.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the local ID of this local.
	*
	* @return the local ID of this local
	*/
	@Override
	public long getLocalId() {
		return _local.getLocalId();
	}

	/**
	* Sets the local ID of this local.
	*
	* @param localId the local ID of this local
	*/
	@Override
	public void setLocalId(long localId) {
		_local.setLocalId(localId);
	}

	/**
	* Returns the nombre of this local.
	*
	* @return the nombre of this local
	*/
	@Override
	public java.lang.String getNombre() {
		return _local.getNombre();
	}

	/**
	* Sets the nombre of this local.
	*
	* @param nombre the nombre of this local
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_local.setNombre(nombre);
	}

	/**
	* Returns the estado of this local.
	*
	* @return the estado of this local
	*/
	@Override
	public int getEstado() {
		return _local.getEstado();
	}

	/**
	* Sets the estado of this local.
	*
	* @param estado the estado of this local
	*/
	@Override
	public void setEstado(int estado) {
		_local.setEstado(estado);
	}

	@Override
	public boolean isNew() {
		return _local.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_local.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _local.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_local.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _local.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _local.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_local.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _local.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_local.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_local.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_local.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LocalWrapper((Local)_local.clone());
	}

	@Override
	public int compareTo(com.siagie.sttp.model.Local local) {
		return _local.compareTo(local);
	}

	@Override
	public int hashCode() {
		return _local.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.siagie.sttp.model.Local> toCacheModel() {
		return _local.toCacheModel();
	}

	@Override
	public com.siagie.sttp.model.Local toEscapedModel() {
		return new LocalWrapper(_local.toEscapedModel());
	}

	@Override
	public com.siagie.sttp.model.Local toUnescapedModel() {
		return new LocalWrapper(_local.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _local.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _local.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_local.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LocalWrapper)) {
			return false;
		}

		LocalWrapper localWrapper = (LocalWrapper)obj;

		if (Validator.equals(_local, localWrapper._local)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Local getWrappedLocal() {
		return _local;
	}

	@Override
	public Local getWrappedModel() {
		return _local;
	}

	@Override
	public void resetOriginalValues() {
		_local.resetOriginalValues();
	}

	private Local _local;
}