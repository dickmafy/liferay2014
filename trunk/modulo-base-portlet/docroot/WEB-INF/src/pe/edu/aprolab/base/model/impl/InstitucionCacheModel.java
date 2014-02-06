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

package pe.edu.aprolab.base.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import pe.edu.aprolab.base.model.Institucion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Institucion in entity cache.
 *
 * @author Jorge Loayza Soloisolo
 * @see Institucion
 * @generated
 */
public class InstitucionCacheModel implements CacheModel<Institucion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{institucionId=");
		sb.append(institucionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", codigoId=");
		sb.append(codigoId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Institucion toEntityModel() {
		InstitucionImpl institucionImpl = new InstitucionImpl();

		institucionImpl.setInstitucionId(institucionId);
		institucionImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			institucionImpl.setCreateDate(null);
		}
		else {
			institucionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			institucionImpl.setModifiedDate(null);
		}
		else {
			institucionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (codigoId == null) {
			institucionImpl.setCodigoId(StringPool.BLANK);
		}
		else {
			institucionImpl.setCodigoId(codigoId);
		}

		if (nombre == null) {
			institucionImpl.setNombre(StringPool.BLANK);
		}
		else {
			institucionImpl.setNombre(nombre);
		}

		institucionImpl.resetOriginalValues();

		return institucionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		institucionId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		codigoId = objectInput.readUTF();
		nombre = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(institucionId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (codigoId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codigoId);
		}

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}
	}

	public long institucionId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String codigoId;
	public String nombre;
}