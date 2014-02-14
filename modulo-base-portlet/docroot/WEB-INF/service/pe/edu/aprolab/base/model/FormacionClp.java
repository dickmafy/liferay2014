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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import pe.edu.aprolab.base.service.ClpSerializer;
import pe.edu.aprolab.base.service.FormacionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jorge Loayza Soloisolo
 */
public class FormacionClp extends BaseModelImpl<Formacion> implements Formacion {
	public FormacionClp() {
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
	public long getPrimaryKey() {
		return _formacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFormacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _formacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getFormacionId() {
		return _formacionId;
	}

	@Override
	public void setFormacionId(long formacionId) {
		_formacionId = formacionId;

		if (_formacionRemoteModel != null) {
			try {
				Class<?> clazz = _formacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFormacionId", long.class);

				method.invoke(_formacionRemoteModel, formacionId);
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

		if (_formacionRemoteModel != null) {
			try {
				Class<?> clazz = _formacionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_formacionRemoteModel, companyId);
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

		if (_formacionRemoteModel != null) {
			try {
				Class<?> clazz = _formacionRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_formacionRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFormacionRemoteModel() {
		return _formacionRemoteModel;
	}

	public void setFormacionRemoteModel(BaseModel<?> formacionRemoteModel) {
		_formacionRemoteModel = formacionRemoteModel;
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

		Class<?> remoteModelClass = _formacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_formacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FormacionLocalServiceUtil.addFormacion(this);
		}
		else {
			FormacionLocalServiceUtil.updateFormacion(this);
		}
	}

	@Override
	public Formacion toEscapedModel() {
		return (Formacion)ProxyUtil.newProxyInstance(Formacion.class.getClassLoader(),
			new Class[] { Formacion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FormacionClp clone = new FormacionClp();

		clone.setFormacionId(getFormacionId());
		clone.setCompanyId(getCompanyId());
		clone.setNombre(getNombre());

		return clone;
	}

	@Override
	public int compareTo(Formacion formacion) {
		int value = 0;

		value = getNombre().compareTo(formacion.getNombre());

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

		if (!(obj instanceof FormacionClp)) {
			return false;
		}

		FormacionClp formacion = (FormacionClp)obj;

		long primaryKey = formacion.getPrimaryKey();

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

		sb.append("{formacionId=");
		sb.append(getFormacionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("pe.edu.aprolab.base.model.Formacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>formacionId</column-name><column-value><![CDATA[");
		sb.append(getFormacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _formacionId;
	private long _companyId;
	private String _nombre;
	private BaseModel<?> _formacionRemoteModel;
}