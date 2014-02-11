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

import pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException;
import pe.edu.aprolab.marco.model.FamiliaProfesional;
import pe.edu.aprolab.marco.model.impl.FamiliaProfesionalImpl;
import pe.edu.aprolab.marco.model.impl.FamiliaProfesionalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the familia profesional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see FamiliaProfesionalPersistence
 * @see FamiliaProfesionalUtil
 * @generated
 */
public class FamiliaProfesionalPersistenceImpl extends BasePersistenceImpl<FamiliaProfesional>
	implements FamiliaProfesionalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FamiliaProfesionalUtil} to access the familia profesional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FamiliaProfesionalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED,
			FamiliaProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED,
			FamiliaProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE = new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED,
			FamiliaProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombre",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE =
		new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED,
			FamiliaProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombre",
			new String[] { String.class.getName() },
			FamiliaProfesionalModelImpl.NOMBRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRE = new FinderPath(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombre",
			new String[] { String.class.getName() });

	/**
	 * Returns all the familia profesionals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching familia profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamiliaProfesional> findByNombre(String nombre)
		throws SystemException {
		return findByNombre(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FamiliaProfesional> findByNombre(String nombre, int start,
		int end) throws SystemException {
		return findByNombre(nombre, start, end, null);
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
	@Override
	public List<FamiliaProfesional> findByNombre(String nombre, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE;
			finderArgs = new Object[] { nombre };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE;
			finderArgs = new Object[] { nombre, start, end, orderByComparator };
		}

		List<FamiliaProfesional> list = (List<FamiliaProfesional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FamiliaProfesional familiaProfesional : list) {
				if (!Validator.equals(nombre, familiaProfesional.getNombre())) {
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

			query.append(_SQL_SELECT_FAMILIAPROFESIONAL_WHERE);

			boolean bindNombre = false;

			if (nombre == null) {
				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
			}
			else if (nombre.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FamiliaProfesionalModelImpl.ORDER_BY_JPQL);
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
					list = (List<FamiliaProfesional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FamiliaProfesional>(list);
				}
				else {
					list = (List<FamiliaProfesional>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first familia profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching familia profesional
	 * @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a matching familia profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional findByNombre_First(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchFamiliaProfesionalException, SystemException {
		FamiliaProfesional familiaProfesional = fetchByNombre_First(nombre,
				orderByComparator);

		if (familiaProfesional != null) {
			return familiaProfesional;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFamiliaProfesionalException(msg.toString());
	}

	/**
	 * Returns the first familia profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional fetchByNombre_First(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		List<FamiliaProfesional> list = findByNombre(nombre, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FamiliaProfesional findByNombre_Last(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchFamiliaProfesionalException, SystemException {
		FamiliaProfesional familiaProfesional = fetchByNombre_Last(nombre,
				orderByComparator);

		if (familiaProfesional != null) {
			return familiaProfesional;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFamiliaProfesionalException(msg.toString());
	}

	/**
	 * Returns the last familia profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching familia profesional, or <code>null</code> if a matching familia profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional fetchByNombre_Last(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNombre(nombre);

		if (count == 0) {
			return null;
		}

		List<FamiliaProfesional> list = findByNombre(nombre, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FamiliaProfesional[] findByNombre_PrevAndNext(
		long familiaProfesionalId, String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchFamiliaProfesionalException, SystemException {
		FamiliaProfesional familiaProfesional = findByPrimaryKey(familiaProfesionalId);

		Session session = null;

		try {
			session = openSession();

			FamiliaProfesional[] array = new FamiliaProfesionalImpl[3];

			array[0] = getByNombre_PrevAndNext(session, familiaProfesional,
					nombre, orderByComparator, true);

			array[1] = familiaProfesional;

			array[2] = getByNombre_PrevAndNext(session, familiaProfesional,
					nombre, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FamiliaProfesional getByNombre_PrevAndNext(Session session,
		FamiliaProfesional familiaProfesional, String nombre,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAMILIAPROFESIONAL_WHERE);

		boolean bindNombre = false;

		if (nombre == null) {
			query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
		}
		else if (nombre.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
		}
		else {
			bindNombre = true;

			query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
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
			query.append(FamiliaProfesionalModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(familiaProfesional);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FamiliaProfesional> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the familia profesionals where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNombre(String nombre) throws SystemException {
		for (FamiliaProfesional familiaProfesional : findByNombre(nombre,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(familiaProfesional);
		}
	}

	/**
	 * Returns the number of familia profesionals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching familia profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNombre(String nombre) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NOMBRE;

		Object[] finderArgs = new Object[] { nombre };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAMILIAPROFESIONAL_WHERE);

			boolean bindNombre = false;

			if (nombre == null) {
				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
			}
			else if (nombre.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
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

	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_1 = "familiaProfesional.nombre IS NULL";
	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_2 = "familiaProfesional.nombre = ?";
	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_3 = "(familiaProfesional.nombre IS NULL OR familiaProfesional.nombre = '')";

	public FamiliaProfesionalPersistenceImpl() {
		setModelClass(FamiliaProfesional.class);
	}

	/**
	 * Caches the familia profesional in the entity cache if it is enabled.
	 *
	 * @param familiaProfesional the familia profesional
	 */
	@Override
	public void cacheResult(FamiliaProfesional familiaProfesional) {
		EntityCacheUtil.putResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalImpl.class, familiaProfesional.getPrimaryKey(),
			familiaProfesional);

		familiaProfesional.resetOriginalValues();
	}

	/**
	 * Caches the familia profesionals in the entity cache if it is enabled.
	 *
	 * @param familiaProfesionals the familia profesionals
	 */
	@Override
	public void cacheResult(List<FamiliaProfesional> familiaProfesionals) {
		for (FamiliaProfesional familiaProfesional : familiaProfesionals) {
			if (EntityCacheUtil.getResult(
						FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
						FamiliaProfesionalImpl.class,
						familiaProfesional.getPrimaryKey()) == null) {
				cacheResult(familiaProfesional);
			}
			else {
				familiaProfesional.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all familia profesionals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FamiliaProfesionalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FamiliaProfesionalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the familia profesional.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FamiliaProfesional familiaProfesional) {
		EntityCacheUtil.removeResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalImpl.class, familiaProfesional.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FamiliaProfesional> familiaProfesionals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FamiliaProfesional familiaProfesional : familiaProfesionals) {
			EntityCacheUtil.removeResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
				FamiliaProfesionalImpl.class, familiaProfesional.getPrimaryKey());
		}
	}

	/**
	 * Creates a new familia profesional with the primary key. Does not add the familia profesional to the database.
	 *
	 * @param familiaProfesionalId the primary key for the new familia profesional
	 * @return the new familia profesional
	 */
	@Override
	public FamiliaProfesional create(long familiaProfesionalId) {
		FamiliaProfesional familiaProfesional = new FamiliaProfesionalImpl();

		familiaProfesional.setNew(true);
		familiaProfesional.setPrimaryKey(familiaProfesionalId);

		return familiaProfesional;
	}

	/**
	 * Removes the familia profesional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param familiaProfesionalId the primary key of the familia profesional
	 * @return the familia profesional that was removed
	 * @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional remove(long familiaProfesionalId)
		throws NoSuchFamiliaProfesionalException, SystemException {
		return remove((Serializable)familiaProfesionalId);
	}

	/**
	 * Removes the familia profesional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the familia profesional
	 * @return the familia profesional that was removed
	 * @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional remove(Serializable primaryKey)
		throws NoSuchFamiliaProfesionalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FamiliaProfesional familiaProfesional = (FamiliaProfesional)session.get(FamiliaProfesionalImpl.class,
					primaryKey);

			if (familiaProfesional == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFamiliaProfesionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(familiaProfesional);
		}
		catch (NoSuchFamiliaProfesionalException nsee) {
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
	protected FamiliaProfesional removeImpl(
		FamiliaProfesional familiaProfesional) throws SystemException {
		familiaProfesional = toUnwrappedModel(familiaProfesional);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(familiaProfesional)) {
				familiaProfesional = (FamiliaProfesional)session.get(FamiliaProfesionalImpl.class,
						familiaProfesional.getPrimaryKeyObj());
			}

			if (familiaProfesional != null) {
				session.delete(familiaProfesional);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (familiaProfesional != null) {
			clearCache(familiaProfesional);
		}

		return familiaProfesional;
	}

	@Override
	public FamiliaProfesional updateImpl(
		pe.edu.aprolab.marco.model.FamiliaProfesional familiaProfesional)
		throws SystemException {
		familiaProfesional = toUnwrappedModel(familiaProfesional);

		boolean isNew = familiaProfesional.isNew();

		FamiliaProfesionalModelImpl familiaProfesionalModelImpl = (FamiliaProfesionalModelImpl)familiaProfesional;

		Session session = null;

		try {
			session = openSession();

			if (familiaProfesional.isNew()) {
				session.save(familiaProfesional);

				familiaProfesional.setNew(false);
			}
			else {
				session.merge(familiaProfesional);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FamiliaProfesionalModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((familiaProfesionalModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						familiaProfesionalModelImpl.getOriginalNombre()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
					args);

				args = new Object[] { familiaProfesionalModelImpl.getNombre() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
					args);
			}
		}

		EntityCacheUtil.putResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			FamiliaProfesionalImpl.class, familiaProfesional.getPrimaryKey(),
			familiaProfesional);

		return familiaProfesional;
	}

	protected FamiliaProfesional toUnwrappedModel(
		FamiliaProfesional familiaProfesional) {
		if (familiaProfesional instanceof FamiliaProfesionalImpl) {
			return familiaProfesional;
		}

		FamiliaProfesionalImpl familiaProfesionalImpl = new FamiliaProfesionalImpl();

		familiaProfesionalImpl.setNew(familiaProfesional.isNew());
		familiaProfesionalImpl.setPrimaryKey(familiaProfesional.getPrimaryKey());

		familiaProfesionalImpl.setFamiliaProfesionalId(familiaProfesional.getFamiliaProfesionalId());
		familiaProfesionalImpl.setCompanyId(familiaProfesional.getCompanyId());
		familiaProfesionalImpl.setUserId(familiaProfesional.getUserId());
		familiaProfesionalImpl.setUserName(familiaProfesional.getUserName());
		familiaProfesionalImpl.setCreateDate(familiaProfesional.getCreateDate());
		familiaProfesionalImpl.setModifiedDate(familiaProfesional.getModifiedDate());
		familiaProfesionalImpl.setNombre(familiaProfesional.getNombre());
		familiaProfesionalImpl.setDescripcion(familiaProfesional.getDescripcion());
		familiaProfesionalImpl.setSector(familiaProfesional.getSector());
		familiaProfesionalImpl.setEstado(familiaProfesional.getEstado());

		return familiaProfesionalImpl;
	}

	/**
	 * Returns the familia profesional with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the familia profesional
	 * @return the familia profesional
	 * @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFamiliaProfesionalException, SystemException {
		FamiliaProfesional familiaProfesional = fetchByPrimaryKey(primaryKey);

		if (familiaProfesional == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFamiliaProfesionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return familiaProfesional;
	}

	/**
	 * Returns the familia profesional with the primary key or throws a {@link pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException} if it could not be found.
	 *
	 * @param familiaProfesionalId the primary key of the familia profesional
	 * @return the familia profesional
	 * @throws pe.edu.aprolab.marco.NoSuchFamiliaProfesionalException if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional findByPrimaryKey(long familiaProfesionalId)
		throws NoSuchFamiliaProfesionalException, SystemException {
		return findByPrimaryKey((Serializable)familiaProfesionalId);
	}

	/**
	 * Returns the familia profesional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the familia profesional
	 * @return the familia profesional, or <code>null</code> if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FamiliaProfesional familiaProfesional = (FamiliaProfesional)EntityCacheUtil.getResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
				FamiliaProfesionalImpl.class, primaryKey);

		if (familiaProfesional == _nullFamiliaProfesional) {
			return null;
		}

		if (familiaProfesional == null) {
			Session session = null;

			try {
				session = openSession();

				familiaProfesional = (FamiliaProfesional)session.get(FamiliaProfesionalImpl.class,
						primaryKey);

				if (familiaProfesional != null) {
					cacheResult(familiaProfesional);
				}
				else {
					EntityCacheUtil.putResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
						FamiliaProfesionalImpl.class, primaryKey,
						_nullFamiliaProfesional);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FamiliaProfesionalModelImpl.ENTITY_CACHE_ENABLED,
					FamiliaProfesionalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return familiaProfesional;
	}

	/**
	 * Returns the familia profesional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param familiaProfesionalId the primary key of the familia profesional
	 * @return the familia profesional, or <code>null</code> if a familia profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamiliaProfesional fetchByPrimaryKey(long familiaProfesionalId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)familiaProfesionalId);
	}

	/**
	 * Returns all the familia profesionals.
	 *
	 * @return the familia profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamiliaProfesional> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FamiliaProfesional> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<FamiliaProfesional> findAll(int start, int end,
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

		List<FamiliaProfesional> list = (List<FamiliaProfesional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAMILIAPROFESIONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAMILIAPROFESIONAL;

				if (pagination) {
					sql = sql.concat(FamiliaProfesionalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FamiliaProfesional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FamiliaProfesional>(list);
				}
				else {
					list = (List<FamiliaProfesional>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the familia profesionals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FamiliaProfesional familiaProfesional : findAll()) {
			remove(familiaProfesional);
		}
	}

	/**
	 * Returns the number of familia profesionals.
	 *
	 * @return the number of familia profesionals
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

				Query q = session.createQuery(_SQL_COUNT_FAMILIAPROFESIONAL);

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
	 * Initializes the familia profesional persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.pe.edu.aprolab.marco.model.FamiliaProfesional")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FamiliaProfesional>> listenersList = new ArrayList<ModelListener<FamiliaProfesional>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FamiliaProfesional>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FamiliaProfesionalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FAMILIAPROFESIONAL = "SELECT familiaProfesional FROM FamiliaProfesional familiaProfesional";
	private static final String _SQL_SELECT_FAMILIAPROFESIONAL_WHERE = "SELECT familiaProfesional FROM FamiliaProfesional familiaProfesional WHERE ";
	private static final String _SQL_COUNT_FAMILIAPROFESIONAL = "SELECT COUNT(familiaProfesional) FROM FamiliaProfesional familiaProfesional";
	private static final String _SQL_COUNT_FAMILIAPROFESIONAL_WHERE = "SELECT COUNT(familiaProfesional) FROM FamiliaProfesional familiaProfesional WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "familiaProfesional.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FamiliaProfesional exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FamiliaProfesional exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FamiliaProfesionalPersistenceImpl.class);
	private static FamiliaProfesional _nullFamiliaProfesional = new FamiliaProfesionalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FamiliaProfesional> toCacheModel() {
				return _nullFamiliaProfesionalCacheModel;
			}
		};

	private static CacheModel<FamiliaProfesional> _nullFamiliaProfesionalCacheModel =
		new CacheModel<FamiliaProfesional>() {
			@Override
			public FamiliaProfesional toEntityModel() {
				return _nullFamiliaProfesional;
			}
		};
}