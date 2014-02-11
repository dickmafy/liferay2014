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

package pe.edu.aprolab.base.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Jorge Loayza Soloisolo
 */
public class InstitucionPK implements Comparable<InstitucionPK>, Serializable {
	public long institucionId;
	public String RUC;
	public String codigoModular;

	public InstitucionPK() {
	}

	public InstitucionPK(long institucionId, String RUC, String codigoModular) {
		this.institucionId = institucionId;
		this.RUC = RUC;
		this.codigoModular = codigoModular;
	}

	public long getInstitucionId() {
		return institucionId;
	}

	public void setInstitucionId(long institucionId) {
		this.institucionId = institucionId;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String RUC) {
		this.RUC = RUC;
	}

	public String getCodigoModular() {
		return codigoModular;
	}

	public void setCodigoModular(String codigoModular) {
		this.codigoModular = codigoModular;
	}

	@Override
	public int compareTo(InstitucionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (institucionId < pk.institucionId) {
			value = -1;
		}
		else if (institucionId > pk.institucionId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = RUC.compareTo(pk.RUC);

		if (value != 0) {
			return value;
		}

		value = codigoModular.compareTo(pk.codigoModular);

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

		if (!(obj instanceof InstitucionPK)) {
			return false;
		}

		InstitucionPK pk = (InstitucionPK)obj;

		if ((institucionId == pk.institucionId) && (RUC.equals(pk.RUC)) &&
				(codigoModular.equals(pk.codigoModular))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(institucionId) + String.valueOf(RUC) +
		String.valueOf(codigoModular)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("institucionId");
		sb.append(StringPool.EQUAL);
		sb.append(institucionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("RUC");
		sb.append(StringPool.EQUAL);
		sb.append(RUC);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("codigoModular");
		sb.append(StringPool.EQUAL);
		sb.append(codigoModular);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}