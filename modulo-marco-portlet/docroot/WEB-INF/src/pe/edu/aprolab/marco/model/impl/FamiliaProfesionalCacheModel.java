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

import pe.edu.aprolab.marco.model.FamiliaProfesional;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FamiliaProfesional in entity cache.
 *
 * @author Diego
 * @see FamiliaProfesional
 * @generated
 */
public class FamiliaProfesionalCacheModel implements CacheModel<FamiliaProfesional>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{familiaProfesionalId=");
		sb.append(familiaProfesionalId);
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
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", sector=");
		sb.append(sector);
		sb.append(", estado=");
		sb.append(estado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FamiliaProfesional toEntityModel() {
		FamiliaProfesionalImpl familiaProfesionalImpl = new FamiliaProfesionalImpl();

		familiaProfesionalImpl.setFamiliaProfesionalId(familiaProfesionalId);
		familiaProfesionalImpl.setCompanyId(companyId);
		familiaProfesionalImpl.setUserId(userId);

		if (userName == null) {
			familiaProfesionalImpl.setUserName(StringPool.BLANK);
		}
		else {
			familiaProfesionalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			familiaProfesionalImpl.setCreateDate(null);
		}
		else {
			familiaProfesionalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			familiaProfesionalImpl.setModifiedDate(null);
		}
		else {
			familiaProfesionalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			familiaProfesionalImpl.setNombre(StringPool.BLANK);
		}
		else {
			familiaProfesionalImpl.setNombre(nombre);
		}

		if (descripcion == null) {
			familiaProfesionalImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			familiaProfesionalImpl.setDescripcion(descripcion);
		}

		familiaProfesionalImpl.setSector(sector);
		familiaProfesionalImpl.setEstado(estado);

		familiaProfesionalImpl.resetOriginalValues();

		return familiaProfesionalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		familiaProfesionalId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		sector = objectInput.readInt();
		estado = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(familiaProfesionalId);
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

		objectOutput.writeInt(sector);
		objectOutput.writeInt(estado);
	}

	public long familiaProfesionalId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String descripcion;
	public int sector;
	public int estado;
}