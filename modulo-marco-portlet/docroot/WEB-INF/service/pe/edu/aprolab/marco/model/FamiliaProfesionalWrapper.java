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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FamiliaProfesional}.
 * </p>
 *
 * @author Diego
 * @see FamiliaProfesional
 * @generated
 */
public class FamiliaProfesionalWrapper implements FamiliaProfesional,
	ModelWrapper<FamiliaProfesional> {
	public FamiliaProfesionalWrapper(FamiliaProfesional familiaProfesional) {
		_familiaProfesional = familiaProfesional;
	}

	@Override
	public Class<?> getModelClass() {
		return FamiliaProfesional.class;
	}

	@Override
	public String getModelClassName() {
		return FamiliaProfesional.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("familiaProfesionalId", getFamiliaProfesionalId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("descripcion", getDescripcion());
		attributes.put("sector", getSector());
		attributes.put("estado", getEstado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long familiaProfesionalId = (Long)attributes.get("familiaProfesionalId");

		if (familiaProfesionalId != null) {
			setFamiliaProfesionalId(familiaProfesionalId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Integer sector = (Integer)attributes.get("sector");

		if (sector != null) {
			setSector(sector);
		}

		Integer estado = (Integer)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}
	}

	/**
	* Returns the primary key of this familia profesional.
	*
	* @return the primary key of this familia profesional
	*/
	@Override
	public long getPrimaryKey() {
		return _familiaProfesional.getPrimaryKey();
	}

	/**
	* Sets the primary key of this familia profesional.
	*
	* @param primaryKey the primary key of this familia profesional
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_familiaProfesional.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the familia profesional ID of this familia profesional.
	*
	* @return the familia profesional ID of this familia profesional
	*/
	@Override
	public long getFamiliaProfesionalId() {
		return _familiaProfesional.getFamiliaProfesionalId();
	}

	/**
	* Sets the familia profesional ID of this familia profesional.
	*
	* @param familiaProfesionalId the familia profesional ID of this familia profesional
	*/
	@Override
	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesional.setFamiliaProfesionalId(familiaProfesionalId);
	}

	/**
	* Returns the company ID of this familia profesional.
	*
	* @return the company ID of this familia profesional
	*/
	@Override
	public long getCompanyId() {
		return _familiaProfesional.getCompanyId();
	}

	/**
	* Sets the company ID of this familia profesional.
	*
	* @param companyId the company ID of this familia profesional
	*/
	@Override
	public void setCompanyId(long companyId) {
		_familiaProfesional.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this familia profesional.
	*
	* @return the user ID of this familia profesional
	*/
	@Override
	public long getUserId() {
		return _familiaProfesional.getUserId();
	}

	/**
	* Sets the user ID of this familia profesional.
	*
	* @param userId the user ID of this familia profesional
	*/
	@Override
	public void setUserId(long userId) {
		_familiaProfesional.setUserId(userId);
	}

	/**
	* Returns the user uuid of this familia profesional.
	*
	* @return the user uuid of this familia profesional
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesional.getUserUuid();
	}

	/**
	* Sets the user uuid of this familia profesional.
	*
	* @param userUuid the user uuid of this familia profesional
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_familiaProfesional.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this familia profesional.
	*
	* @return the user name of this familia profesional
	*/
	@Override
	public java.lang.String getUserName() {
		return _familiaProfesional.getUserName();
	}

	/**
	* Sets the user name of this familia profesional.
	*
	* @param userName the user name of this familia profesional
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_familiaProfesional.setUserName(userName);
	}

	/**
	* Returns the create date of this familia profesional.
	*
	* @return the create date of this familia profesional
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _familiaProfesional.getCreateDate();
	}

	/**
	* Sets the create date of this familia profesional.
	*
	* @param createDate the create date of this familia profesional
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_familiaProfesional.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this familia profesional.
	*
	* @return the modified date of this familia profesional
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _familiaProfesional.getModifiedDate();
	}

	/**
	* Sets the modified date of this familia profesional.
	*
	* @param modifiedDate the modified date of this familia profesional
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_familiaProfesional.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the nombre of this familia profesional.
	*
	* @return the nombre of this familia profesional
	*/
	@Override
	public java.lang.String getNombre() {
		return _familiaProfesional.getNombre();
	}

	/**
	* Sets the nombre of this familia profesional.
	*
	* @param nombre the nombre of this familia profesional
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_familiaProfesional.setNombre(nombre);
	}

	/**
	* Returns the descripcion of this familia profesional.
	*
	* @return the descripcion of this familia profesional
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _familiaProfesional.getDescripcion();
	}

	/**
	* Sets the descripcion of this familia profesional.
	*
	* @param descripcion the descripcion of this familia profesional
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_familiaProfesional.setDescripcion(descripcion);
	}

	/**
	* Returns the sector of this familia profesional.
	*
	* @return the sector of this familia profesional
	*/
	@Override
	public int getSector() {
		return _familiaProfesional.getSector();
	}

	/**
	* Sets the sector of this familia profesional.
	*
	* @param sector the sector of this familia profesional
	*/
	@Override
	public void setSector(int sector) {
		_familiaProfesional.setSector(sector);
	}

	/**
	* Returns the estado of this familia profesional.
	*
	* @return the estado of this familia profesional
	*/
	@Override
	public int getEstado() {
		return _familiaProfesional.getEstado();
	}

	/**
	* Sets the estado of this familia profesional.
	*
	* @param estado the estado of this familia profesional
	*/
	@Override
	public void setEstado(int estado) {
		_familiaProfesional.setEstado(estado);
	}

	@Override
	public boolean isNew() {
		return _familiaProfesional.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_familiaProfesional.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _familiaProfesional.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_familiaProfesional.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _familiaProfesional.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _familiaProfesional.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_familiaProfesional.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _familiaProfesional.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_familiaProfesional.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_familiaProfesional.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_familiaProfesional.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FamiliaProfesionalWrapper((FamiliaProfesional)_familiaProfesional.clone());
	}

	@Override
	public int compareTo(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional) {
		return _familiaProfesional.compareTo(familiaProfesional);
	}

	@Override
	public int hashCode() {
		return _familiaProfesional.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<pe.edu.aprolab.marco.model.FamiliaProfesional> toCacheModel() {
		return _familiaProfesional.toCacheModel();
	}

	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional toEscapedModel() {
		return new FamiliaProfesionalWrapper(_familiaProfesional.toEscapedModel());
	}

	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional toUnescapedModel() {
		return new FamiliaProfesionalWrapper(_familiaProfesional.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _familiaProfesional.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _familiaProfesional.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_familiaProfesional.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FamiliaProfesionalWrapper)) {
			return false;
		}

		FamiliaProfesionalWrapper familiaProfesionalWrapper = (FamiliaProfesionalWrapper)obj;

		if (Validator.equals(_familiaProfesional,
					familiaProfesionalWrapper._familiaProfesional)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FamiliaProfesional getWrappedFamiliaProfesional() {
		return _familiaProfesional;
	}

	@Override
	public FamiliaProfesional getWrappedModel() {
		return _familiaProfesional;
	}

	@Override
	public void resetOriginalValues() {
		_familiaProfesional.resetOriginalValues();
	}

	private FamiliaProfesional _familiaProfesional;
}