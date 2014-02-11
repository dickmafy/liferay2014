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

import com.liferay.portal.service.persistence.BasePersistence;

import pe.edu.aprolab.base.model.Institucion;

/**
 * The persistence interface for the institucion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see InstitucionPersistenceImpl
 * @see InstitucionUtil
 * @generated
 */
public interface InstitucionPersistence extends BasePersistence<Institucion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstitucionUtil} to access the institucion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the institucion where RUC = &#63; or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	*
	* @param RUC the r u c
	* @return the matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion findByRUC(java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param RUC the r u c
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByRUC(
		java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param RUC the r u c
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByRUC(
		java.lang.String RUC, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the institucion where RUC = &#63; from the database.
	*
	* @param RUC the r u c
	* @return the institucion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion removeByRUC(
		java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the number of institucions where RUC = &#63;.
	*
	* @param RUC the r u c
	* @return the number of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public int countByRUC(java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the institucion where codigoModular = &#63; or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	*
	* @param codigoModular the codigo modular
	* @return the matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion findByCodigoModular(
		java.lang.String codigoModular)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the institucion where codigoModular = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codigoModular the codigo modular
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByCodigoModular(
		java.lang.String codigoModular)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the institucion where codigoModular = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codigoModular the codigo modular
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByCodigoModular(
		java.lang.String codigoModular, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the institucion where codigoModular = &#63; from the database.
	*
	* @param codigoModular the codigo modular
	* @return the institucion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion removeByCodigoModular(
		java.lang.String codigoModular)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the number of institucions where codigoModular = &#63;.
	*
	* @param codigoModular the codigo modular
	* @return the number of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodigoModular(java.lang.String codigoModular)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the institucions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the institucions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of institucions
	* @param end the upper bound of the range of institucions (not inclusive)
	* @return the range of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the institucions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of institucions
	* @param end the upper bound of the range of institucions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the first institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the last institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the institucions before and after the current institucion in the ordered set where companyId = &#63;.
	*
	* @param institucionId the primary key of the current institucion
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion[] findByCompanyId_PrevAndNext(
		long institucionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Removes all the institucions where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of institucions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the institucion in the entity cache if it is enabled.
	*
	* @param institucion the institucion
	*/
	public void cacheResult(pe.edu.aprolab.base.model.Institucion institucion);

	/**
	* Caches the institucions in the entity cache if it is enabled.
	*
	* @param institucions the institucions
	*/
	public void cacheResult(
		java.util.List<pe.edu.aprolab.base.model.Institucion> institucions);

	/**
	* Creates a new institucion with the primary key. Does not add the institucion to the database.
	*
	* @param institucionId the primary key for the new institucion
	* @return the new institucion
	*/
	public pe.edu.aprolab.base.model.Institucion create(long institucionId);

	/**
	* Removes the institucion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion that was removed
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion remove(long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	public pe.edu.aprolab.base.model.Institucion updateImpl(
		pe.edu.aprolab.base.model.Institucion institucion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the institucion with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion findByPrimaryKey(
		long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException;

	/**
	* Returns the institucion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion, or <code>null</code> if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Institucion fetchByPrimaryKey(
		long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the institucions.
	*
	* @return the institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the institucions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of institucions
	* @param end the upper bound of the range of institucions (not inclusive)
	* @return the range of institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the institucions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of institucions
	* @param end the upper bound of the range of institucions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of institucions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Institucion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the institucions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of institucions.
	*
	* @return the number of institucions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}