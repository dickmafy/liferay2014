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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import pe.edu.aprolab.marco.model.CarreraProfesional;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CarreraProfesional in entity cache.
 *
 * @author Diego
 * @see CarreraProfesional
 * @generated
 */
public class CarreraProfesionalCacheModel implements CacheModel<CarreraProfesional>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{carreraProfesionalorId=");
		sb.append(carreraProfesionalorId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", familiaProfesionalId=");
		sb.append(familiaProfesionalId);
		sb.append(", formacion=");
		sb.append(formacion);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", duracionFechaInicio=");
		sb.append(duracionFechaInicio);
		sb.append(", duracionFechaFin=");
		sb.append(duracionFechaFin);
		sb.append(", estado=");
		sb.append(estado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CarreraProfesional toEntityModel() {
		CarreraProfesionalImpl carreraProfesionalImpl = new CarreraProfesionalImpl();

		carreraProfesionalImpl.setCarreraProfesionalorId(carreraProfesionalorId);
		carreraProfesionalImpl.setCompanyId(companyId);
		carreraProfesionalImpl.setUserId(userId);

		if (userName == null) {
			carreraProfesionalImpl.setUserName(StringPool.BLANK);
		}
		else {
			carreraProfesionalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			carreraProfesionalImpl.setCreateDate(null);
		}
		else {
			carreraProfesionalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			carreraProfesionalImpl.setModifiedDate(null);
		}
		else {
			carreraProfesionalImpl.setModifiedDate(new Date(modifiedDate));
		}

		carreraProfesionalImpl.setFamiliaProfesionalId(familiaProfesionalId);
		carreraProfesionalImpl.setFormacion(formacion);

		if (nombre == null) {
			carreraProfesionalImpl.setNombre(StringPool.BLANK);
		}
		else {
			carreraProfesionalImpl.setNombre(nombre);
		}

		if (descripcion == null) {
			carreraProfesionalImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			carreraProfesionalImpl.setDescripcion(descripcion);
		}

		if (duracionFechaInicio == Long.MIN_VALUE) {
			carreraProfesionalImpl.setDuracionFechaInicio(null);
		}
		else {
			carreraProfesionalImpl.setDuracionFechaInicio(new Date(
					duracionFechaInicio));
		}

		if (duracionFechaFin == Long.MIN_VALUE) {
			carreraProfesionalImpl.setDuracionFechaFin(null);
		}
		else {
			carreraProfesionalImpl.setDuracionFechaFin(new Date(
					duracionFechaFin));
		}

		carreraProfesionalImpl.setEstado(estado);

		carreraProfesionalImpl.resetOriginalValues();

		return carreraProfesionalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		carreraProfesionalorId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		familiaProfesionalId = objectInput.readLong();
		formacion = objectInput.readInt();
		nombre = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		duracionFechaInicio = objectInput.readLong();
		duracionFechaFin = objectInput.readLong();
		estado = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(carreraProfesionalorId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(familiaProfesionalId);
		objectOutput.writeInt(formacion);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(duracionFechaInicio);
		objectOutput.writeLong(duracionFechaFin);
		objectOutput.writeInt(estado);
	}

	public long carreraProfesionalorId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long familiaProfesionalId;
	public int formacion;
	public String nombre;
	public String descripcion;
	public long duracionFechaInicio;
	public long duracionFechaFin;
	public int estado;
}