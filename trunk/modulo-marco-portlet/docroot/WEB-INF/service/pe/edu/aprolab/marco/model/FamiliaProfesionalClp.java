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

import pe.edu.aprolab.marco.service.ClpSerializer;
import pe.edu.aprolab.marco.service.FamiliaProfesionalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Diego
 */
public class FamiliaProfesionalClp extends BaseModelImpl<FamiliaProfesional>
	implements FamiliaProfesional {
	public FamiliaProfesionalClp() {
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
	public long getPrimaryKey() {
		return _familiaProfesionalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFamiliaProfesionalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _familiaProfesionalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getFamiliaProfesionalId() {
		return _familiaProfesionalId;
	}

	@Override
	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesionalId = familiaProfesionalId;

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setFamiliaProfesionalId",
						long.class);

				method.invoke(_familiaProfesionalRemoteModel,
					familiaProfesionalId);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_familiaProfesionalRemoteModel, companyId);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_familiaProfesionalRemoteModel, userId);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_familiaProfesionalRemoteModel, userName);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_familiaProfesionalRemoteModel, createDate);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_familiaProfesionalRemoteModel, modifiedDate);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_familiaProfesionalRemoteModel, nombre);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_familiaProfesionalRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSector() {
		return _sector;
	}

	@Override
	public void setSector(int sector) {
		_sector = sector;

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setSector", int.class);

				method.invoke(_familiaProfesionalRemoteModel, sector);
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

		if (_familiaProfesionalRemoteModel != null) {
			try {
				Class<?> clazz = _familiaProfesionalRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", int.class);

				method.invoke(_familiaProfesionalRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFamiliaProfesionalRemoteModel() {
		return _familiaProfesionalRemoteModel;
	}

	public void setFamiliaProfesionalRemoteModel(
		BaseModel<?> familiaProfesionalRemoteModel) {
		_familiaProfesionalRemoteModel = familiaProfesionalRemoteModel;
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

		Class<?> remoteModelClass = _familiaProfesionalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_familiaProfesionalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FamiliaProfesionalLocalServiceUtil.addFamiliaProfesional(this);
		}
		else {
			FamiliaProfesionalLocalServiceUtil.updateFamiliaProfesional(this);
		}
	}

	@Override
	public FamiliaProfesional toEscapedModel() {
		return (FamiliaProfesional)ProxyUtil.newProxyInstance(FamiliaProfesional.class.getClassLoader(),
			new Class[] { FamiliaProfesional.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FamiliaProfesionalClp clone = new FamiliaProfesionalClp();

		clone.setFamiliaProfesionalId(getFamiliaProfesionalId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setNombre(getNombre());
		clone.setDescripcion(getDescripcion());
		clone.setSector(getSector());
		clone.setEstado(getEstado());

		return clone;
	}

	@Override
	public int compareTo(FamiliaProfesional familiaProfesional) {
		int value = 0;

		value = getNombre().compareTo(familiaProfesional.getNombre());

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

		if (!(obj instanceof FamiliaProfesionalClp)) {
			return false;
		}

		FamiliaProfesionalClp familiaProfesional = (FamiliaProfesionalClp)obj;

		long primaryKey = familiaProfesional.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{familiaProfesionalId=");
		sb.append(getFamiliaProfesionalId());
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
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", sector=");
		sb.append(getSector());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("pe.edu.aprolab.marco.model.FamiliaProfesional");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>familiaProfesionalId</column-name><column-value><![CDATA[");
		sb.append(getFamiliaProfesionalId());
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
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sector</column-name><column-value><![CDATA[");
		sb.append(getSector());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _familiaProfesionalId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _descripcion;
	private int _sector;
	private int _estado;
	private BaseModel<?> _familiaProfesionalRemoteModel;
}