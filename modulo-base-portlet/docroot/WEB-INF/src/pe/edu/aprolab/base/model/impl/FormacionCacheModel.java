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

import pe.edu.aprolab.base.model.Formacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Formacion in entity cache.
 *
 * @author Jorge Loayza Soloisolo
 * @see Formacion
 * @generated
 */
public class FormacionCacheModel implements CacheModel<Formacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{formacionId=");
		sb.append(formacionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Formacion toEntityModel() {
		FormacionImpl formacionImpl = new FormacionImpl();

		formacionImpl.setFormacionId(formacionId);
		formacionImpl.setCompanyId(companyId);

		if (nombre == null) {
			formacionImpl.setNombre(StringPool.BLANK);
		}
		else {
			formacionImpl.setNombre(nombre);
		}

		formacionImpl.resetOriginalValues();

		return formacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		formacionId = objectInput.readLong();
		companyId = objectInput.readLong();
		nombre = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(formacionId);
		objectOutput.writeLong(companyId);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}
	}

	public long formacionId;
	public long companyId;
	public String nombre;
}