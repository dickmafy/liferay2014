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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CarreraProfesional service. Represents a row in the &quot;MARCO_CarreraProfesional&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalImpl}.
 * </p>
 *
 * @author Diego
 * @see CarreraProfesional
 * @see pe.edu.aprolab.marco.model.impl.CarreraProfesionalImpl
 * @see pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl
 * @generated
 */
public interface CarreraProfesionalModel extends AuditedModel,
	BaseModel<CarreraProfesional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a carrera profesional model instance should use the {@link CarreraProfesional} interface instead.
	 */

	/**
	 * Returns the primary key of this carrera profesional.
	 *
	 * @return the primary key of this carrera profesional
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this carrera profesional.
	 *
	 * @param primaryKey the primary key of this carrera profesional
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the carrera profesional ID of this carrera profesional.
	 *
	 * @return the carrera profesional ID of this carrera profesional
	 */
	public long getCarreraProfesionalId();

	/**
	 * Sets the carrera profesional ID of this carrera profesional.
	 *
	 * @param carreraProfesionalId the carrera profesional ID of this carrera profesional
	 */
	public void setCarreraProfesionalId(long carreraProfesionalId);

	/**
	 * Returns the company ID of this carrera profesional.
	 *
	 * @return the company ID of this carrera profesional
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this carrera profesional.
	 *
	 * @param companyId the company ID of this carrera profesional
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this carrera profesional.
	 *
	 * @return the user ID of this carrera profesional
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this carrera profesional.
	 *
	 * @param userId the user ID of this carrera profesional
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this carrera profesional.
	 *
	 * @return the user uuid of this carrera profesional
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this carrera profesional.
	 *
	 * @param userUuid the user uuid of this carrera profesional
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this carrera profesional.
	 *
	 * @return the user name of this carrera profesional
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this carrera profesional.
	 *
	 * @param userName the user name of this carrera profesional
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this carrera profesional.
	 *
	 * @return the create date of this carrera profesional
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this carrera profesional.
	 *
	 * @param createDate the create date of this carrera profesional
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this carrera profesional.
	 *
	 * @return the modified date of this carrera profesional
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this carrera profesional.
	 *
	 * @param modifiedDate the modified date of this carrera profesional
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the familia profesional ID of this carrera profesional.
	 *
	 * @return the familia profesional ID of this carrera profesional
	 */
	public long getFamiliaProfesionalId();

	/**
	 * Sets the familia profesional ID of this carrera profesional.
	 *
	 * @param familiaProfesionalId the familia profesional ID of this carrera profesional
	 */
	public void setFamiliaProfesionalId(long familiaProfesionalId);

	/**
	 * Returns the formacion of this carrera profesional.
	 *
	 * @return the formacion of this carrera profesional
	 */
	public int getFormacion();

	/**
	 * Sets the formacion of this carrera profesional.
	 *
	 * @param formacion the formacion of this carrera profesional
	 */
	public void setFormacion(int formacion);

	/**
	 * Returns the nombre of this carrera profesional.
	 *
	 * @return the nombre of this carrera profesional
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this carrera profesional.
	 *
	 * @param nombre the nombre of this carrera profesional
	 */
	public void setNombre(String nombre);

	/**
	 * Returns the descripcion of this carrera profesional.
	 *
	 * @return the descripcion of this carrera profesional
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this carrera profesional.
	 *
	 * @param descripcion the descripcion of this carrera profesional
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the duracion fecha inicio of this carrera profesional.
	 *
	 * @return the duracion fecha inicio of this carrera profesional
	 */
	public Date getDuracionFechaInicio();

	/**
	 * Sets the duracion fecha inicio of this carrera profesional.
	 *
	 * @param duracionFechaInicio the duracion fecha inicio of this carrera profesional
	 */
	public void setDuracionFechaInicio(Date duracionFechaInicio);

	/**
	 * Returns the duracion fecha fin of this carrera profesional.
	 *
	 * @return the duracion fecha fin of this carrera profesional
	 */
	public Date getDuracionFechaFin();

	/**
	 * Sets the duracion fecha fin of this carrera profesional.
	 *
	 * @param duracionFechaFin the duracion fecha fin of this carrera profesional
	 */
	public void setDuracionFechaFin(Date duracionFechaFin);

	/**
	 * Returns the estado of this carrera profesional.
	 *
	 * @return the estado of this carrera profesional
	 */
	public int getEstado();

	/**
	 * Sets the estado of this carrera profesional.
	 *
	 * @param estado the estado of this carrera profesional
	 */
	public void setEstado(int estado);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CarreraProfesional carreraProfesional);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CarreraProfesional> toCacheModel();

	@Override
	public CarreraProfesional toEscapedModel();

	@Override
	public CarreraProfesional toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}