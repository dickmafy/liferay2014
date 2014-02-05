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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.siagie.sttp.service.ClpSerializer;
import com.siagie.sttp.service.LocalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Diego
 */
public class LocalClp extends BaseModelImpl<Local> implements Local {
	public LocalClp() {
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
	public long getPrimaryKey() {
		return _localId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLocalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _localId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getLocalId() {
		return _localId;
	}

	@Override
	public void setLocalId(long localId) {
		_localId = localId;

		if (_localRemoteModel != null) {
			try {
				Class<?> clazz = _localRemoteModel.getClass();

				Method method = clazz.getMethod("setLocalId", long.class);

				method.invoke(_localRemoteModel, localId);
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

		if (_localRemoteModel != null) {
			try {
				Class<?> clazz = _localRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_localRemoteModel, nombre);
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

		if (_localRemoteModel != null) {
			try {
				Class<?> clazz = _localRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", int.class);

				method.invoke(_localRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLocalRemoteModel() {
		return _localRemoteModel;
	}

	public void setLocalRemoteModel(BaseModel<?> localRemoteModel) {
		_localRemoteModel = localRemoteModel;
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

		Class<?> remoteModelClass = _localRemoteModel.getClass();

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

		Object returnValue = method.invoke(_localRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocalLocalServiceUtil.addLocal(this);
		}
		else {
			LocalLocalServiceUtil.updateLocal(this);
		}
	}

	@Override
	public Local toEscapedModel() {
		return (Local)ProxyUtil.newProxyInstance(Local.class.getClassLoader(),
			new Class[] { Local.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LocalClp clone = new LocalClp();

		clone.setLocalId(getLocalId());
		clone.setNombre(getNombre());
		clone.setEstado(getEstado());

		return clone;
	}

	@Override
	public int compareTo(Local local) {
		int value = 0;

		value = getNombre().compareTo(local.getNombre());

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

		if (!(obj instanceof LocalClp)) {
			return false;
		}

		LocalClp local = (LocalClp)obj;

		long primaryKey = local.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{localId=");
		sb.append(getLocalId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.siagie.sttp.model.Local");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>localId</column-name><column-value><![CDATA[");
		sb.append(getLocalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _localId;
	private String _nombre;
	private int _estado;
	private BaseModel<?> _localRemoteModel;
}