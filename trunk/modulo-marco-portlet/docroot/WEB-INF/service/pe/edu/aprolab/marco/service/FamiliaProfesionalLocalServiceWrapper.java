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

package pe.edu.aprolab.marco.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FamiliaProfesionalLocalService}.
 *
 * @author Diego
 * @see FamiliaProfesionalLocalService
 * @generated
 */
public class FamiliaProfesionalLocalServiceWrapper
	implements FamiliaProfesionalLocalService,
		ServiceWrapper<FamiliaProfesionalLocalService> {
	public FamiliaProfesionalLocalServiceWrapper(
		FamiliaProfesionalLocalService familiaProfesionalLocalService) {
		_familiaProfesionalLocalService = familiaProfesionalLocalService;
	}

	/**
	* Adds the familia profesional to the database. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesional the familia profesional
	* @return the familia profesional that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional addFamiliaProfesional(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.addFamiliaProfesional(familiaProfesional);
	}

	/**
	* Creates a new familia profesional with the primary key. Does not add the familia profesional to the database.
	*
	* @param familiaProfesionalId the primary key for the new familia profesional
	* @return the new familia profesional
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional createFamiliaProfesional(
		long familiaProfesionalId) {
		return _familiaProfesionalLocalService.createFamiliaProfesional(familiaProfesionalId);
	}

	/**
	* Deletes the familia profesional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional that was removed
	* @throws PortalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional deleteFamiliaProfesional(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.deleteFamiliaProfesional(familiaProfesionalId);
	}

	/**
	* Deletes the familia profesional from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesional the familia profesional
	* @return the familia profesional that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional deleteFamiliaProfesional(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.deleteFamiliaProfesional(familiaProfesional);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _familiaProfesionalLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional fetchFamiliaProfesional(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.fetchFamiliaProfesional(familiaProfesionalId);
	}

	/**
	* Returns the familia profesional with the primary key.
	*
	* @param familiaProfesionalId the primary key of the familia profesional
	* @return the familia profesional
	* @throws PortalException if a familia profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional getFamiliaProfesional(
		long familiaProfesionalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.getFamiliaProfesional(familiaProfesionalId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<pe.edu.aprolab.marco.model.FamiliaProfesional> getFamiliaProfesionals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.getFamiliaProfesionals(start, end);
	}

	/**
	* Returns the number of familia profesionals.
	*
	* @return the number of familia profesionals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFamiliaProfesionalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.getFamiliaProfesionalsCount();
	}

	/**
	* Updates the familia profesional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param familiaProfesional the familia profesional
	* @return the familia profesional that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional updateFamiliaProfesional(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.updateFamiliaProfesional(familiaProfesional);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _familiaProfesionalLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_familiaProfesionalLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _familiaProfesionalLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public pe.edu.aprolab.marco.model.FamiliaProfesional addFamiliaProfesiona(
		long companyId, java.lang.String nombre, java.lang.String descripcion,
		java.lang.Integer sector, java.lang.Integer estado)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familiaProfesionalLocalService.addFamiliaProfesiona(companyId,
			nombre, descripcion, sector, estado);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FamiliaProfesionalLocalService getWrappedFamiliaProfesionalLocalService() {
		return _familiaProfesionalLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFamiliaProfesionalLocalService(
		FamiliaProfesionalLocalService familiaProfesionalLocalService) {
		_familiaProfesionalLocalService = familiaProfesionalLocalService;
	}

	@Override
	public FamiliaProfesionalLocalService getWrappedService() {
		return _familiaProfesionalLocalService;
	}

	@Override
	public void setWrappedService(
		FamiliaProfesionalLocalService familiaProfesionalLocalService) {
		_familiaProfesionalLocalService = familiaProfesionalLocalService;
	}

	private FamiliaProfesionalLocalService _familiaProfesionalLocalService;
}