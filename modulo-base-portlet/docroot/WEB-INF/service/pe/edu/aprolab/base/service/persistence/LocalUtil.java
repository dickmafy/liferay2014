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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import pe.edu.aprolab.base.model.Local;

import java.util.List;

/**
 * The persistence utility for the local service. This utility wraps {@link LocalPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see LocalPersistence
 * @see LocalPersistenceImpl
 * @generated
 */
public class LocalUtil {
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
	public static void clearCache(Local local) {
		getPersistence().clearCache(local);
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
	public static List<Local> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Local> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Local> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Local update(Local local) throws SystemException {
		return getPersistence().update(local);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Local update(Local local, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(local, serviceContext);
	}

	/**
	* Returns all the locals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findByNombre(
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNombre(nombre);
	}

	/**
	* Returns a range of all the locals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @return the range of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findByNombre(
		java.lang.String nombre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNombre(nombre, start, end);
	}

	/**
	* Returns an ordered range of all the locals where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findByNombre(
		java.lang.String nombre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNombre(nombre, start, end, orderByComparator);
	}

	/**
	* Returns the first local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching local
	* @throws pe.edu.aprolab.base.NoSuchLocalException if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local findByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchLocalException {
		return getPersistence().findByNombre_First(nombre, orderByComparator);
	}

	/**
	* Returns the first local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching local, or <code>null</code> if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local fetchByNombre_First(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNombre_First(nombre, orderByComparator);
	}

	/**
	* Returns the last local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching local
	* @throws pe.edu.aprolab.base.NoSuchLocalException if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local findByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchLocalException {
		return getPersistence().findByNombre_Last(nombre, orderByComparator);
	}

	/**
	* Returns the last local in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching local, or <code>null</code> if a matching local could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local fetchByNombre_Last(
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNombre_Last(nombre, orderByComparator);
	}

	/**
	* Returns the locals before and after the current local in the ordered set where nombre = &#63;.
	*
	* @param localId the primary key of the current local
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next local
	* @throws pe.edu.aprolab.base.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local[] findByNombre_PrevAndNext(
		long localId, java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchLocalException {
		return getPersistence()
				   .findByNombre_PrevAndNext(localId, nombre, orderByComparator);
	}

	/**
	* Removes all the locals where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNombre(nombre);
	}

	/**
	* Returns the number of locals where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching locals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNombre(java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNombre(nombre);
	}

	/**
	* Caches the local in the entity cache if it is enabled.
	*
	* @param local the local
	*/
	public static void cacheResult(pe.edu.aprolab.base.model.Local local) {
		getPersistence().cacheResult(local);
	}

	/**
	* Caches the locals in the entity cache if it is enabled.
	*
	* @param locals the locals
	*/
	public static void cacheResult(
		java.util.List<pe.edu.aprolab.base.model.Local> locals) {
		getPersistence().cacheResult(locals);
	}

	/**
	* Creates a new local with the primary key. Does not add the local to the database.
	*
	* @param localId the primary key for the new local
	* @return the new local
	*/
	public static pe.edu.aprolab.base.model.Local create(long localId) {
		return getPersistence().create(localId);
	}

	/**
	* Removes the local with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param localId the primary key of the local
	* @return the local that was removed
	* @throws pe.edu.aprolab.base.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local remove(long localId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchLocalException {
		return getPersistence().remove(localId);
	}

	public static pe.edu.aprolab.base.model.Local updateImpl(
		pe.edu.aprolab.base.model.Local local)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(local);
	}

	/**
	* Returns the local with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchLocalException} if it could not be found.
	*
	* @param localId the primary key of the local
	* @return the local
	* @throws pe.edu.aprolab.base.NoSuchLocalException if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local findByPrimaryKey(long localId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchLocalException {
		return getPersistence().findByPrimaryKey(localId);
	}

	/**
	* Returns the local with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param localId the primary key of the local
	* @return the local, or <code>null</code> if a local with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Local fetchByPrimaryKey(
		long localId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(localId);
	}

	/**
	* Returns all the locals.
	*
	* @return the locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the locals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @return the range of locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the locals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locals
	* @param end the upper bound of the range of locals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of locals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Local> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the locals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of locals.
	*
	* @return the number of locals
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LocalPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LocalPersistence)PortletBeanLocatorUtil.locate(pe.edu.aprolab.base.service.ClpSerializer.getServletContextName(),
					LocalPersistence.class.getName());

			ReferenceRegistry.registerReference(LocalUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LocalPersistence persistence) {
	}

	private static LocalPersistence _persistence;
}