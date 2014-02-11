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

package pe.edu.aprolab.marco.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import pe.edu.aprolab.marco.model.FamiliaProfesional;
import pe.edu.aprolab.marco.model.FamiliaProfesionalModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FamiliaProfesional service. Represents a row in the &quot;marco_FamiliaProfesional&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link pe.edu.aprolab.marco.model.FamiliaProfesionalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FamiliaProfesionalImpl}.
 * </p>
 *
 * @author Diego
 * @see FamiliaProfesionalImpl
 * @see pe.edu.aprolab.marco.model.FamiliaProfesional
 * @see pe.edu.aprolab.marco.model.FamiliaProfesionalModel
 * @generated
 */
public class FamiliaProfesionalModelImpl extends BaseModelImpl<FamiliaProfesional>
	implements FamiliaProfesionalModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a familia profesional model instance should use the {@link pe.edu.aprolab.marco.model.FamiliaProfesional} interface instead.
	 */
	public static final String TABLE_NAME = "marco_FamiliaProfesional";
	public static final Object[][] TABLE_COLUMNS = {
			{ "familiaProfesionalId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "nombre", Types.VARCHAR },
			{ "descripcion", Types.VARCHAR },
			{ "sector", Types.INTEGER },
			{ "estado", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table marco_FamiliaProfesional (familiaProfesionalId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nombre VARCHAR(75) null,descripcion VARCHAR(75) null,sector INTEGER,estado INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table marco_FamiliaProfesional";
	public static final String ORDER_BY_JPQL = " ORDER BY familiaProfesional.nombre ASC";
	public static final String ORDER_BY_SQL = " ORDER BY marco_FamiliaProfesional.nombre ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.pe.edu.aprolab.marco.model.FamiliaProfesional"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.pe.edu.aprolab.marco.model.FamiliaProfesional"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.pe.edu.aprolab.marco.model.FamiliaProfesional"),
			true);
	public static long NOMBRE_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.pe.edu.aprolab.marco.model.FamiliaProfesional"));

	public FamiliaProfesionalModelImpl() {
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

	@Override
	public long getFamiliaProfesionalId() {
		return _familiaProfesionalId;
	}

	@Override
	public void setFamiliaProfesionalId(long familiaProfesionalId) {
		_familiaProfesionalId = familiaProfesionalId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
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
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	@Override
	public void setNombre(String nombre) {
		_columnBitmask = -1L;

		if (_originalNombre == null) {
			_originalNombre = _nombre;
		}

		_nombre = nombre;
	}

	public String getOriginalNombre() {
		return GetterUtil.getString(_originalNombre);
	}

	@Override
	public String getDescripcion() {
		if (_descripcion == null) {
			return StringPool.BLANK;
		}
		else {
			return _descripcion;
		}
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	@Override
	public int getSector() {
		return _sector;
	}

	@Override
	public void setSector(int sector) {
		_sector = sector;
	}

	@Override
	public int getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(int estado) {
		_estado = estado;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			FamiliaProfesional.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FamiliaProfesional toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FamiliaProfesional)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FamiliaProfesionalImpl familiaProfesionalImpl = new FamiliaProfesionalImpl();

		familiaProfesionalImpl.setFamiliaProfesionalId(getFamiliaProfesionalId());
		familiaProfesionalImpl.setCompanyId(getCompanyId());
		familiaProfesionalImpl.setUserId(getUserId());
		familiaProfesionalImpl.setUserName(getUserName());
		familiaProfesionalImpl.setCreateDate(getCreateDate());
		familiaProfesionalImpl.setModifiedDate(getModifiedDate());
		familiaProfesionalImpl.setNombre(getNombre());
		familiaProfesionalImpl.setDescripcion(getDescripcion());
		familiaProfesionalImpl.setSector(getSector());
		familiaProfesionalImpl.setEstado(getEstado());

		familiaProfesionalImpl.resetOriginalValues();

		return familiaProfesionalImpl;
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

		if (!(obj instanceof FamiliaProfesional)) {
			return false;
		}

		FamiliaProfesional familiaProfesional = (FamiliaProfesional)obj;

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
	public void resetOriginalValues() {
		FamiliaProfesionalModelImpl familiaProfesionalModelImpl = this;

		familiaProfesionalModelImpl._originalNombre = familiaProfesionalModelImpl._nombre;

		familiaProfesionalModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FamiliaProfesional> toCacheModel() {
		FamiliaProfesionalCacheModel familiaProfesionalCacheModel = new FamiliaProfesionalCacheModel();

		familiaProfesionalCacheModel.familiaProfesionalId = getFamiliaProfesionalId();

		familiaProfesionalCacheModel.companyId = getCompanyId();

		familiaProfesionalCacheModel.userId = getUserId();

		familiaProfesionalCacheModel.userName = getUserName();

		String userName = familiaProfesionalCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			familiaProfesionalCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			familiaProfesionalCacheModel.createDate = createDate.getTime();
		}
		else {
			familiaProfesionalCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			familiaProfesionalCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			familiaProfesionalCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		familiaProfesionalCacheModel.nombre = getNombre();

		String nombre = familiaProfesionalCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			familiaProfesionalCacheModel.nombre = null;
		}

		familiaProfesionalCacheModel.descripcion = getDescripcion();

		String descripcion = familiaProfesionalCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			familiaProfesionalCacheModel.descripcion = null;
		}

		familiaProfesionalCacheModel.sector = getSector();

		familiaProfesionalCacheModel.estado = getEstado();

		return familiaProfesionalCacheModel;
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

	private static ClassLoader _classLoader = FamiliaProfesional.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			FamiliaProfesional.class
		};
	private long _familiaProfesionalId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _originalNombre;
	private String _descripcion;
	private int _sector;
	private int _estado;
	private long _columnBitmask;
	private FamiliaProfesional _escapedModel;
}