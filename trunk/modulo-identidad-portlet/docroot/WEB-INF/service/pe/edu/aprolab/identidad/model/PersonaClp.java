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

package pe.edu.aprolab.identidad.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import pe.edu.aprolab.identidad.service.ClpSerializer;
import pe.edu.aprolab.identidad.service.PersonaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jorge Loayza Soloisolo
 */
public class PersonaClp extends BaseModelImpl<Persona> implements Persona {
	public PersonaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Persona.class;
	}

	@Override
	public String getModelClassName() {
		return Persona.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _personaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPersonaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _personaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("personaId", getPersonaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("codigoId", getCodigoId());
		attributes.put("nombres", getNombres());
		attributes.put("apellidoPaterno", getApellidoPaterno());
		attributes.put("apellidoMaterno", getApellidoMaterno());
		attributes.put("genero", getGenero());
		attributes.put("estadoCivil", getEstadoCivil());
		attributes.put("fechaNacimiento", getFechaNacimiento());
		attributes.put("ubigeoNacimiento", getUbigeoNacimiento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long personaId = (Long)attributes.get("personaId");

		if (personaId != null) {
			setPersonaId(personaId);
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

		String codigoId = (String)attributes.get("codigoId");

		if (codigoId != null) {
			setCodigoId(codigoId);
		}

		String nombres = (String)attributes.get("nombres");

		if (nombres != null) {
			setNombres(nombres);
		}

		String apellidoPaterno = (String)attributes.get("apellidoPaterno");

		if (apellidoPaterno != null) {
			setApellidoPaterno(apellidoPaterno);
		}

		String apellidoMaterno = (String)attributes.get("apellidoMaterno");

		if (apellidoMaterno != null) {
			setApellidoMaterno(apellidoMaterno);
		}

		Boolean genero = (Boolean)attributes.get("genero");

		if (genero != null) {
			setGenero(genero);
		}

		Integer estadoCivil = (Integer)attributes.get("estadoCivil");

		if (estadoCivil != null) {
			setEstadoCivil(estadoCivil);
		}

		Date fechaNacimiento = (Date)attributes.get("fechaNacimiento");

		if (fechaNacimiento != null) {
			setFechaNacimiento(fechaNacimiento);
		}

		String ubigeoNacimiento = (String)attributes.get("ubigeoNacimiento");

		if (ubigeoNacimiento != null) {
			setUbigeoNacimiento(ubigeoNacimiento);
		}
	}

	@Override
	public long getPersonaId() {
		return _personaId;
	}

	@Override
	public void setPersonaId(long personaId) {
		_personaId = personaId;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonaId", long.class);

				method.invoke(_personaRemoteModel, personaId);
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

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_personaRemoteModel, companyId);
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

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_personaRemoteModel, createDate);
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

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_personaRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodigoId() {
		return _codigoId;
	}

	@Override
	public void setCodigoId(String codigoId) {
		_codigoId = codigoId;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setCodigoId", String.class);

				method.invoke(_personaRemoteModel, codigoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNombres() {
		return _nombres;
	}

	@Override
	public void setNombres(String nombres) {
		_nombres = nombres;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setNombres", String.class);

				method.invoke(_personaRemoteModel, nombres);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApellidoPaterno() {
		return _apellidoPaterno;
	}

	@Override
	public void setApellidoPaterno(String apellidoPaterno) {
		_apellidoPaterno = apellidoPaterno;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setApellidoPaterno",
						String.class);

				method.invoke(_personaRemoteModel, apellidoPaterno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApellidoMaterno() {
		return _apellidoMaterno;
	}

	@Override
	public void setApellidoMaterno(String apellidoMaterno) {
		_apellidoMaterno = apellidoMaterno;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setApellidoMaterno",
						String.class);

				method.invoke(_personaRemoteModel, apellidoMaterno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGenero() {
		return _genero;
	}

	@Override
	public boolean isGenero() {
		return _genero;
	}

	@Override
	public void setGenero(boolean genero) {
		_genero = genero;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setGenero", boolean.class);

				method.invoke(_personaRemoteModel, genero);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEstadoCivil() {
		return _estadoCivil;
	}

	@Override
	public void setEstadoCivil(int estadoCivil) {
		_estadoCivil = estadoCivil;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setEstadoCivil", int.class);

				method.invoke(_personaRemoteModel, estadoCivil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaNacimiento() {
		return _fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(Date fechaNacimiento) {
		_fechaNacimiento = fechaNacimiento;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaNacimiento", Date.class);

				method.invoke(_personaRemoteModel, fechaNacimiento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUbigeoNacimiento() {
		return _ubigeoNacimiento;
	}

	@Override
	public void setUbigeoNacimiento(String ubigeoNacimiento) {
		_ubigeoNacimiento = ubigeoNacimiento;

		if (_personaRemoteModel != null) {
			try {
				Class<?> clazz = _personaRemoteModel.getClass();

				Method method = clazz.getMethod("setUbigeoNacimiento",
						String.class);

				method.invoke(_personaRemoteModel, ubigeoNacimiento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public com.liferay.portal.model.User getUser() {
		try {
			String methodName = "getUser";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.liferay.portal.model.User returnObj = (com.liferay.portal.model.User)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getPersonaRemoteModel() {
		return _personaRemoteModel;
	}

	public void setPersonaRemoteModel(BaseModel<?> personaRemoteModel) {
		_personaRemoteModel = personaRemoteModel;
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

		Class<?> remoteModelClass = _personaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_personaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PersonaLocalServiceUtil.addPersona(this);
		}
		else {
			PersonaLocalServiceUtil.updatePersona(this);
		}
	}

	@Override
	public Persona toEscapedModel() {
		return (Persona)ProxyUtil.newProxyInstance(Persona.class.getClassLoader(),
			new Class[] { Persona.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PersonaClp clone = new PersonaClp();

		clone.setPersonaId(getPersonaId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCodigoId(getCodigoId());
		clone.setNombres(getNombres());
		clone.setApellidoPaterno(getApellidoPaterno());
		clone.setApellidoMaterno(getApellidoMaterno());
		clone.setGenero(getGenero());
		clone.setEstadoCivil(getEstadoCivil());
		clone.setFechaNacimiento(getFechaNacimiento());
		clone.setUbigeoNacimiento(getUbigeoNacimiento());

		return clone;
	}

	@Override
	public int compareTo(Persona persona) {
		int value = 0;

		value = getCodigoId().compareTo(persona.getCodigoId());

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

		if (!(obj instanceof PersonaClp)) {
			return false;
		}

		PersonaClp persona = (PersonaClp)obj;

		long primaryKey = persona.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{personaId=");
		sb.append(getPersonaId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", codigoId=");
		sb.append(getCodigoId());
		sb.append(", nombres=");
		sb.append(getNombres());
		sb.append(", apellidoPaterno=");
		sb.append(getApellidoPaterno());
		sb.append(", apellidoMaterno=");
		sb.append(getApellidoMaterno());
		sb.append(", genero=");
		sb.append(getGenero());
		sb.append(", estadoCivil=");
		sb.append(getEstadoCivil());
		sb.append(", fechaNacimiento=");
		sb.append(getFechaNacimiento());
		sb.append(", ubigeoNacimiento=");
		sb.append(getUbigeoNacimiento());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("pe.edu.aprolab.identidad.model.Persona");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>personaId</column-name><column-value><![CDATA[");
		sb.append(getPersonaId());
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
			"<column><column-name>codigoId</column-name><column-value><![CDATA[");
		sb.append(getCodigoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombres</column-name><column-value><![CDATA[");
		sb.append(getNombres());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apellidoPaterno</column-name><column-value><![CDATA[");
		sb.append(getApellidoPaterno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apellidoMaterno</column-name><column-value><![CDATA[");
		sb.append(getApellidoMaterno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>genero</column-name><column-value><![CDATA[");
		sb.append(getGenero());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estadoCivil</column-name><column-value><![CDATA[");
		sb.append(getEstadoCivil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaNacimiento</column-name><column-value><![CDATA[");
		sb.append(getFechaNacimiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ubigeoNacimiento</column-name><column-value><![CDATA[");
		sb.append(getUbigeoNacimiento());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _personaId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _codigoId;
	private String _nombres;
	private String _apellidoPaterno;
	private String _apellidoMaterno;
	private boolean _genero;
	private int _estadoCivil;
	private Date _fechaNacimiento;
	private String _ubigeoNacimiento;
	private BaseModel<?> _personaRemoteModel;
}