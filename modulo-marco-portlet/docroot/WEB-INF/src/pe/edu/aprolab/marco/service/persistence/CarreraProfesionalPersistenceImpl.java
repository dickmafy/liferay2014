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

import pe.edu.aprolab.marco.NoSuchCarreraProfesionalException;
import pe.edu.aprolab.marco.model.CarreraProfesional;
import pe.edu.aprolab.marco.model.impl.CarreraProfesionalImpl;
import pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the carrera profesional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Diego
 * @see CarreraProfesionalPersistence
 * @see CarreraProfesionalUtil
 * @generated
 */
public class CarreraProfesionalPersistenceImpl extends BasePersistenceImpl<CarreraProfesional>
	implements CarreraProfesionalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CarreraProfesionalUtil} to access the carrera profesional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CarreraProfesionalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED,
			CarreraProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED,
			CarreraProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE = new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED,
			CarreraProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombre",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE =
		new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED,
			CarreraProfesionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombre",
			new String[] { String.class.getName() },
			CarreraProfesionalModelImpl.NOMBRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRE = new FinderPath(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombre",
			new String[] { String.class.getName() });

	/**
	 * Returns all the carrera profesionals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CarreraProfesional> findByNombre(String nombre)
		throws SystemException {
		return findByNombre(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the carrera profesionals where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of carrera profesionals
	 * @param end the upper bound of the range of carrera profesionals (not inclusive)
	 * @return the range of matching carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CarreraProfesional> findByNombre(String nombre, int start,
		int end) throws SystemException {
		return findByNombre(nombre, start, end, null);
	}

	/**
	 * Returns an ordered range of all the carrera profesionals where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of carrera profesionals
	 * @param end the upper bound of the range of carrera profesionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CarreraProfesional> findByNombre(String nombre, int start,
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

		List<CarreraProfesional> list = (List<CarreraProfesional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CarreraProfesional carreraProfesional : list) {
				if (!Validator.equals(nombre, carreraProfesional.getNombre())) {
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

			query.append(_SQL_SELECT_CARRERAPROFESIONAL_WHERE);

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
				query.append(CarreraProfesionalModelImpl.ORDER_BY_JPQL);
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
					list = (List<CarreraProfesional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CarreraProfesional>(list);
				}
				else {
					list = (List<CarreraProfesional>)QueryUtil.list(q,
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
	 * Returns the first carrera profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carrera profesional
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a matching carrera profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional findByNombre_First(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchCarreraProfesionalException, SystemException {
		CarreraProfesional carreraProfesional = fetchByNombre_First(nombre,
				orderByComparator);

		if (carreraProfesional != null) {
			return carreraProfesional;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarreraProfesionalException(msg.toString());
	}

	/**
	 * Returns the first carrera profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carrera profesional, or <code>null</code> if a matching carrera profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional fetchByNombre_First(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		List<CarreraProfesional> list = findByNombre(nombre, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last carrera profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carrera profesional
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a matching carrera profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional findByNombre_Last(String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchCarreraProfesionalException, SystemException {
		CarreraProfesional carreraProfesional = fetchByNombre_Last(nombre,
				orderByComparator);

		if (carreraProfesional != null) {
			return carreraProfesional;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nombre=");
		msg.append(nombre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarreraProfesionalException(msg.toString());
	}

	/**
	 * Returns the last carrera profesional in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carrera profesional, or <code>null</code> if a matching carrera profesional could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional fetchByNombre_Last(String nombre,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNombre(nombre);

		if (count == 0) {
			return null;
		}

		List<CarreraProfesional> list = findByNombre(nombre, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the carrera profesionals before and after the current carrera profesional in the ordered set where nombre = &#63;.
	 *
	 * @param carreraProfesionalId the primary key of the current carrera profesional
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next carrera profesional
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional[] findByNombre_PrevAndNext(
		long carreraProfesionalId, String nombre,
		OrderByComparator orderByComparator)
		throws NoSuchCarreraProfesionalException, SystemException {
		CarreraProfesional carreraProfesional = findByPrimaryKey(carreraProfesionalId);

		Session session = null;

		try {
			session = openSession();

			CarreraProfesional[] array = new CarreraProfesionalImpl[3];

			array[0] = getByNombre_PrevAndNext(session, carreraProfesional,
					nombre, orderByComparator, true);

			array[1] = carreraProfesional;

			array[2] = getByNombre_PrevAndNext(session, carreraProfesional,
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

	protected CarreraProfesional getByNombre_PrevAndNext(Session session,
		CarreraProfesional carreraProfesional, String nombre,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CARRERAPROFESIONAL_WHERE);

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
			query.append(CarreraProfesionalModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(carreraProfesional);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CarreraProfesional> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the carrera profesionals where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNombre(String nombre) throws SystemException {
		for (CarreraProfesional carreraProfesional : findByNombre(nombre,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(carreraProfesional);
		}
	}

	/**
	 * Returns the number of carrera profesionals where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching carrera profesionals
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

			query.append(_SQL_COUNT_CARRERAPROFESIONAL_WHERE);

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

	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_1 = "carreraProfesional.nombre IS NULL";
	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_2 = "carreraProfesional.nombre = ?";
	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_3 = "(carreraProfesional.nombre IS NULL OR carreraProfesional.nombre = '')";

	public CarreraProfesionalPersistenceImpl() {
		setModelClass(CarreraProfesional.class);
	}

	/**
	 * Caches the carrera profesional in the entity cache if it is enabled.
	 *
	 * @param carreraProfesional the carrera profesional
	 */
	@Override
	public void cacheResult(CarreraProfesional carreraProfesional) {
		EntityCacheUtil.putResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalImpl.class, carreraProfesional.getPrimaryKey(),
			carreraProfesional);

		carreraProfesional.resetOriginalValues();
	}

	/**
	 * Caches the carrera profesionals in the entity cache if it is enabled.
	 *
	 * @param carreraProfesionals the carrera profesionals
	 */
	@Override
	public void cacheResult(List<CarreraProfesional> carreraProfesionals) {
		for (CarreraProfesional carreraProfesional : carreraProfesionals) {
			if (EntityCacheUtil.getResult(
						CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
						CarreraProfesionalImpl.class,
						carreraProfesional.getPrimaryKey()) == null) {
				cacheResult(carreraProfesional);
			}
			else {
				carreraProfesional.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all carrera profesionals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CarreraProfesionalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CarreraProfesionalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the carrera profesional.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CarreraProfesional carreraProfesional) {
		EntityCacheUtil.removeResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalImpl.class, carreraProfesional.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CarreraProfesional> carreraProfesionals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CarreraProfesional carreraProfesional : carreraProfesionals) {
			EntityCacheUtil.removeResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
				CarreraProfesionalImpl.class, carreraProfesional.getPrimaryKey());
		}
	}

	/**
	 * Creates a new carrera profesional with the primary key. Does not add the carrera profesional to the database.
	 *
	 * @param carreraProfesionalId the primary key for the new carrera profesional
	 * @return the new carrera profesional
	 */
	@Override
	public CarreraProfesional create(long carreraProfesionalId) {
		CarreraProfesional carreraProfesional = new CarreraProfesionalImpl();

		carreraProfesional.setNew(true);
		carreraProfesional.setPrimaryKey(carreraProfesionalId);

		return carreraProfesional;
	}

	/**
	 * Removes the carrera profesional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carreraProfesionalId the primary key of the carrera profesional
	 * @return the carrera profesional that was removed
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional remove(long carreraProfesionalId)
		throws NoSuchCarreraProfesionalException, SystemException {
		return remove((Serializable)carreraProfesionalId);
	}

	/**
	 * Removes the carrera profesional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the carrera profesional
	 * @return the carrera profesional that was removed
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional remove(Serializable primaryKey)
		throws NoSuchCarreraProfesionalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CarreraProfesional carreraProfesional = (CarreraProfesional)session.get(CarreraProfesionalImpl.class,
					primaryKey);

			if (carreraProfesional == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCarreraProfesionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(carreraProfesional);
		}
		catch (NoSuchCarreraProfesionalException nsee) {
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
	protected CarreraProfesional removeImpl(
		CarreraProfesional carreraProfesional) throws SystemException {
		carreraProfesional = toUnwrappedModel(carreraProfesional);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(carreraProfesional)) {
				carreraProfesional = (CarreraProfesional)session.get(CarreraProfesionalImpl.class,
						carreraProfesional.getPrimaryKeyObj());
			}

			if (carreraProfesional != null) {
				session.delete(carreraProfesional);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (carreraProfesional != null) {
			clearCache(carreraProfesional);
		}

		return carreraProfesional;
	}

	@Override
	public CarreraProfesional updateImpl(
		pe.edu.aprolab.marco.model.CarreraProfesional carreraProfesional)
		throws SystemException {
		carreraProfesional = toUnwrappedModel(carreraProfesional);

		boolean isNew = carreraProfesional.isNew();

		CarreraProfesionalModelImpl carreraProfesionalModelImpl = (CarreraProfesionalModelImpl)carreraProfesional;

		Session session = null;

		try {
			session = openSession();

			if (carreraProfesional.isNew()) {
				session.save(carreraProfesional);

				carreraProfesional.setNew(false);
			}
			else {
				session.merge(carreraProfesional);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CarreraProfesionalModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((carreraProfesionalModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						carreraProfesionalModelImpl.getOriginalNombre()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
					args);

				args = new Object[] { carreraProfesionalModelImpl.getNombre() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
					args);
			}
		}

		EntityCacheUtil.putResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
			CarreraProfesionalImpl.class, carreraProfesional.getPrimaryKey(),
			carreraProfesional);

		return carreraProfesional;
	}

	protected CarreraProfesional toUnwrappedModel(
		CarreraProfesional carreraProfesional) {
		if (carreraProfesional instanceof CarreraProfesionalImpl) {
			return carreraProfesional;
		}

		CarreraProfesionalImpl carreraProfesionalImpl = new CarreraProfesionalImpl();

		carreraProfesionalImpl.setNew(carreraProfesional.isNew());
		carreraProfesionalImpl.setPrimaryKey(carreraProfesional.getPrimaryKey());

		carreraProfesionalImpl.setCarreraProfesionalId(carreraProfesional.getCarreraProfesionalId());
		carreraProfesionalImpl.setCompanyId(carreraProfesional.getCompanyId());
		carreraProfesionalImpl.setUserId(carreraProfesional.getUserId());
		carreraProfesionalImpl.setUserName(carreraProfesional.getUserName());
		carreraProfesionalImpl.setCreateDate(carreraProfesional.getCreateDate());
		carreraProfesionalImpl.setModifiedDate(carreraProfesional.getModifiedDate());
		carreraProfesionalImpl.setFamiliaProfesionalId(carreraProfesional.getFamiliaProfesionalId());
		carreraProfesionalImpl.setFormacion(carreraProfesional.getFormacion());
		carreraProfesionalImpl.setNombre(carreraProfesional.getNombre());
		carreraProfesionalImpl.setDescripcion(carreraProfesional.getDescripcion());
		carreraProfesionalImpl.setDuracionFechaInicio(carreraProfesional.getDuracionFechaInicio());
		carreraProfesionalImpl.setDuracionFechaFin(carreraProfesional.getDuracionFechaFin());
		carreraProfesionalImpl.setEstado(carreraProfesional.getEstado());

		return carreraProfesionalImpl;
	}

	/**
	 * Returns the carrera profesional with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the carrera profesional
	 * @return the carrera profesional
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCarreraProfesionalException, SystemException {
		CarreraProfesional carreraProfesional = fetchByPrimaryKey(primaryKey);

		if (carreraProfesional == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCarreraProfesionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return carreraProfesional;
	}

	/**
	 * Returns the carrera profesional with the primary key or throws a {@link pe.edu.aprolab.marco.NoSuchCarreraProfesionalException} if it could not be found.
	 *
	 * @param carreraProfesionalId the primary key of the carrera profesional
	 * @return the carrera profesional
	 * @throws pe.edu.aprolab.marco.NoSuchCarreraProfesionalException if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional findByPrimaryKey(long carreraProfesionalId)
		throws NoSuchCarreraProfesionalException, SystemException {
		return findByPrimaryKey((Serializable)carreraProfesionalId);
	}

	/**
	 * Returns the carrera profesional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the carrera profesional
	 * @return the carrera profesional, or <code>null</code> if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CarreraProfesional carreraProfesional = (CarreraProfesional)EntityCacheUtil.getResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
				CarreraProfesionalImpl.class, primaryKey);

		if (carreraProfesional == _nullCarreraProfesional) {
			return null;
		}

		if (carreraProfesional == null) {
			Session session = null;

			try {
				session = openSession();

				carreraProfesional = (CarreraProfesional)session.get(CarreraProfesionalImpl.class,
						primaryKey);

				if (carreraProfesional != null) {
					cacheResult(carreraProfesional);
				}
				else {
					EntityCacheUtil.putResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
						CarreraProfesionalImpl.class, primaryKey,
						_nullCarreraProfesional);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CarreraProfesionalModelImpl.ENTITY_CACHE_ENABLED,
					CarreraProfesionalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return carreraProfesional;
	}

	/**
	 * Returns the carrera profesional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carreraProfesionalId the primary key of the carrera profesional
	 * @return the carrera profesional, or <code>null</code> if a carrera profesional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CarreraProfesional fetchByPrimaryKey(long carreraProfesionalId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)carreraProfesionalId);
	}

	/**
	 * Returns all the carrera profesionals.
	 *
	 * @return the carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CarreraProfesional> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CarreraProfesional> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the carrera profesionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.marco.model.impl.CarreraProfesionalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of carrera profesionals
	 * @param end the upper bound of the range of carrera profesionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of carrera profesionals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CarreraProfesional> findAll(int start, int end,
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

		List<CarreraProfesional> list = (List<CarreraProfesional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CARRERAPROFESIONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CARRERAPROFESIONAL;

				if (pagination) {
					sql = sql.concat(CarreraProfesionalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CarreraProfesional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CarreraProfesional>(list);
				}
				else {
					list = (List<CarreraProfesional>)QueryUtil.list(q,
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
	 * Removes all the carrera profesionals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CarreraProfesional carreraProfesional : findAll()) {
			remove(carreraProfesional);
		}
	}

	/**
	 * Returns the number of carrera profesionals.
	 *
	 * @return the number of carrera profesionals
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

				Query q = session.createQuery(_SQL_COUNT_CARRERAPROFESIONAL);

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
	 * Initializes the carrera profesional persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.pe.edu.aprolab.marco.model.CarreraProfesional")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CarreraProfesional>> listenersList = new ArrayList<ModelListener<CarreraProfesional>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CarreraProfesional>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CarreraProfesionalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CARRERAPROFESIONAL = "SELECT carreraProfesional FROM CarreraProfesional carreraProfesional";
	private static final String _SQL_SELECT_CARRERAPROFESIONAL_WHERE = "SELECT carreraProfesional FROM CarreraProfesional carreraProfesional WHERE ";
	private static final String _SQL_COUNT_CARRERAPROFESIONAL = "SELECT COUNT(carreraProfesional) FROM CarreraProfesional carreraProfesional";
	private static final String _SQL_COUNT_CARRERAPROFESIONAL_WHERE = "SELECT COUNT(carreraProfesional) FROM CarreraProfesional carreraProfesional WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "carreraProfesional.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CarreraProfesional exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CarreraProfesional exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CarreraProfesionalPersistenceImpl.class);
	private static CarreraProfesional _nullCarreraProfesional = new CarreraProfesionalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CarreraProfesional> toCacheModel() {
				return _nullCarreraProfesionalCacheModel;
			}
		};

	private static CacheModel<CarreraProfesional> _nullCarreraProfesionalCacheModel =
		new CacheModel<CarreraProfesional>() {
			@Override
			public CarreraProfesional toEntityModel() {
				return _nullCarreraProfesional;
			}
		};
}