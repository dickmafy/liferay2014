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

import pe.edu.aprolab.base.model.Institucion;

import java.util.List;

/**
 * The persistence utility for the institucion service. This utility wraps {@link InstitucionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see InstitucionPersistence
 * @see InstitucionPersistenceImpl
 * @generated
 */
public class InstitucionUtil {
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
	public static void clearCache(Institucion institucion) {
		getPersistence().clearCache(institucion);
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
	public static List<Institucion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Institucion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Institucion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Institucion update(Institucion institucion)
		throws SystemException {
		return getPersistence().update(institucion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Institucion update(Institucion institucion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(institucion, serviceContext);
	}

	/**
	* Returns the institucion where RUC = &#63; or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	*
	* @param RUC the r u c
	* @return the matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion findByRUC(
		java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence().findByRUC(RUC);
	}

	/**
	* Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param RUC the r u c
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion fetchByRUC(
		java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRUC(RUC);
	}

	/**
	* Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param RUC the r u c
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion fetchByRUC(
		java.lang.String RUC, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRUC(RUC, retrieveFromCache);
	}

	/**
	* Removes the institucion where RUC = &#63; from the database.
	*
	* @param RUC the r u c
	* @return the institucion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion removeByRUC(
		java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence().removeByRUC(RUC);
	}

	/**
	* Returns the number of institucions where RUC = &#63;.
	*
	* @param RUC the r u c
	* @return the number of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRUC(java.lang.String RUC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRUC(RUC);
	}

	/**
	* Returns all the institucions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last institucion in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching institucion, or <code>null</code> if a matching institucion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static pe.edu.aprolab.base.model.Institucion[] findByCompanyId_PrevAndNext(
		long institucionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(institucionId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the institucions where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of institucions where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching institucions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Caches the institucion in the entity cache if it is enabled.
	*
	* @param institucion the institucion
	*/
	public static void cacheResult(
		pe.edu.aprolab.base.model.Institucion institucion) {
		getPersistence().cacheResult(institucion);
	}

	/**
	* Caches the institucions in the entity cache if it is enabled.
	*
	* @param institucions the institucions
	*/
	public static void cacheResult(
		java.util.List<pe.edu.aprolab.base.model.Institucion> institucions) {
		getPersistence().cacheResult(institucions);
	}

	/**
	* Creates a new institucion with the primary key. Does not add the institucion to the database.
	*
	* @param institucionId the primary key for the new institucion
	* @return the new institucion
	*/
	public static pe.edu.aprolab.base.model.Institucion create(
		long institucionId) {
		return getPersistence().create(institucionId);
	}

	/**
	* Removes the institucion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion that was removed
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion remove(
		long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence().remove(institucionId);
	}

	public static pe.edu.aprolab.base.model.Institucion updateImpl(
		pe.edu.aprolab.base.model.Institucion institucion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(institucion);
	}

	/**
	* Returns the institucion with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion
	* @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion findByPrimaryKey(
		long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.base.NoSuchInstitucionException {
		return getPersistence().findByPrimaryKey(institucionId);
	}

	/**
	* Returns the institucion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param institucionId the primary key of the institucion
	* @return the institucion, or <code>null</code> if a institucion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Institucion fetchByPrimaryKey(
		long institucionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(institucionId);
	}

	/**
	* Returns all the institucions.
	*
	* @return the institucions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<pe.edu.aprolab.base.model.Institucion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the institucions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of institucions.
	*
	* @return the number of institucions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InstitucionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InstitucionPersistence)PortletBeanLocatorUtil.locate(pe.edu.aprolab.base.service.ClpSerializer.getServletContextName(),
					InstitucionPersistence.class.getName());

			ReferenceRegistry.registerReference(InstitucionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InstitucionPersistence persistence) {
	}

	private static InstitucionPersistence _persistence;
}