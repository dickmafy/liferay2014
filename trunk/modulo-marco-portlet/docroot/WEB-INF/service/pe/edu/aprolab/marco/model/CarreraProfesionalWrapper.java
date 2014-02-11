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
 * This class is a wrapper for {@link CarreraProfesional}.
 * </p>
 *
 * @author Diego
 * @see CarreraProfesional
 * @generated
 */
public class CarreraProfesionalWrapper implements CarreraProfesional,
	ModelWrapper<CarreraProfesional> {
	public CarreraProfesionalWrapper(CarreraProfesional carreraProfesional) {
		_carreraProfesional = carreraProfesional;
	}

	@Override
	public Class<?> getModelClass() {
		return CarreraProfesional.class;
	}

	@Override
	public String getModelClassName() {
		return CarreraProfesional.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("carreraProfesionalorId", getCarreraProfesionalorId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("familiaProfesionalId", getFamiliaProfesionalId());
		attributes.put("formacion", getFormacion());
		attributes.put("nombre", getNombre());
		attributes.put("descripcion", getDescripcion());
		attributes.put("duracionFechaInicio", getDuracionFechaInicio());
		attributes.put("duracionFechaFin", getDuracionFechaFin());
		attributes.put("estado", getEstado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long carreraProfesionalorId = (Long)attributes.get(
				"carreraProfesionalorId");

		if (carreraProfesionalorId != null) {
			setCarreraProfesionalorId(carreraProfesionalorId);
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

		Long familiaProfesionalId = (Long)attributes.get("familiaProfesionalId");

		if (familiaProfesionalId != null) {
			setFamiliaProfesionalId(familiaProfesionalId);
		}

		Integer formacion = (Integer)attributes.get("formacion");

		if (formacion != null) {
			setFormacion(formacion);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date duracionFechaInicio = (Date)attributes.get("duracionFechaInicio");

		if (duracionFechaInicio != null) {
			setDuracionFechaInicio(duracionFechaInicio);
		}

		Date duracionFechaFin = (Date)attributes.get("duracionFechaFin");

		if (duracionFechaFin != null) {
			setDuracionFechaFin(duracionFechaFin);
		}

		Integer estado = (Integer)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}
	}

	/**
	* Returns the primary key of this carrera profesional.
	*
	* @return the primary key of this carrera profesional
	*/
	@Override
	public long getPrimaryKey() {
		return _carreraProfesional.getPrimaryKey();
	}

	/**
	* Sets the primary key of this carrera profesional.
	*
	* @param primaryKey the primary key of this carrera profesional
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_carreraProfesional.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the carrera profesionalor ID of this carrera profesional.
	*
	* @return the carrera profesionalor ID of this carrera profesional
	*/
	@Override
	public long getCarreraProfesionalorId() {
		return _carreraProfesional.getCarreraProfesionalorId();
	}

	/**
	* Sets the carrera profesionalor ID of this carrera profesional.
	*
	* @param carreraProfesionalorId the carrera profesionalor ID of this carrera profesional
	*/
	@Override
	public void setCarreraProfesionalorId(long carreraProfesionalorId) {
		_carreraProfesional.setCarreraProfesionalorId(carreraProfesionalorId);
	}

	/**
	* Returns the company ID of this carrera profesional.
	*
	* @return the company ID of this carrera profesional
	*/
	@Override
	public long getCompanyId() {
		return _carreraProfesional.getCompanyId();
	}

	/**
	* Sets the company ID of this carrera profesional.
	*
	* @param companyId the company ID of this carrera profesional
	*/
	@Override
	public void setCompanyId(long companyId) {
		_carreraProfesional.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this carrera profesional.
	*
	* @return the user ID of this carrera profesional
	*/
	@Override
	public long getUserId() {
		return _carreraProfesional.getUserId();
	}

	/**
	* Sets the user ID of this carrera profesional.
	*
	* @param userId the user ID of this carrera profesional
	*/
	@Override
	public void setUserId(long userId) {
		_carreraProfesional.setUserId(userId);
	}

	/**
	* Returns the user uuid of this carrera profesional.
	*
	* @return the user uuid of this carrera profesional
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _carreraProfesional.getUserUuid();
	}

	/**
	* Sets the user uuid of this carrera profesional.
	*
	* @param userUuid the user uuid of this carrera profesional
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_carreraProfesional.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this carrera profesional.
	*
	* @return the user name of this carrera profesional
	*/
	@Override
	public java.lang.String getUserName() {
		return _carreraProfesional.getUserName();
	}

	/**
	* Sets the user name of this carrera profesional.
	*
	* @param userName the user name of this carrera profesional
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_carreraProfesional.setUserName(userName);
	}

	/**
	* Returns the create date of this carrera profesional.
	*
	* @return the create date of this carrera profesional
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _carreraProfesional.getCreateDate();
	}

	/**
	* Sets the create date of this carrera profesional.
	*
	* @param createDate the create date of this carrera profesional
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_carreraProfesional.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this carrera profesional.
	*
	* @return the modified date of this carrera profesional
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _carreraProfesional.getModifiedDate();
	}

	/**
	* Sets the modified date of this carrera profesional.
	*
	* @param modifiedDate the modified date of this carrera profesional
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_carreraProfesional.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the familia profesional ID of this carrera profesional.
	*
	* @return the familia profesional ID of this carrera profesional
	*/
	@Override
	public long getFamiliaProfesionalId() {
		return _carreraProfesional.getFamiliaProfesionalId();
	}

	/**
	* Sets the familia profesional ID of this carrera profesional.
	*
	* @param familiaProfesionalId the familia profesional ID of this carrera profesional
	*/
	@Override
	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_carreraProfesional.setFamiliaProfesionalId(familiaProfesionalId);
	}

	/**
	* Returns the formacion of this carrera profesional.
	*
	* @return the formacion of this carrera profesional
	*/
	@Override
	public int getFormacion() {
		return _carreraProfesional.getFormacion();
	}

	/**
	* Sets the formacion of this carrera profesional.
	*
	* @param formacion the formacion of this carrera profesional
	*/
	@Override
	public void setFormacion(int formacion) {
		_carreraProfesional.setFormacion(formacion);
	}

	/**
	* Returns the nombre of this carrera profesional.
	*
	* @return the nombre of this carrera profesional
	*/
	@Override
	public java.lang.String getNombre() {
		return _carreraProfesional.getNombre();
	}

	/**
	* Sets the nombre of this carrera profesional.
	*
	* @param nombre the nombre of this carrera profesional
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_carreraProfesional.setNombre(nombre);
	}

	/**
	* Returns the descripcion of this carrera profesional.
	*
	* @return the descripcion of this carrera profesional
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _carreraProfesional.getDescripcion();
	}

	/**
	* Sets the descripcion of this carrera profesional.
	*
	* @param descripcion the descripcion of this carrera profesional
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_carreraProfesional.setDescripcion(descripcion);
	}

	/**
	* Returns the duracion fecha inicio of this carrera profesional.
	*
	* @return the duracion fecha inicio of this carrera profesional
	*/
	@Override
	public java.util.Date getDuracionFechaInicio() {
		return _carreraProfesional.getDuracionFechaInicio();
	}

	/**
	* Sets the duracion fecha inicio of this carrera profesional.
	*
	* @param duracionFechaInicio the duracion fecha inicio of this carrera profesional
	*/
	@Override
	public void setDuracionFechaInicio(java.util.Date duracionFechaInicio) {
		_carreraProfesional.setDuracionFechaInicio(duracionFechaInicio);
	}

	/**
	* Returns the duracion fecha fin of this carrera profesional.
	*
	* @return the duracion fecha fin of this carrera profesional
	*/
	@Override
	public java.util.Date getDuracionFechaFin() {
		return _carreraProfesional.getDuracionFechaFin();
	}

	/**
	* Sets the duracion fecha fin of this carrera profesional.
	*
	* @param duracionFechaFin the duracion fecha fin of this carrera profesional
	*/
	@Override
	public void setDuracionFechaFin(java.util.Date duracionFechaFin) {
		_carreraProfesional.setDuracionFechaFin(duracionFechaFin);
	}

	/**
	* Returns the estado of this carrera profesional.
	*
	* @return the estado of this carrera profesional
	*/
	@Override
	public int getEstado() {
		return _carreraProfesional.getEstado();
	}

	/**
	* Sets the estado of this carrera profesional.
	*
	* @param estado the estado of this carrera profesional
	*/
	@Override
	public void setEstado(int estado) {
		_carreraProfesional.setEstado(estado);
	}

	@Override
	public boolean isNew() {
		return _carreraProfesional.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_carreraProfesional.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _carreraProfesional.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_carreraProfesional.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _carreraProfesional.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _carreraProfesional.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_carreraProfesional.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _carreraProfesional.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_carreraProfesional.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_carreraProfesional.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_carreraProfesional.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CarreraProfesionalWrapper((CarreraProfesional)_carreraProfesional.clone());
	}

	@Override
	public int compareTo(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional) {
		return _carreraProfesional.compareTo(carreraProfesional);
	}

	@Override
	public int hashCode() {
		return _carreraProfesional.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<pe.edu.aprolab.marco.model.CarreraProfesional> toCacheModel() {
		return _carreraProfesional.toCacheModel();
	}

	@Override
	public pe.edu.aprolab.marco.model.CarreraProfesional toEscapedModel() {
		return new CarreraProfesionalWrapper(_carreraProfesional.toEscapedModel());
	}

	@Override
	public pe.edu.aprolab.marco.model.CarreraProfesional toUnescapedModel() {
		return new CarreraProfesionalWrapper(_carreraProfesional.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _carreraProfesional.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _carreraProfesional.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_carreraProfesional.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CarreraProfesionalWrapper)) {
			return false;
		}

		CarreraProfesionalWrapper carreraProfesionalWrapper = (CarreraProfesionalWrapper)obj;

		if (Validator.equals(_carreraProfesional,
					carreraProfesionalWrapper._carreraProfesional)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CarreraProfesional getWrappedCarreraProfesional() {
		return _carreraProfesional;
	}

	@Override
	public CarreraProfesional getWrappedModel() {
		return _carreraProfesional;
	}

	@Override
	public void resetOriginalValues() {
		_carreraProfesional.resetOriginalValues();
	}

	private CarreraProfesional _carreraProfesional;
}