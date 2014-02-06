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

package pe.edu.aprolab.identidad.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import pe.edu.aprolab.identidad.model.Persona;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Persona in entity cache.
 *
 * @author Jorge Loayza Soloisolo
 * @see Persona
 * @generated
 */
public class PersonaCacheModel implements CacheModel<Persona>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{personaId=");
		sb.append(personaId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", codigoId=");
		sb.append(codigoId);
		sb.append(", nombres=");
		sb.append(nombres);
		sb.append(", apellidoPaterno=");
		sb.append(apellidoPaterno);
		sb.append(", apellidoMaterno=");
		sb.append(apellidoMaterno);
		sb.append(", genero=");
		sb.append(genero);
		sb.append(", estadoCivil=");
		sb.append(estadoCivil);
		sb.append(", fechaNacimiento=");
		sb.append(fechaNacimiento);
		sb.append(", ubigeoNacimiento=");
		sb.append(ubigeoNacimiento);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Persona toEntityModel() {
		PersonaImpl personaImpl = new PersonaImpl();

		personaImpl.setPersonaId(personaId);
		personaImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			personaImpl.setCreateDate(null);
		}
		else {
			personaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			personaImpl.setModifiedDate(null);
		}
		else {
			personaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (codigoId == null) {
			personaImpl.setCodigoId(StringPool.BLANK);
		}
		else {
			personaImpl.setCodigoId(codigoId);
		}

		if (nombres == null) {
			personaImpl.setNombres(StringPool.BLANK);
		}
		else {
			personaImpl.setNombres(nombres);
		}

		if (apellidoPaterno == null) {
			personaImpl.setApellidoPaterno(StringPool.BLANK);
		}
		else {
			personaImpl.setApellidoPaterno(apellidoPaterno);
		}

		if (apellidoMaterno == null) {
			personaImpl.setApellidoMaterno(StringPool.BLANK);
		}
		else {
			personaImpl.setApellidoMaterno(apellidoMaterno);
		}

		personaImpl.setGenero(genero);
		personaImpl.setEstadoCivil(estadoCivil);

		if (fechaNacimiento == Long.MIN_VALUE) {
			personaImpl.setFechaNacimiento(null);
		}
		else {
			personaImpl.setFechaNacimiento(new Date(fechaNacimiento));
		}

		if (ubigeoNacimiento == null) {
			personaImpl.setUbigeoNacimiento(StringPool.BLANK);
		}
		else {
			personaImpl.setUbigeoNacimiento(ubigeoNacimiento);
		}

		personaImpl.resetOriginalValues();

		return personaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		personaId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		codigoId = objectInput.readUTF();
		nombres = objectInput.readUTF();
		apellidoPaterno = objectInput.readUTF();
		apellidoMaterno = objectInput.readUTF();
		genero = objectInput.readBoolean();
		estadoCivil = objectInput.readInt();
		fechaNacimiento = objectInput.readLong();
		ubigeoNacimiento = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(personaId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (codigoId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codigoId);
		}

		if (nombres == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombres);
		}

		if (apellidoPaterno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(apellidoPaterno);
		}

		if (apellidoMaterno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(apellidoMaterno);
		}

		objectOutput.writeBoolean(genero);
		objectOutput.writeInt(estadoCivil);
		objectOutput.writeLong(fechaNacimiento);

		if (ubigeoNacimiento == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ubigeoNacimiento);
		}
	}

	public long personaId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String codigoId;
	public String nombres;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public boolean genero;
	public int estadoCivil;
	public long fechaNacimiento;
	public String ubigeoNacimiento;
}