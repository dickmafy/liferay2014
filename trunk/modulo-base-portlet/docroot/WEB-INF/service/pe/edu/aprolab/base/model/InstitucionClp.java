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
import pe.edu.aprolab.base.service.InstitucionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jorge Loayza Soloisolo
 */
public class InstitucionClp extends BaseModelImpl<Institucion>
	implements Institucion {
	public InstitucionClp() {
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
	public long getPrimaryKey() {
		return _institucionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInstitucionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _institucionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("institucionId", getInstitucionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("RUC", getRUC());
		attributes.put("codigoModular", getCodigoModular());

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

		String RUC = (String)attributes.get("RUC");

		if (RUC != null) {
			setRUC(RUC);
		}

		String codigoModular = (String)attributes.get("codigoModular");

		if (codigoModular != null) {
			setCodigoModular(codigoModular);
		}
	}

	@Override
	public long getInstitucionId() {
		return _institucionId;
	}

	@Override
	public void setInstitucionId(long institucionId) {
		_institucionId = institucionId;

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setInstitucionId", long.class);

				method.invoke(_institucionRemoteModel, institucionId);
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

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_institucionRemoteModel, companyId);
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

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_institucionRemoteModel, createDate);
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

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_institucionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRUC() {
		return _RUC;
	}

	@Override
	public void setRUC(String RUC) {
		_RUC = RUC;

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setRUC", String.class);

				method.invoke(_institucionRemoteModel, RUC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodigoModular() {
		return _codigoModular;
	}

	@Override
	public void setCodigoModular(String codigoModular) {
		_codigoModular = codigoModular;

		if (_institucionRemoteModel != null) {
			try {
				Class<?> clazz = _institucionRemoteModel.getClass();

				Method method = clazz.getMethod("setCodigoModular", String.class);

				method.invoke(_institucionRemoteModel, codigoModular);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInstitucionRemoteModel() {
		return _institucionRemoteModel;
	}

	public void setInstitucionRemoteModel(BaseModel<?> institucionRemoteModel) {
		_institucionRemoteModel = institucionRemoteModel;
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

		Class<?> remoteModelClass = _institucionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_institucionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InstitucionLocalServiceUtil.addInstitucion(this);
		}
		else {
			InstitucionLocalServiceUtil.updateInstitucion(this);
		}
	}

	@Override
	public Institucion toEscapedModel() {
		return (Institucion)ProxyUtil.newProxyInstance(Institucion.class.getClassLoader(),
			new Class[] { Institucion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InstitucionClp clone = new InstitucionClp();

		clone.setInstitucionId(getInstitucionId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setRUC(getRUC());
		clone.setCodigoModular(getCodigoModular());

		return clone;
	}

	@Override
	public int compareTo(Institucion institucion) {
		int value = 0;

		value = getRUC().compareTo(institucion.getRUC());

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

		if (!(obj instanceof InstitucionClp)) {
			return false;
		}

		InstitucionClp institucion = (InstitucionClp)obj;

		long primaryKey = institucion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{institucionId=");
		sb.append(getInstitucionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", RUC=");
		sb.append(getRUC());
		sb.append(", codigoModular=");
		sb.append(getCodigoModular());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("pe.edu.aprolab.base.model.Institucion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>institucionId</column-name><column-value><![CDATA[");
		sb.append(getInstitucionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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
			"<column><column-name>RUC</column-name><column-value><![CDATA[");
		sb.append(getRUC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigoModular</column-name><column-value><![CDATA[");
		sb.append(getCodigoModular());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _institucionId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _RUC;
	private String _codigoModular;
	private BaseModel<?> _institucionRemoteModel;
}