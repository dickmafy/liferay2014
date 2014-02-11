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

package pe.edu.aprolab.marco.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import pe.edu.aprolab.marco.model.FamiliaProfesional;

/**
 * The persistence interface for the familia profesional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see FamiliaProfesionalPersistenceImpl
 * @see FamiliaProfesionalUtil
 * @generated
 */
public interface FamiliaProfesionalPersistence extends BasePersistence<FamiliaProfesional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FamiliaProfesionalUtil} to access the familia profesional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the familia profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the familia profesionals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of familia profesionals
	* @param end the upper bound of the range of familia profesionals (not inclusive)
	* @return the range of matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the familia profesionals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of familia profesionals
	* @param end the upper bound of the range of familia profesionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional findByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;

	/**
	* Returns the first familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional fetchByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional findByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;

	/**
	* Returns the last familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional fetchByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the familia profesionals before and after the current familia profesional in the ordered set where nombre = &#63;.
	*
	* @param familiaProfesionalId the primary key of the current familia profesional
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional[] findByNombre_PrevAndNext(
		long familiaProfesionalId, java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;

	/**
	* Removes all the familia profesionals where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of familia profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public int countByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the familia profesional in the entity cache if it is enabled.
	*
	* @param familiaProfesional the familia profesional
	*/
	public void cacheResult(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional);

	/**
	* Caches the familia profesionals in the entity cache if it is enabled.
	*
	* @param familiaProfesionals the familia profesionals
	*/
	public void cacheResult(
		java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> familiaProfesionals);

	/**
	* Creates a new familia profesional with the primary key. Does not add the familia profesional to the database.
	*
	* @param familiaProfesionalId the primary key for the new familia profesional
	* @return the new familia profesional
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional create(
		long familiaProfesionalId);

	/**
	* Removes the familia profesional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional that was removed
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional remove(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;

	public pe.edu.aprolab.marco.model.FamiliaProfesional updateImpl(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the familia profesional with the primary key or throws a {@link pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException} if it could not be found.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional findByPrimaryKey(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;

	/**
	* Returns the familia profesional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional, or <code>null</code> if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.FamiliaProfesional fetchByPrimaryKey(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the familia profesionals.
	*
	* @return the familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the familia profesionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of familia profesionals
	* @param end the upper bound of the range of familia profesionals (not inclusive)
	* @return the range of familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the familia profesionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of familia profesionals
	* @param end the upper bound of the range of familia profesionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the familia profesionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of familia profesionals.
	*
	* @return the number of familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}