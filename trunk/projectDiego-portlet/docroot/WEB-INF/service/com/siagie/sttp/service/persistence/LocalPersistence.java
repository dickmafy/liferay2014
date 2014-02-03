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

package com.siagie.sttp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.siagie.sttp.model.Local;

/**
 * The persistence interface for the local service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see LocalPersistenceImpl
 * @see LocalUtil
 * @generated
 */
public interface LocalPersistence extends BasePersistence<Local> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LocalUtil} to access the local persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the locals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findByBuscarNombre(
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @return the range of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findByBuscarNombre(
		java.lang.String nombre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findByBuscarNombre(
		java.lang.String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching local
	* @throws com.siagie.sttp.NoSuchLocalException if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local findByBuscarNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.siagie.sttp.NoSuchLocalException;

	/**
	* Returns the first local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching local, or <code>null</code> if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local fetchByBuscarNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching local
	* @throws com.siagie.sttp.NoSuchLocalException if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local findByBuscarNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.siagie.sttp.NoSuchLocalException;

	/**
	* Returns the last local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching local, or <code>null</code> if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local fetchByBuscarNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locals before and after the current local in the ordered set where nombre = &#63;.
	*
	* @param localId the primary key of the current local
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next local
	* @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local[] findByBuscarNombre_PrevAndNext(
		long localId, java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.siagie.sttp.NoSuchLocalException;

	/**
	* Removes all the locals where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBuscarNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public int countByBuscarNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the local in the entity cache if it is enabled.
	*
	* @param local the local
	*/
	public void cacheResult(com.siagie.sttp.model.Local local);

	/**
	* Caches the locals in the entity cache if it is enabled.
	*
	* @param locals the locals
	*/
	public void cacheResult(java.util.List<com.siagie.sttp.model.Local> locals);

	/**
	* Creates a new local with the primary key. Does not add the local to the database.
	*
	* @param localId the primary key for the new local
	* @return the new local
	*/
	public com.siagie.sttp.model.Local create(long localId);

	/**
	* Removes the local with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param localId the primary key of the local
	* @return the local that was removed
	* @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local remove(long localId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.siagie.sttp.NoSuchLocalException;

	public com.siagie.sttp.model.Local updateImpl(
		com.siagie.sttp.model.Local local)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the local with the primary key or throws a {@link com.siagie.sttp.NoSuchLocalException} if it could not be found.
	*
	* @param localId the primary key of the local
	* @return the local
	* @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local findByPrimaryKey(long localId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.siagie.sttp.NoSuchLocalException;

	/**
	* Returns the local with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param localId the primary key of the local
	* @return the local, or <code>null</code> if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.siagie.sttp.model.Local fetchByPrimaryKey(long localId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locals.
	*
	* @return the locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @return the range of locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of locals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.siagie.sttp.model.Local> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the locals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locals.
	*
	* @return the number of locals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}