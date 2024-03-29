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

package pe.edu.aprolab.marco.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import pe.edu.aprolab.marco.model.CarreraProfesional;
import pe.edu.aprolab.marco.service.CarreraProfesionalLocalService;
import pe.edu.aprolab.marco.service.persistence.CarreraProfesionalPersistence;
import pe.edu.aprolab.marco.service.persistence.FamiliaProfesionalPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the carrera profesional local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link pe.edu.aprolab.marco.service.impl.CarreraProfesionalLocalServiceImpl}.
 * </p>
 *
 * @author Diego
 * @see pe.edu.aprolab.marco.service.impl.CarreraProfesionalLocalServiceImpl
 * @see pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil
 * @generated
 */
public abstract class CarreraProfesionalLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements CarreraProfesionalLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pe.edu.aprolab.marco.service.CarreraProfesionalLocalServiceUtil} to access the carrera profesional local service.
	 */

	/**
	 * Adds the carrera profesional to the database. Also notifies the appropriate model listeners.
	 *
	 * @param carreraProfesional the carrera profesional
	 * @return the carrera profesional that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CarreraProfesional addCarreraProfesional(
		CarreraProfesional carreraProfesional) throws SystemException {
		carreraProfesional.setNew(true);

		return carreraProfesionalPersistence.update(carreraProfesional);
	}

	/**
	 * Creates a new carrera profesional with the primary key. Does not add the carrera profesional to the database.
	 *
	 * @param carreraProfesionalId the primary key for the new carrera profesional
	 * @return the new carrera profesional
	 */
	@Override
	public CarreraProfesional createCarreraProfesional(
		long carreraProfesionalId) {
		return carreraProfesionalPersistence.create(carreraProfesionalId);
	}

	/**
	 * Deletes the carrera profesional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carreraProfesionalId the primary key of the carrera profesional
	 * @return the carrera profesional that was removed
	 * @throws PortalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CarreraProfesional deleteCarreraProfesional(
		long carreraProfesionalId) throws PortalException, SystemException {
		return carreraProfesionalPersistence.remove(carreraProfesionalId);
	}

	/**
	 * Deletes the carrera profesional from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carreraProfesional the carrera profesional
	 * @return the carrera profesional that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CarreraProfesional deleteCarreraProfesional(
		CarreraProfesional carreraProfesional) throws SystemException {
		return carreraProfesionalPersistence.remove(carreraProfesional);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(CarreraProfesional.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return carreraProfesionalPersistence.findWithDynamicQuery(dynamicQuery);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return carreraProfesionalPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return carreraProfesionalPersistence.findWithDynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return carreraProfesionalPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return carreraProfesionalPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public CarreraProfesional fetchCarreraProfesional(long carreraProfesionalId)
		throws SystemException {
		return carreraProfesionalPersistence.fetchByPrimaryKey(carreraProfesionalId);
	}

	/**
	 * Returns the carrera profesional with the primary key.
	 *
	 * @param carreraProfesionalId the primary key of the carrera profesional
	 * @return the carrera profesional
	 * @throws PortalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional getCarreraProfesional(long carreraProfesionalId)
		throws PortalException, SystemException {
		return carreraProfesionalPersistence.findByPrimaryKey(carreraProfesionalId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return carreraProfesionalPersistence.findByPrimaryKey(primaryKeyObj);
	}

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
	@Override
	public List<CarreraProfesional> getCarreraProfesionals(int start, int end)
		throws SystemException {
		return carreraProfesionalPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of carrera profesionals.
	 *
	 * @return the number of carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCarreraProfesionalsCount() throws SystemException {
		return carreraProfesionalPersistence.countAll();
	}

	/**
	 * Updates the carrera profesional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param carreraProfesional the carrera profesional
	 * @return the carrera profesional that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CarreraProfesional updateCarreraProfesional(
		CarreraProfesional carreraProfesional) throws SystemException {
		return carreraProfesionalPersistence.update(carreraProfesional);
	}

	/**
	 * Returns the carrera profesional local service.
	 *
	 * @return the carrera profesional local service
	 */
	public pe.edu.aprolab.marco.service.CarreraProfesionalLocalService getCarreraProfesionalLocalService() {
		return carreraProfesionalLocalService;
	}

	/**
	 * Sets the carrera profesional local service.
	 *
	 * @param carreraProfesionalLocalService the carrera profesional local service
	 */
	public void setCarreraProfesionalLocalService(
		pe.edu.aprolab.marco.service.CarreraProfesionalLocalService carreraProfesionalLocalService) {
		this.carreraProfesionalLocalService = carreraProfesionalLocalService;
	}

	/**
	 * Returns the carrera profesional persistence.
	 *
	 * @return the carrera profesional persistence
	 */
	public CarreraProfesionalPersistence getCarreraProfesionalPersistence() {
		return carreraProfesionalPersistence;
	}

	/**
	 * Sets the carrera profesional persistence.
	 *
	 * @param carreraProfesionalPersistence the carrera profesional persistence
	 */
	public void setCarreraProfesionalPersistence(
		CarreraProfesionalPersistence carreraProfesionalPersistence) {
		this.carreraProfesionalPersistence = carreraProfesionalPersistence;
	}

	/**
	 * Returns the familia profesional local service.
	 *
	 * @return the familia profesional local service
	 */
	public pe.edu.aprolab.marco.service.FamiliaProfesionalLocalService getFamiliaProfesionalLocalService() {
		return familiaProfesionalLocalService;
	}

	/**
	 * Sets the familia profesional local service.
	 *
	 * @param familiaProfesionalLocalService the familia profesional local service
	 */
	public void setFamiliaProfesionalLocalService(
		pe.edu.aprolab.marco.service.FamiliaProfesionalLocalService familiaProfesionalLocalService) {
		this.familiaProfesionalLocalService = familiaProfesionalLocalService;
	}

	/**
	 * Returns the familia profesional persistence.
	 *
	 * @return the familia profesional persistence
	 */
	public FamiliaProfesionalPersistence getFamiliaProfesionalPersistence() {
		return familiaProfesionalPersistence;
	}

	/**
	 * Sets the familia profesional persistence.
	 *
	 * @param familiaProfesionalPersistence the familia profesional persistence
	 */
	public void setFamiliaProfesionalPersistence(
		FamiliaProfesionalPersistence familiaProfesionalPersistence) {
		this.familiaProfesionalPersistence = familiaProfesionalPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("pe.edu.aprolab.marco.model.CarreraProfesional",
			carreraProfesionalLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"pe.edu.aprolab.marco.model.CarreraProfesional");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return CarreraProfesional.class;
	}

	protected String getModelClassName() {
		return CarreraProfesional.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = carreraProfesionalPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = pe.edu.aprolab.marco.service.CarreraProfesionalLocalService.class)
	protected pe.edu.aprolab.marco.service.CarreraProfesionalLocalService carreraProfesionalLocalService;
	@BeanReference(type = CarreraProfesionalPersistence.class)
	protected CarreraProfesionalPersistence carreraProfesionalPersistence;
	@BeanReference(type = pe.edu.aprolab.marco.service.FamiliaProfesionalLocalService.class)
	protected pe.edu.aprolab.marco.service.FamiliaProfesionalLocalService familiaProfesionalLocalService;
	@BeanReference(type = FamiliaProfesionalPersistence.class)
	protected FamiliaProfesionalPersistence familiaProfesionalPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CarreraProfesionalLocalServiceClpInvoker _clpInvoker = new CarreraProfesionalLocalServiceClpInvoker();
}