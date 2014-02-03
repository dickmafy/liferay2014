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

package com.siagie.sttp.service.persistence;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.siagie.sttp.NoSuchLocalException;
import com.siagie.sttp.model.Local;
import com.siagie.sttp.model.impl.LocalImpl;
import com.siagie.sttp.model.impl.LocalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the local service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see LocalPersistence
 * @see LocalUtil
 * @generated
 */
public class LocalPersistenceImpl extends BasePersistenceImpl<Local>
	implements LocalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocalUtil} to access the local persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, LocalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, LocalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSCARNOMBRE =
		new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, LocalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBuscarNombre",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSCARNOMBRE =
		new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, LocalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBuscarNombre",
			new String[] { String.class.getName() },
			LocalModelImpl.NOMBRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSCARNOMBRE = new FinderPath(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBuscarNombre",
			new String[] { String.class.getName() });

	/**
	 * Returns all the locals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findByBuscarNombre(String nombre)
		throws SystemException {
		return findByBuscarNombre(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the locals where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of locals
	 * @param end the upper bound of the range of locals (not inclusive)
	 * @return the range of matching locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findByBuscarNombre(String nombre, int start, int end)
		throws SystemException {
		return findByBuscarNombre(nombre, start, end, null);
	}

	/**
	 * Returns an ordered range of all the locals where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of locals
	 * @param end the upper bound of the range of locals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findByBuscarNombre(String nombre, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSCARNOMBRE;
			finderArgs = new Object[] { nombre };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSCARNOMBRE;
			finderArgs = new Object[] { nombre, start, end, orderByComparator };
		}

		List<Local> list = (List<Local>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Local local : list) {
				if (!Validator.equals(nombre, local.getNombre())) {
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

			query.append(_SQL_SELECT_LOCAL_WHERE);

			boolean bindNombre = false;

			if (nombre == null) {
				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_1);
			}
			else if (nombre.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LocalModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNombre) {
					qPos.add(nombre);
				}

				if (!pagination) {
					list = (List<Local>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Local>(list);
				}
				else {
					list = (List<Local>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first local in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching local
	 * @throws com.siagie.sttp.NoSuchLocalException if a matching local could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local findByBuscarNombre_First(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchLocalException, SystemException {
		Local local = fetchByBuscarNombre_First(nombre, orderByComparator);

		if (local != null) {
			return local;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLocalException(msg.toString());
	}

	/**
	 * Returns the first local in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching local, or <code>null</code> if a matching local could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local fetchByBuscarNombre_First(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		List<Local> list = findByBuscarNombre(nombre, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last local in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching local
	 * @throws com.siagie.sttp.NoSuchLocalException if a matching local could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local findByBuscarNombre_Last(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchLocalException, SystemException {
		Local local = fetchByBuscarNombre_Last(nombre, orderByComparator);

		if (local != null) {
			return local;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLocalException(msg.toString());
	}

	/**
	 * Returns the last local in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching local, or <code>null</code> if a matching local could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local fetchByBuscarNombre_Last(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBuscarNombre(nombre);

		if (count == 0) {
			return null;
		}

		List<Local> list = findByBuscarNombre(nombre, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the locals before and after the current local in the ordered set where nombre = &#63;.
	 *
	 * @param localId the primary key of the current local
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next local
	 * @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local[] findByBuscarNombre_PrevAndNext(long localId, String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchLocalException, SystemException {
		Local local = findByPrimaryKey(localId);

		Session session = null;

		try {
			session = openSession();

			Local[] array = new LocalImpl[3];

			array[0] = getByBuscarNombre_PrevAndNext(session, local, nombre,
					orderByComparator, true);

			array[1] = local;

			array[2] = getByBuscarNombre_PrevAndNext(session, local, nombre,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Local getByBuscarNombre_PrevAndNext(Session session, Local local,
		String nombre, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOCAL_WHERE);

		boolean bindNombre = false;

		if (nombre == null) {
			query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_1);
		}
		else if (nombre.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_3);
		}
		else {
			bindNombre = true;

			query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_2);
		}

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
			query.append(LocalModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNombre) {
			qPos.add(nombre);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(local);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Local> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locals where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBuscarNombre(String nombre) throws SystemException {
		for (Local local : findByBuscarNombre(nombre, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(local);
		}
	}

	/**
	 * Returns the number of locals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBuscarNombre(String nombre) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BUSCARNOMBRE;

		Object[] finderArgs = new Object[] { nombre };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LOCAL_WHERE);

			boolean bindNombre = false;

			if (nombre == null) {
				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_1);
			}
			else if (nombre.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				query.append(_FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNombre) {
					qPos.add(nombre);
				}

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

	private static final String _FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_1 = "local.nombre IS NULL";
	private static final String _FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_2 = "local.nombre = ?";
	private static final String _FINDER_COLUMN_BUSCARNOMBRE_NOMBRE_3 = "(local.nombre IS NULL OR local.nombre = '')";

	public LocalPersistenceImpl() {
		setModelClass(Local.class);
	}

	/**
	 * Caches the local in the entity cache if it is enabled.
	 *
	 * @param local the local
	 */
	@Override
	public void cacheResult(Local local) {
		EntityCacheUtil.putResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalImpl.class, local.getPrimaryKey(), local);

		local.resetOriginalValues();
	}

	/**
	 * Caches the locals in the entity cache if it is enabled.
	 *
	 * @param locals the locals
	 */
	@Override
	public void cacheResult(List<Local> locals) {
		for (Local local : locals) {
			if (EntityCacheUtil.getResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
						LocalImpl.class, local.getPrimaryKey()) == null) {
				cacheResult(local);
			}
			else {
				local.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all locals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LocalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LocalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the local.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Local local) {
		EntityCacheUtil.removeResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalImpl.class, local.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Local> locals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Local local : locals) {
			EntityCacheUtil.removeResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
				LocalImpl.class, local.getPrimaryKey());
		}
	}

	/**
	 * Creates a new local with the primary key. Does not add the local to the database.
	 *
	 * @param localId the primary key for the new local
	 * @return the new local
	 */
	@Override
	public Local create(long localId) {
		Local local = new LocalImpl();

		local.setNew(true);
		local.setPrimaryKey(localId);

		return local;
	}

	/**
	 * Removes the local with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localId the primary key of the local
	 * @return the local that was removed
	 * @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local remove(long localId)
		throws NoSuchLocalException, SystemException {
		return remove((Serializable)localId);
	}

	/**
	 * Removes the local with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the local
	 * @return the local that was removed
	 * @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local remove(Serializable primaryKey)
		throws NoSuchLocalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Local local = (Local)session.get(LocalImpl.class, primaryKey);

			if (local == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(local);
		}
		catch (NoSuchLocalException nsee) {
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
	protected Local removeImpl(Local local) throws SystemException {
		local = toUnwrappedModel(local);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(local)) {
				local = (Local)session.get(LocalImpl.class,
						local.getPrimaryKeyObj());
			}

			if (local != null) {
				session.delete(local);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (local != null) {
			clearCache(local);
		}

		return local;
	}

	@Override
	public Local updateImpl(com.siagie.sttp.model.Local local)
		throws SystemException {
		local = toUnwrappedModel(local);

		boolean isNew = local.isNew();

		LocalModelImpl localModelImpl = (LocalModelImpl)local;

		Session session = null;

		try {
			session = openSession();

			if (local.isNew()) {
				session.save(local);

				local.setNew(false);
			}
			else {
				session.merge(local);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LocalModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((localModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSCARNOMBRE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { localModelImpl.getOriginalNombre() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSCARNOMBRE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSCARNOMBRE,
					args);

				args = new Object[] { localModelImpl.getNombre() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSCARNOMBRE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSCARNOMBRE,
					args);
			}
		}

		EntityCacheUtil.putResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
			LocalImpl.class, local.getPrimaryKey(), local);

		return local;
	}

	protected Local toUnwrappedModel(Local local) {
		if (local instanceof LocalImpl) {
			return local;
		}

		LocalImpl localImpl = new LocalImpl();

		localImpl.setNew(local.isNew());
		localImpl.setPrimaryKey(local.getPrimaryKey());

		localImpl.setLocalId(local.getLocalId());
		localImpl.setNombre(local.getNombre());
		localImpl.setEstado(local.getEstado());

		return localImpl;
	}

	/**
	 * Returns the local with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the local
	 * @return the local
	 * @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocalException, SystemException {
		Local local = fetchByPrimaryKey(primaryKey);

		if (local == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return local;
	}

	/**
	 * Returns the local with the primary key or throws a {@link com.siagie.sttp.NoSuchLocalException} if it could not be found.
	 *
	 * @param localId the primary key of the local
	 * @return the local
	 * @throws com.siagie.sttp.NoSuchLocalException if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local findByPrimaryKey(long localId)
		throws NoSuchLocalException, SystemException {
		return findByPrimaryKey((Serializable)localId);
	}

	/**
	 * Returns the local with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the local
	 * @return the local, or <code>null</code> if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Local local = (Local)EntityCacheUtil.getResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
				LocalImpl.class, primaryKey);

		if (local == _nullLocal) {
			return null;
		}

		if (local == null) {
			Session session = null;

			try {
				session = openSession();

				local = (Local)session.get(LocalImpl.class, primaryKey);

				if (local != null) {
					cacheResult(local);
				}
				else {
					EntityCacheUtil.putResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
						LocalImpl.class, primaryKey, _nullLocal);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LocalModelImpl.ENTITY_CACHE_ENABLED,
					LocalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return local;
	}

	/**
	 * Returns the local with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localId the primary key of the local
	 * @return the local, or <code>null</code> if a local with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Local fetchByPrimaryKey(long localId) throws SystemException {
		return fetchByPrimaryKey((Serializable)localId);
	}

	/**
	 * Returns all the locals.
	 *
	 * @return the locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the locals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of locals
	 * @param end the upper bound of the range of locals (not inclusive)
	 * @return the range of locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the locals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.siagie.sttp.model.impl.LocalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of locals
	 * @param end the upper bound of the range of locals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of locals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Local> findAll(int start, int end,
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

		List<Local> list = (List<Local>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOCAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCAL;

				if (pagination) {
					sql = sql.concat(LocalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Local>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Local>(list);
				}
				else {
					list = (List<Local>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the locals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Local local : findAll()) {
			remove(local);
		}
	}

	/**
	 * Returns the number of locals.
	 *
	 * @return the number of locals
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

				Query q = session.createQuery(_SQL_COUNT_LOCAL);

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
	 * Initializes the local persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.siagie.sttp.model.Local")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Local>> listenersList = new ArrayList<ModelListener<Local>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Local>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LocalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOCAL = "SELECT local FROM Local local";
	private static final String _SQL_SELECT_LOCAL_WHERE = "SELECT local FROM Local local WHERE ";
	private static final String _SQL_COUNT_LOCAL = "SELECT COUNT(local) FROM Local local";
	private static final String _SQL_COUNT_LOCAL_WHERE = "SELECT COUNT(local) FROM Local local WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "local.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Local exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Local exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LocalPersistenceImpl.class);
	private static Local _nullLocal = new LocalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Local> toCacheModel() {
				return _nullLocalCacheModel;
			}
		};

	private static CacheModel<Local> _nullLocalCacheModel = new CacheModel<Local>() {
			@Override
			public Local toEntityModel() {
				return _nullLocal;
			}
		};
}