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

package com.siagie.sttp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.siagie.sttp.model.Local;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Local in entity cache.
 *
 * @author Diego
 * @see Local
 * @generated
 */
public class LocalCacheModel implements CacheModel<Local>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{localId=");
		sb.append(localId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", estado=");
		sb.append(estado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Local toEntityModel() {
		LocalImpl localImpl = new LocalImpl();

		localImpl.setLocalId(localId);

		if (nombre == null) {
			localImpl.setNombre(StringPool.BLANK);
		}
		else {
			localImpl.setNombre(nombre);
		}

		localImpl.setEstado(estado);

		localImpl.resetOriginalValues();

		return localImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		localId = objectInput.readLong();
		nombre = objectInput.readUTF();
		estado = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(localId);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		objectOutput.writeInt(estado);
	}

	public long localId;
	public String nombre;
	public int estado;
}