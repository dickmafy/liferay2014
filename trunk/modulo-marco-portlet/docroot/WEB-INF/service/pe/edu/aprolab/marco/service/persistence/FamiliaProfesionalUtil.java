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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import pe.edu.aprolab.marco.model.FamiliaProfesional;

import java.util.List;

/**
 * The persistence utility for the familia profesional service. This utility wraps {@link FamiliaProfesionalPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see FamiliaProfesionalPersistence
 * @see FamiliaProfesionalPersistenceImpl
 * @generated
 */
public class FamiliaProfesionalUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FamiliaProfesional familiaProfesional) {
		getPersistence().clearCache(familiaProfesional);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FamiliaProfesional> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FamiliaProfesional> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FamiliaProfesional> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FamiliaProfesional update(
		FamiliaProfesional familiaProfesional) throws SystemException {
		return getPersistence().update(familiaProfesional);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FamiliaProfesional update(
		FamiliaProfesional familiaProfesional, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(familiaProfesional, serviceContext);
	}

	/**
	* Returns all the familia profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNombre(nombre);
	}

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
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNombre(nombre, start, end);
	}

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
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findByNombre(
		java.lang.String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNombre(nombre, start, end, orderByComparator);
	}

	/**
	* Returns the first familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional findByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException {
		return getPersistence().findByNombre_First(nombre, orderByComparator);
	}

	/**
	* Returns the first familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional fetchByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNombre_First(nombre, orderByComparator);
	}

	/**
	* Returns the last familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional findByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException {
		return getPersistence().findByNombre_Last(nombre, orderByComparator);
	}

	/**
	* Returns the last familia profesional in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional fetchByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNombre_Last(nombre, orderByComparator);
	}

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
	public static pe.edu.aprolab.marco.model.FamiliaProfesional[] findByNombre_PrevAndNext(
		long familiaProfesionalId, java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException {
		return getPersistence()
				   .findByNombre_PrevAndNext(familiaProfesionalId, nombre,
			orderByComparator);
	}

	/**
	* Removes all the familia profesionals where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNombre(nombre);
	}

	/**
	* Returns the number of familia profesionals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNombre(nombre);
	}

	/**
	* Caches the familia profesional in the entity cache if it is enabled.
	*
	* @param familiaProfesional the familia profesional
	*/
	public static void cacheResult(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional) {
		getPersistence().cacheResult(familiaProfesional);
	}

	/**
	* Caches the familia profesionals in the entity cache if it is enabled.
	*
	* @param familiaProfesionals the familia profesionals
	*/
	public static void cacheResult(
		java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> familiaProfesionals) {
		getPersistence().cacheResult(familiaProfesionals);
	}

	/**
	* Creates a new familia profesional with the primary key. Does not add the familia profesional to the database.
	*
	* @param familiaProfesionalId the primary key for the new familia profesional
	* @return the new familia profesional
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional create(
		long familiaProfesionalId) {
		return getPersistence().create(familiaProfesionalId);
	}

	/**
	* Removes the familia profesional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional that was removed
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional remove(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException {
		return getPersistence().remove(familiaProfesionalId);
	}

	public static pe.edu.aprolab.marco.model.FamiliaProfesional updateImpl(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(familiaProfesional);
	}

	/**
	* Returns the familia profesional with the primary key or throws a {@link pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException} if it could not be found.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional
	* @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional findByPrimaryKey(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException {
		return getPersistence().findByPrimaryKey(familiaProfesionalId);
	}

	/**
	* Returns the familia profesional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional, or <code>null</code> if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.marco.model.FamiliaProfesional fetchByPrimaryKey(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(familiaProfesionalId);
	}

	/**
	* Returns all the familia profesionals.
	*
	* @return the familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the familia profesionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of familia profesionals.
	*
	* @return the number of familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FamiliaProfesionalPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FamiliaProfesionalPersistence)PortletBeanLocatorUtil.locate(pe.edu.aprolab.marco.service.ClpSerializer.getServletContextName(),
					FamiliaProfesionalPersistence.class.getName());

			ReferenceRegistry.registerReference(FamiliaProfesionalUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FamiliaProfesionalPersistence persistence) {
	}

	private static FamiliaProfesionalPersistence _persistence;
}