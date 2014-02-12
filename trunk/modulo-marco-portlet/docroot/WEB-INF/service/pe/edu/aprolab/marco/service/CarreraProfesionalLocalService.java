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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for CarreraProfesional. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Diego
 * @see CarreraProfesionalLocalServiceUtil
 * @see pe.edu.aprolab.marco.service.base.CarreraProfesionalLocalServiceBaseImpl
 * @see pe.edu.aprolab.marco.service.impl.CarreraProfesionalLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CarreraProfesionalLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarreraProfesionalLocalServiceUtil} to access the carrera profesional local service. Add custom service methods to {@link pe.edu.aprolab.marco.service.impl.CarreraProfesionalLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the carrera profesional to the database. Also notifies the appropriate model listeners.
	*
	* @param carreraProfesional the carrera profesional
	* @return the carrera profesional that was added
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional addCarreraProfesional(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new carrera profesional with the primary key. Does not add the carrera profesional to the database.
	*
	* @param carreraProfesionalId the primary key for the new carrera profesional
	* @return the new carrera profesional
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional createCarreraProfesional(
		long carreraProfesionalId);

	/**
	* Deletes the carrera profesional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param carreraProfesionalId the primary key of the carrera profesional
	* @return the carrera profesional that was removed
	* @throws PortalException if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional deleteCarreraProfesional(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the carrera profesional from the database. Also notifies the appropriate model listeners.
	*
	* @param carreraProfesional the carrera profesional
	* @return the carrera profesional that was removed
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional deleteCarreraProfesional(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public pe.edu.aprolab.marco.model.CarreraProfesional fetchCarreraProfesional(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the carrera profesional with the primary key.
	*
	* @param carreraProfesionalId the primary key of the carrera profesional
	* @return the carrera profesional
	* @throws PortalException if a carrera profesional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public pe.edu.aprolab.marco.model.CarreraProfesional getCarreraProfesional(
		long carreraProfesionalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<pe.edu.aprolab.marco.model.CarreraProfesional> getCarreraProfesionals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carrera profesionals.
	*
	* @return the number of carrera profesionals
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCarreraProfesionalsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the carrera profesional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param carreraProfesional the carrera profesional
	* @return the carrera profesional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.marco.model.CarreraProfesional updateCarreraProfesional(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public pe.edu.aprolab.marco.model.CarreraProfesional addCarreraProfesional(
		long companyId, java.lang.String nombre, java.lang.String descripcion,
		java.lang.Integer formacion, java.util.Date duracionFechaInicio,
		java.util.Date duracionFechaFin, java.lang.Integer estado)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}