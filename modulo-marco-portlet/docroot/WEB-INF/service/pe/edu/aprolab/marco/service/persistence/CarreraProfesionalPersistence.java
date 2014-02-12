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

import pe.edu.aprolab.marco.model.CarreraProfesional;

/**
 * The persistence interface for the carrera profesional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see CarreraProfesionalPersistenceImpl
 * @see CarreraProfesionalUtil
 * @generated
 */
public interface CarreraProfesionalPersistence extends BasePersistence<CarreraProfesional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarreraProfesionalUtil} to access the carrera profesional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the carrera profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findByNombre(
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the carrera profesionals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of carrera profesionals
	* @param end the upper bound of the range of carrera profesionals (not inclusive)
	* @return the range of matching carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findByNombre(
		java.lang.String nombre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the carrera profesionals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of carrera profesionals
	* @param end the upper bound of the range of carrera profesionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findByNombre(
		java.lang.String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first carrera profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching carrera profesional
	* @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a matching carrera profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional findByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;

	/**
	* Returns the first carrera profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching carrera profesional, or <code>null</code> if a matching carrera profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional fetchByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last carrera profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching carrera profesional
	* @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a matching carrera profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional findByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;

	/**
	* Returns the last carrera profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching carrera profesional, or <code>null</code> if a matching carrera profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional fetchByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the carrera profesionals before and after the current carrera profesional in the ordered set where nombre = &#63;.
	*
	* @param carreraProfesionalId the primary key of the current carrera profesional
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next carrera profesional
	* @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional[] findByNombre_PrevAndNext(
		long carreraProfesionalId, java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;

	/**
	* Removes all the carrera profesionals where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carrera profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public int countByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the carrera profesional in the entity cache if it is enabled.
	*
	* @param carreraProfesional the carrera profesional
	*/
	public void cacheResult(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional);

	/**
	* Caches the carrera profesionals in the entity cache if it is enabled.
	*
	* @param carreraProfesionals the carrera profesionals
	*/
	public void cacheResult(
		java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> carreraProfesionals);

	/**
	* Creates a new carrera profesional with the primary key. Does not add the carrera profesional to the database.
	*
	* @param carreraProfesionalId the primary key for the new carrera profesional
	* @return the new carrera profesional
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional create(
		long carreraProfesionalId);

	/**
	* Removes the carrera profesional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param carreraProfesionalId the primary key of the carrera profesional
	* @return the carrera profesional that was removed
	* @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional remove(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;

	public pe.edu.aprolab.marco.model.CarreraProfesional updateImpl(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the carrera profesional with the primary key or throws a {@link pe.edu.aprolab.marco.NoSuchCarreraProfesionalException} if it could not be found.
	*
	* @param carreraProfesionalId the primary key of the carrera profesional
	* @return the carrera profesional
	* @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional findByPrimaryKey(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;

	/**
	* Returns the carrera profesional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param carreraProfesionalId the primary key of the carrera profesional
	* @return the carrera profesional, or <code>null</code> if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional fetchByPrimaryKey(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the carrera profesionals.
	*
	* @return the carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the carrera profesionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carrera profesionals
	* @param end the upper bound of the range of carrera profesionals (not inclusive)
	* @return the range of carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the carrera profesionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carrera profesionals
	* @param end the upper bound of the range of carrera profesionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the carrera profesionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carrera profesionals.
	*
	* @return the number of carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}