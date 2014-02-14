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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import pe.edu.aprolab.base.NoSuchFormacionException;
import pe.edu.aprolab.base.model.Formacion;
import pe.edu.aprolab.base.model.impl.FormacionImpl;
import pe.edu.aprolab.base.model.impl.FormacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the formacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see FormacionPersistence
 * @see FormacionUtil
 * @generated
 */
public class FormacionPersistenceImpl extends BasePersistenceImpl<Formacion>
	implements FormacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FormacionUtil} to access the formacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FormacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, FormacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, FormacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, FormacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, FormacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			FormacionModelImpl.COMPANYID_COLUMN_BITMASK |
			FormacionModelImpl.NOMBRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the formacions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Formacion> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the formacions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of formacions
	 * @param end the upper bound of the range of formacions (not inclusive)
	 * @return the range of matching formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Formacion> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the formacions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of formacions
	 * @param end the upper bound of the range of formacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Formacion> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Formacion> list = (List<Formacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Formacion formacion : list) {
				if ((companyId != formacion.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FORMACION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FormacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Formacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Formacion>(list);
				}
				else {
					list = (List<Formacion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first formacion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formacion
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a matching formacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFormacionException, SystemException {
		Formacion formacion = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (formacion != null) {
			return formacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFormacionException(msg.toString());
	}

	/**
	 * Returns the first formacion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formacion, or <code>null</code> if a matching formacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Formacion> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last formacion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formacion
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a matching formacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFormacionException, SystemException {
		Formacion formacion = fetchByCompanyId_Last(companyId, orderByComparator);

		if (formacion != null) {
			return formacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFormacionException(msg.toString());
	}

	/**
	 * Returns the last formacion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formacion, or <code>null</code> if a matching formacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Formacion> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the formacions before and after the current formacion in the ordered set where companyId = &#63;.
	 *
	 * @param formacionId the primary key of the current formacion
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formacion
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion[] findByCompanyId_PrevAndNext(long formacionId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchFormacionException, SystemException {
		Formacion formacion = findByPrimaryKey(formacionId);

		Session session = null;

		try {
			session = openSession();

			Formacion[] array = new FormacionImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, formacion,
					companyId, orderByComparator, true);

			array[1] = formacion;

			array[2] = getByCompanyId_PrevAndNext(session, formacion,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Formacion getByCompanyId_PrevAndNext(Session session,
		Formacion formacion, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FORMACION_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FormacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(formacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Formacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the formacions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Formacion formacion : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(formacion);
		}
	}

	/**
	 * Returns the number of formacions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FORMACION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "formacion.companyId = ?";

	public FormacionPersistenceImpl() {
		setModelClass(Formacion.class);
	}

	/**
	 * Caches the formacion in the entity cache if it is enabled.
	 *
	 * @param formacion the formacion
	 */
	@Override
	public void cacheResult(Formacion formacion) {
		EntityCacheUtil.putResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionImpl.class, formacion.getPrimaryKey(), formacion);

		formacion.resetOriginalValues();
	}

	/**
	 * Caches the formacions in the entity cache if it is enabled.
	 *
	 * @param formacions the formacions
	 */
	@Override
	public void cacheResult(List<Formacion> formacions) {
		for (Formacion formacion : formacions) {
			if (EntityCacheUtil.getResult(
						FormacionModelImpl.ENTITY_CACHE_ENABLED,
						FormacionImpl.class, formacion.getPrimaryKey()) == null) {
				cacheResult(formacion);
			}
			else {
				formacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all formacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FormacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FormacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the formacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Formacion formacion) {
		EntityCacheUtil.removeResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionImpl.class, formacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Formacion> formacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Formacion formacion : formacions) {
			EntityCacheUtil.removeResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
				FormacionImpl.class, formacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new formacion with the primary key. Does not add the formacion to the database.
	 *
	 * @param formacionId the primary key for the new formacion
	 * @return the new formacion
	 */
	@Override
	public Formacion create(long formacionId) {
		Formacion formacion = new FormacionImpl();

		formacion.setNew(true);
		formacion.setPrimaryKey(formacionId);

		return formacion;
	}

	/**
	 * Removes the formacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formacionId the primary key of the formacion
	 * @return the formacion that was removed
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion remove(long formacionId)
		throws NoSuchFormacionException, SystemException {
		return remove((Serializable)formacionId);
	}

	/**
	 * Removes the formacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the formacion
	 * @return the formacion that was removed
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion remove(Serializable primaryKey)
		throws NoSuchFormacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Formacion formacion = (Formacion)session.get(FormacionImpl.class,
					primaryKey);

			if (formacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFormacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(formacion);
		}
		catch (NoSuchFormacionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Formacion removeImpl(Formacion formacion)
		throws SystemException {
		formacion = toUnwrappedModel(formacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(formacion)) {
				formacion = (Formacion)session.get(FormacionImpl.class,
						formacion.getPrimaryKeyObj());
			}

			if (formacion != null) {
				session.delete(formacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (formacion != null) {
			clearCache(formacion);
		}

		return formacion;
	}

	@Override
	public Formacion updateImpl(pe.edu.aprolab.base.model.Formacion formacion)
		throws SystemException {
		formacion = toUnwrappedModel(formacion);

		boolean isNew = formacion.isNew();

		FormacionModelImpl formacionModelImpl = (FormacionModelImpl)formacion;

		Session session = null;

		try {
			session = openSession();

			if (formacion.isNew()) {
				session.save(formacion);

				formacion.setNew(false);
			}
			else {
				session.merge(formacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FormacionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((formacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						formacionModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { formacionModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
			FormacionImpl.class, formacion.getPrimaryKey(), formacion);

		return formacion;
	}

	protected Formacion toUnwrappedModel(Formacion formacion) {
		if (formacion instanceof FormacionImpl) {
			return formacion;
		}

		FormacionImpl formacionImpl = new FormacionImpl();

		formacionImpl.setNew(formacion.isNew());
		formacionImpl.setPrimaryKey(formacion.getPrimaryKey());

		formacionImpl.setFormacionId(formacion.getFormacionId());
		formacionImpl.setCompanyId(formacion.getCompanyId());
		formacionImpl.setNombre(formacion.getNombre());

		return formacionImpl;
	}

	/**
	 * Returns the formacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the formacion
	 * @return the formacion
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFormacionException, SystemException {
		Formacion formacion = fetchByPrimaryKey(primaryKey);

		if (formacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFormacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return formacion;
	}

	/**
	 * Returns the formacion with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchFormacionException} if it could not be found.
	 *
	 * @param formacionId the primary key of the formacion
	 * @return the formacion
	 * @throws pe.edu.aprolab.base.NoSuchFormacionException if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion findByPrimaryKey(long formacionId)
		throws NoSuchFormacionException, SystemException {
		return findByPrimaryKey((Serializable)formacionId);
	}

	/**
	 * Returns the formacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the formacion
	 * @return the formacion, or <code>null</code> if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Formacion formacion = (Formacion)EntityCacheUtil.getResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
				FormacionImpl.class, primaryKey);

		if (formacion == _nullFormacion) {
			return null;
		}

		if (formacion == null) {
			Session session = null;

			try {
				session = openSession();

				formacion = (Formacion)session.get(FormacionImpl.class,
						primaryKey);

				if (formacion != null) {
					cacheResult(formacion);
				}
				else {
					EntityCacheUtil.putResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
						FormacionImpl.class, primaryKey, _nullFormacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FormacionModelImpl.ENTITY_CACHE_ENABLED,
					FormacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return formacion;
	}

	/**
	 * Returns the formacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formacionId the primary key of the formacion
	 * @return the formacion, or <code>null</code> if a formacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Formacion fetchByPrimaryKey(long formacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)formacionId);
	}

	/**
	 * Returns all the formacions.
	 *
	 * @return the formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Formacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Formacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the formacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.base.model.impl.FormacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of formacions
	 * @param end the upper bound of the range of formacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Formacion> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Formacion> list = (List<Formacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FORMACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FORMACION;

				if (pagination) {
					sql = sql.concat(FormacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Formacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Formacion>(list);
				}
				else {
					list = (List<Formacion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the formacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Formacion formacion : findAll()) {
			remove(formacion);
		}
	}

	/**
	 * Returns the number of formacions.
	 *
	 * @return the number of formacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FORMACION);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the formacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.pe.edu.aprolab.base.model.Formacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Formacion>> listenersList = new ArrayList<ModelListener<Formacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Formacion>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FormacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FORMACION = "SELECT formacion FROM Formacion formacion";
	private static final String _SQL_SELECT_FORMACION_WHERE = "SELECT formacion FROM Formacion formacion WHERE ";
	private static final String _SQL_COUNT_FORMACION = "SELECT COUNT(formacion) FROM Formacion formacion";
	private static final String _SQL_COUNT_FORMACION_WHERE = "SELECT COUNT(formacion) FROM Formacion formacion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "formacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Formacion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Formacion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FormacionPersistenceImpl.class);
	private static Formacion _nullFormacion = new FormacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Formacion> toCacheModel() {
				return _nullFormacionCacheModel;
			}
		};

	private static CacheModel<Formacion> _nullFormacionCacheModel = new CacheModel<Formacion>() {
			@Override
			public Formacion toEntityModel() {
				return _nullFormacion;
			}
		};
}