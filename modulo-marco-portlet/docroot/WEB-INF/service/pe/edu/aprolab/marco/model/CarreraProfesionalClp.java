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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil;
import pe.edu.aprolab.marco.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Diego
 */
public class CarreraProfesionalClp extends BaseModelImpl<CarreraProfesional>
	implements CarreraProfesional {
	public CarreraProfesionalClp() {
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
	public long getPrimaryKey() {
		return _carreraProfesionalorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCarreraProfesionalorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _carreraProfesionalorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCarreraProfesionalorId() {
		return _carreraProfesionalorId;
	}

	@Override
	public void setCarreraProfesionalorId(long carreraProfesionalorId) {
		_carreraProfesionalorId = carreraProfesionalorId;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setCarreraProfesionalorId",
						long.class);

				method.invoke(_carreraProfesionalRemoteModel,
					carreraProfesionalorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_carreraProfesionalRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_carreraProfesionalRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_carreraProfesionalRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_carreraProfesionalRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_carreraProfesionalRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFamiliaProfesionalId() {
		return _familiaProfesionalId;
	}

	@Override
	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesionalId = familiaProfesionalId;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setFamiliaProfesionalId",
						long.class);

				method.invoke(_carreraProfesionalRemoteModel,
					familiaProfesionalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFormacion() {
		return _formacion;
	}

	@Override
	public void setFormacion(int formacion) {
		_formacion = formacion;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setFormacion", int.class);

				method.invoke(_carreraProfesionalRemoteModel, formacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNombre() {
		return _nombre;
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_carreraProfesionalRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescripcion() {
		return _descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_carreraProfesionalRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDuracionFechaInicio() {
		return _duracionFechaInicio;
	}

	@Override
	public void setDuracionFechaInicio(Date duracionFechaInicio) {
		_duracionFechaInicio = duracionFechaInicio;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setDuracionFechaInicio",
						Date.class);

				method.invoke(_carreraProfesionalRemoteModel,
					duracionFechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDuracionFechaFin() {
		return _duracionFechaFin;
	}

	@Override
	public void setDuracionFechaFin(Date duracionFechaFin) {
		_duracionFechaFin = duracionFechaFin;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setDuracionFechaFin",
						Date.class);

				method.invoke(_carreraProfesionalRemoteModel, duracionFechaFin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(int estado) {
		_estado = estado;

		if (_carreraProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _carreraProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", int.class);

				method.invoke(_carreraProfesionalRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCarreraProfesionalRemoteModel() {
		return _carreraProfesionalRemoteModel;
	}

	public void setCarreraProfesionalRemoteModel(
		BaseModel<?> carreraProfesionalRemoteModel) {
		_carreraProfesionalRemoteModel = carreraProfesionalRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _carreraProfesionalRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_carreraProfesionalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CarreraProfesionalLocalServiceUtil.addCarreraProfesional(this);
		}
		else {
			CarreraProfesionalLocalServiceUtil.updateCarreraProfesional(this);
		}
	}

	@Override
	public CarreraProfesional toEscapedModel() {
		return (CarreraProfesional)ProxyUtil.newProxyInstance(CarreraProfesional.class.getClassLoader(),
			new Class[] { CarreraProfesional.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CarreraProfesionalClp clone = new CarreraProfesionalClp();

		clone.setCarreraProfesionalorId(getCarreraProfesionalorId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setFamiliaProfesionalId(getFamiliaProfesionalId());
		clone.setFormacion(getFormacion());
		clone.setNombre(getNombre());
		clone.setDescripcion(getDescripcion());
		clone.setDuracionFechaInicio(getDuracionFechaInicio());
		clone.setDuracionFechaFin(getDuracionFechaFin());
		clone.setEstado(getEstado());

		return clone;
	}

	@Override
	public int compareTo(CarreraProfesional carreraProfesional) {
		int value = 0;

		value = getNombre().compareTo(carreraProfesional.getNombre());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CarreraProfesionalClp)) {
			return false;
		}

		CarreraProfesionalClp carreraProfesional = (CarreraProfesionalClp)obj;

		long primaryKey = carreraProfesional.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{carreraProfesionalorId=");
		sb.append(getCarreraProfesionalorId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", familiaProfesionalId=");
		sb.append(getFamiliaProfesionalId());
		sb.append(", formacion=");
		sb.append(getFormacion());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", duracionFechaInicio=");
		sb.append(getDuracionFechaInicio());
		sb.append(", duracionFechaFin=");
		sb.append(getDuracionFechaFin());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("pe.edu.aprolab.marco.model.CarreraProfesional");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>carreraProfesionalorId</column-name><column-value><![CDATA[");
		sb.append(getCarreraProfesionalorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familiaProfesionalId</column-name><column-value><![CDATA[");
		sb.append(getFamiliaProfesionalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formacion</column-name><column-value><![CDATA[");
		sb.append(getFormacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duracionFechaInicio</column-name><column-value><![CDATA[");
		sb.append(getDuracionFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duracionFechaFin</column-name><column-value><![CDATA[");
		sb.append(getDuracionFechaFin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _carreraProfesionalorId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _carreraProfesionalRemoteModel;
}