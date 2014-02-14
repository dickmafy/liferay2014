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

package pe.edu.aprolab.base.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Formacion. This utility wraps
 * {@link pe.edu.aprolab.base.service.impl.FormacionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jorge Loayza Soloisolo
 * @see FormacionLocalService
 * @see pe.edu.aprolab.base.service.base.FormacionLocalServiceBaseImpl
 * @see pe.edu.aprolab.base.service.impl.FormacionLocalServiceImpl
 * @generated
 */
public class FormacionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link pe.edu.aprolab.base.service.impl.FormacionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the formacion to the database. Also notifies the appropriate model listeners.
	*
	* @param formacion the formacion
	* @return the formacion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Formacion addFormacion(
		pe.edu.aprolab.base.model.Formacion formacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFormacion(formacion);
	}

	/**
	* Creates a new formacion with the primary key. Does not add the formacion to the database.
	*
	* @param formacionId the primary key for the new formacion
	* @return the new formacion
	*/
	public static pe.edu.aprolab.base.model.Formacion createFormacion(
		long formacionId) {
		return getService().createFormacion(formacionId);
	}

	/**
	* Deletes the formacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formacionId the primary key of the formacion
	* @return the formacion that was removed
	* @throws PortalException if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Formacion deleteFormacion(
		long formacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFormacion(formacionId);
	}

	/**
	* Deletes the formacion from the database. Also notifies the appropriate model listeners.
	*
	* @param formacion the formacion
	* @return the formacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Formacion deleteFormacion(
		pe.edu.aprolab.base.model.Formacion formacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFormacion(formacion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static pe.edu.aprolab.base.model.Formacion fetchFormacion(
		long formacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFormacion(formacionId);
	}

	/**
	* Returns the formacion with the primary key.
	*
	* @param formacionId the primary key of the formacion
	* @return the formacion
	* @throws PortalException if a formacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Formacion getFormacion(
		long formacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFormacion(formacionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<pe.edu.aprolab.base.model.Formacion> getFormacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFormacions(start, end);
	}

	/**
	* Returns the number of formacions.
	*
	* @return the number of formacions
	* @throws SystemException if a system exception occurred
	*/
	public static int getFormacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFormacionsCount();
	}

	/**
	* Updates the formacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param formacion the formacion
	* @return the formacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static pe.edu.aprolab.base.model.Formacion updateFormacion(
		pe.edu.aprolab.base.model.Formacion formacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFormacion(formacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static FormacionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FormacionLocalService.class.getName());

			if (invokableLocalService instanceof FormacionLocalService) {
				_service = (FormacionLocalService)invokableLocalService;
			}
			else {
				_service = new FormacionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FormacionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FormacionLocalService service) {
	}

	private static FormacionLocalService _service;
}