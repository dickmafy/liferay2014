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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Institucion service. Represents a row in the &quot;BASE_Institucion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link pe.edu.aprolab.base.model.impl.InstitucionImpl}.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see Institucion
 * @see pe.edu.aprolab.base.model.impl.InstitucionImpl
 * @see pe.edu.aprolab.base.model.impl.InstitucionModelImpl
 * @generated
 */
public interface InstitucionModel extends BaseModel<Institucion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a institucion model instance should use the {@link Institucion} interface instead.
	 */

	/**
	 * Returns the primary key of this institucion.
	 *
	 * @return the primary key of this institucion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this institucion.
	 *
	 * @param primaryKey the primary key of this institucion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the institucion ID of this institucion.
	 *
	 * @return the institucion ID of this institucion
	 */
	public long getInstitucionId();

	/**
	 * Sets the institucion ID of this institucion.
	 *
	 * @param institucionId the institucion ID of this institucion
	 */
	public void setInstitucionId(long institucionId);

	/**
	 * Returns the company ID of this institucion.
	 *
	 * @return the company ID of this institucion
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this institucion.
	 *
	 * @param companyId the company ID of this institucion
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this institucion.
	 *
	 * @return the create date of this institucion
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this institucion.
	 *
	 * @param createDate the create date of this institucion
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this institucion.
	 *
	 * @return the modified date of this institucion
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this institucion.
	 *
	 * @param modifiedDate the modified date of this institucion
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the formacion ID of this institucion.
	 *
	 * @return the formacion ID of this institucion
	 */
	public long getFormacionId();

	/**
	 * Sets the formacion ID of this institucion.
	 *
	 * @param formacionId the formacion ID of this institucion
	 */
	public void setFormacionId(long formacionId);

	/**
	 * Returns the r u c of this institucion.
	 *
	 * @return the r u c of this institucion
	 */
	@AutoEscape
	public String getRUC();

	/**
	 * Sets the r u c of this institucion.
	 *
	 * @param RUC the r u c of this institucion
	 */
	public void setRUC(String RUC);

	/**
	 * Returns the codigo modular of this institucion.
	 *
	 * @return the codigo modular of this institucion
	 */
	@AutoEscape
	public String getCodigoModular();

	/**
	 * Sets the codigo modular of this institucion.
	 *
	 * @param codigoModular the codigo modular of this institucion
	 */
	public void setCodigoModular(String codigoModular);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Institucion institucion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Institucion> toCacheModel();

	@Override
	public Institucion toEscapedModel();

	@Override
	public Institucion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}