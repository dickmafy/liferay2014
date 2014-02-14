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

package pe.edu.aprolab.base.service.base;

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
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import pe.edu.aprolab.base.model.Institucion;
import pe.edu.aprolab.base.service.InstitucionLocalService;
import pe.edu.aprolab.base.service.persistence.FormacionPersistence;
import pe.edu.aprolab.base.service.persistence.InstitucionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the institucion local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link pe.edu.aprolab.base.service.impl.InstitucionLocalServiceImpl}.
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see pe.edu.aprolab.base.service.impl.InstitucionLocalServiceImpl
 * @see pe.edu.aprolab.base.service.InstitucionLocalServiceUtil
 * @generated
 */
public abstract class InstitucionLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements InstitucionLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pe.edu.aprolab.base.service.InstitucionLocalServiceUtil} to access the institucion local service.
	 */

	/**
	 * Adds the institucion to the database. Also notifies the appropriate model listeners.
	 *
	 * @param institucion the institucion
	 * @return the institucion that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Institucion addInstitucion(Institucion institucion)
		throws SystemException {
		institucion.setNew(true);

		return institucionPersistence.update(institucion);
	}

	/**
	 * Creates a new institucion with the primary key. Does not add the institucion to the database.
	 *
	 * @param institucionId the primary key for the new institucion
	 * @return the new institucion
	 */
	@Override
	public Institucion createInstitucion(long institucionId) {
		return institucionPersistence.create(institucionId);
	}

	/**
	 * Deletes the institucion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institucionId the primary key of the institucion
	 * @return the institucion that was removed
	 * @throws PortalException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Institucion deleteInstitucion(long institucionId)
		throws PortalException, SystemException {
		return institucionPersistence.remove(institucionId);
	}

	/**
	 * Deletes the institucion from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institucion the institucion
	 * @return the institucion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Institucion deleteInstitucion(Institucion institucion)
		throws SystemException {
		return institucionPersistence.remove(institucion);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Institucion.class,
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
		return institucionPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return institucionPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.InstitucionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return institucionPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return institucionPersistence.countWithDynamicQuery(dynamicQuery);
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
		return institucionPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Institucion fetchInstitucion(long institucionId)
		throws SystemException {
		return institucionPersistence.fetchByPrimaryKey(institucionId);
	}

	/**
	 * Returns the institucion with the primary key.
	 *
	 * @param institucionId the primary key of the institucion
	 * @return the institucion
	 * @throws PortalException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion getInstitucion(long institucionId)
		throws PortalException, SystemException {
		return institucionPersistence.findByPrimaryKey(institucionId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return institucionPersistence.findByPrimaryKey(primaryKeyObj);
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
	@Override
	public List<Institucion> getInstitucions(int start, int end)
		throws SystemException {
		return institucionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of institucions.
	 *
	 * @return the number of institucions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getInstitucionsCount() throws SystemException {
		return institucionPersistence.countAll();
	}

	/**
	 * Updates the institucion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param institucion the institucion
	 * @return the institucion that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Institucion updateInstitucion(Institucion institucion)
		throws SystemException {
		return institucionPersistence.update(institucion);
	}

	/**
	 * Returns the formacion local service.
	 *
	 * @return the formacion local service
	 */
	public pe.edu.aprolab.base.service.FormacionLocalService getFormacionLocalService() {
		return formacionLocalService;
	}

	/**
	 * Sets the formacion local service.
	 *
	 * @param formacionLocalService the formacion local service
	 */
	public void setFormacionLocalService(
		pe.edu.aprolab.base.service.FormacionLocalService formacionLocalService) {
		this.formacionLocalService = formacionLocalService;
	}

	/**
	 * Returns the formacion remote service.
	 *
	 * @return the formacion remote service
	 */
	public pe.edu.aprolab.base.service.FormacionService getFormacionService() {
		return formacionService;
	}

	/**
	 * Sets the formacion remote service.
	 *
	 * @param formacionService the formacion remote service
	 */
	public void setFormacionService(
		pe.edu.aprolab.base.service.FormacionService formacionService) {
		this.formacionService = formacionService;
	}

	/**
	 * Returns the formacion persistence.
	 *
	 * @return the formacion persistence
	 */
	public FormacionPersistence getFormacionPersistence() {
		return formacionPersistence;
	}

	/**
	 * Sets the formacion persistence.
	 *
	 * @param formacionPersistence the formacion persistence
	 */
	public void setFormacionPersistence(
		FormacionPersistence formacionPersistence) {
		this.formacionPersistence = formacionPersistence;
	}

	/**
	 * Returns the institucion local service.
	 *
	 * @return the institucion local service
	 */
	public pe.edu.aprolab.base.service.InstitucionLocalService getInstitucionLocalService() {
		return institucionLocalService;
	}

	/**
	 * Sets the institucion local service.
	 *
	 * @param institucionLocalService the institucion local service
	 */
	public void setInstitucionLocalService(
		pe.edu.aprolab.base.service.InstitucionLocalService institucionLocalService) {
		this.institucionLocalService = institucionLocalService;
	}

	/**
	 * Returns the institucion remote service.
	 *
	 * @return the institucion remote service
	 */
	public pe.edu.aprolab.base.service.InstitucionService getInstitucionService() {
		return institucionService;
	}

	/**
	 * Sets the institucion remote service.
	 *
	 * @param institucionService the institucion remote service
	 */
	public void setInstitucionService(
		pe.edu.aprolab.base.service.InstitucionService institucionService) {
		this.institucionService = institucionService;
	}

	/**
	 * Returns the institucion persistence.
	 *
	 * @return the institucion persistence
	 */
	public InstitucionPersistence getInstitucionPersistence() {
		return institucionPersistence;
	}

	/**
	 * Sets the institucion persistence.
	 *
	 * @param institucionPersistence the institucion persistence
	 */
	public void setInstitucionPersistence(
		InstitucionPersistence institucionPersistence) {
		this.institucionPersistence = institucionPersistence;
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
	 * Returns the group local service.
	 *
	 * @return the group local service
	 */
	public com.liferay.portal.service.GroupLocalService getGroupLocalService() {
		return groupLocalService;
	}

	/**
	 * Sets the group local service.
	 *
	 * @param groupLocalService the group local service
	 */
	public void setGroupLocalService(
		com.liferay.portal.service.GroupLocalService groupLocalService) {
		this.groupLocalService = groupLocalService;
	}

	/**
	 * Returns the group remote service.
	 *
	 * @return the group remote service
	 */
	public com.liferay.portal.service.GroupService getGroupService() {
		return groupService;
	}

	/**
	 * Sets the group remote service.
	 *
	 * @param groupService the group remote service
	 */
	public void setGroupService(
		com.liferay.portal.service.GroupService groupService) {
		this.groupService = groupService;
	}

	/**
	 * Returns the group persistence.
	 *
	 * @return the group persistence
	 */
	public GroupPersistence getGroupPersistence() {
		return groupPersistence;
	}

	/**
	 * Sets the group persistence.
	 *
	 * @param groupPersistence the group persistence
	 */
	public void setGroupPersistence(GroupPersistence groupPersistence) {
		this.groupPersistence = groupPersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("pe.edu.aprolab.base.model.Institucion",
			institucionLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"pe.edu.aprolab.base.model.Institucion");
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
		return Institucion.class;
	}

	protected String getModelClassName() {
		return Institucion.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = institucionPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = pe.edu.aprolab.base.service.FormacionLocalService.class)
	protected pe.edu.aprolab.base.service.FormacionLocalService formacionLocalService;
	@BeanReference(type = pe.edu.aprolab.base.service.FormacionService.class)
	protected pe.edu.aprolab.base.service.FormacionService formacionService;
	@BeanReference(type = FormacionPersistence.class)
	protected FormacionPersistence formacionPersistence;
	@BeanReference(type = pe.edu.aprolab.base.service.InstitucionLocalService.class)
	protected pe.edu.aprolab.base.service.InstitucionLocalService institucionLocalService;
	@BeanReference(type = pe.edu.aprolab.base.service.InstitucionService.class)
	protected pe.edu.aprolab.base.service.InstitucionService institucionService;
	@BeanReference(type = InstitucionPersistence.class)
	protected InstitucionPersistence institucionPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.GroupLocalService.class)
	protected com.liferay.portal.service.GroupLocalService groupLocalService;
	@BeanReference(type = com.liferay.portal.service.GroupService.class)
	protected com.liferay.portal.service.GroupService groupService;
	@BeanReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
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
	private InstitucionLocalServiceClpInvoker _clpInvoker = new InstitucionLocalServiceClpInvoker();
}