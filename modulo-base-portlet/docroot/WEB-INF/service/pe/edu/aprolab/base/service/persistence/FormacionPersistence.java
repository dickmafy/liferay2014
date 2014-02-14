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

import pe.edu.aprolab.base.model.Formacion;

/**
 * The persistence interface for the formacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see FormacionPersistenceImpl
 * @see FormacionUtil
 * @generated
 */
public interface FormacionPersistence extends BasePersistence<Formacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FormacionUtil} to access the formacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the formacions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the formacions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of formacions
	* @param end the upper bound of the range of formacions (not inclusive)
	* @return the range of matching formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the formacions where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of formacions
	* @param end the upper bound of the range of formacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first formacion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formacion
	* @throws pe.edu.aprolab.base.NoSuchFormacionException if a matching formacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchFormacionException;

	/**
	* Returns the first formacion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formacion, or <code>null</code> if a matching formacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last formacion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formacion
	* @throws pe.edu.aprolab.base.NoSuchFormacionException if a matching formacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchFormacionException;

	/**
	* Returns the last formacion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formacion, or <code>null</code> if a matching formacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the formacions before and after the current formacion in the ordered set where companyId = &#63;.
	*
	* @param formacionId the primary key of the current formacion
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formacion
	* @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion[] findByCompanyId_PrevAndNext(
		long formacionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchFormacionException;

	/**
	* Removes all the formacions where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of formacions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching formacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the formacion in the entity cache if it is enabled.
	*
	* @param formacion the formacion
	*/
	public void cacheResult(pe.edu.aprolab.base.model.Formacion formacion);

	/**
	* Caches the formacions in the entity cache if it is enabled.
	*
	* @param formacions the formacions
	*/
	public void cacheResult(
		java.util.List<pe.edu.aprolab.base.model.Formacion> formacions);

	/**
	* Creates a new formacion with the primary key. Does not add the formacion to the database.
	*
	* @param formacionId the primary key for the new formacion
	* @return the new formacion
	*/
	public pe.edu.aprolab.base.model.Formacion create(long formacionId);

	/**
	* Removes the formacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formacionId the primary key of the formacion
	* @return the formacion that was removed
	* @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion remove(long formacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchFormacionException;

	public pe.edu.aprolab.base.model.Formacion updateImpl(
		pe.edu.aprolab.base.model.Formacion formacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the formacion with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchFormacionException} if it could not be found.
	*
	* @param formacionId the primary key of the formacion
	* @return the formacion
	* @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion findByPrimaryKey(
		long formacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchFormacionException;

	/**
	* Returns the formacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param formacionId the primary key of the formacion
	* @return the formacion, or <code>null</code> if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.base.model.Formacion fetchByPrimaryKey(
		long formacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the formacions.
	*
	* @return the formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the formacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formacions
	* @param end the upper bound of the range of formacions (not inclusive)
	* @return the range of formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the formacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formacions
	* @param end the upper bound of the range of formacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of formacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.base.model.Formacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the formacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of formacions.
	*
	* @return the number of formacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}