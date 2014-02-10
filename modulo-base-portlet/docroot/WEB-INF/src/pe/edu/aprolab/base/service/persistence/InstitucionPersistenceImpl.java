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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import pe.edu.aprolab.base.NoSuchInstitucionException;
import pe.edu.aprolab.base.model.Institucion;
import pe.edu.aprolab.base.model.impl.InstitucionImpl;
import pe.edu.aprolab.base.model.impl.InstitucionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the institucion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see InstitucionPersistence
 * @see InstitucionUtil
 * @generated
 */
public class InstitucionPersistenceImpl extends BasePersistenceImpl<Institucion>
	implements InstitucionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InstitucionUtil} to access the institucion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InstitucionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, InstitucionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, InstitucionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_RUC = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, InstitucionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRUC",
			new String[] { String.class.getName() },
			InstitucionModelImpl.RUC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RUC = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRUC",
			new String[] { String.class.getName() });

	/**
	 * Returns the institucion where RUC = &#63; or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	 *
	 * @param RUC the r u c
	 * @return the matching institucion
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion findByRUC(String RUC)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = fetchByRUC(RUC);

		if (institucion == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("RUC=");
			msg.append(RUC);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInstitucionException(msg.toString());
		}

		return institucion;
	}

	/**
	 * Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param RUC the r u c
	 * @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByRUC(String RUC) throws SystemException {
		return fetchByRUC(RUC, true);
	}

	/**
	 * Returns the institucion where RUC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param RUC the r u c
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching institucion, or <code>null</code> if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByRUC(String RUC, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { RUC };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RUC,
					finderArgs, this);
		}

		if (result instanceof Institucion) {
			Institucion institucion = (Institucion)result;

			if (!Validator.equals(RUC, institucion.getRUC())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INSTITUCION_WHERE);

			boolean bindRUC = false;

			if (RUC == null) {
				query.append(_FINDER_COLUMN_RUC_RUC_1);
			}
			else if (RUC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RUC_RUC_3);
			}
			else {
				bindRUC = true;

				query.append(_FINDER_COLUMN_RUC_RUC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRUC) {
					qPos.add(RUC);
				}

				List<Institucion> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RUC,
						finderArgs, list);
				}
				else {
					Institucion institucion = list.get(0);

					result = institucion;

					cacheResult(institucion);

					if ((institucion.getRUC() == null) ||
							!institucion.getRUC().equals(RUC)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RUC,
							finderArgs, institucion);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RUC,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Institucion)result;
		}
	}

	/**
	 * Removes the institucion where RUC = &#63; from the database.
	 *
	 * @param RUC the r u c
	 * @return the institucion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion removeByRUC(String RUC)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = findByRUC(RUC);

		return remove(institucion);
	}

	/**
	 * Returns the number of institucions where RUC = &#63;.
	 *
	 * @param RUC the r u c
	 * @return the number of matching institucions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRUC(String RUC) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RUC;

		Object[] finderArgs = new Object[] { RUC };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSTITUCION_WHERE);

			boolean bindRUC = false;

			if (RUC == null) {
				query.append(_FINDER_COLUMN_RUC_RUC_1);
			}
			else if (RUC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RUC_RUC_3);
			}
			else {
				bindRUC = true;

				query.append(_FINDER_COLUMN_RUC_RUC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRUC) {
					qPos.add(RUC);
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

	private static final String _FINDER_COLUMN_RUC_RUC_1 = "institucion.RUC IS NULL";
	private static final String _FINDER_COLUMN_RUC_RUC_2 = "institucion.RUC = ?";
	private static final String _FINDER_COLUMN_RUC_RUC_3 = "(institucion.RUC IS NULL OR institucion.RUC = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, InstitucionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, InstitucionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			InstitucionModelImpl.COMPANYID_COLUMN_BITMASK |
			InstitucionModelImpl.RUC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the institucions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching institucions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Institucion> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Institucion> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
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
	@Override
	public List<Institucion> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<Institucion> list = (List<Institucion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Institucion institucion : list) {
				if ((companyId != institucion.getCompanyId())) {
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

			query.append(_SQL_SELECT_INSTITUCION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InstitucionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Institucion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Institucion>(list);
				}
				else {
					list = (List<Institucion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first institucion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institucion
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (institucion != null) {
			return institucion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstitucionException(msg.toString());
	}

	/**
	 * Returns the first institucion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institucion, or <code>null</code> if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Institucion> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Institucion findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (institucion != null) {
			return institucion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstitucionException(msg.toString());
	}

	/**
	 * Returns the last institucion in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institucion, or <code>null</code> if a matching institucion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Institucion> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Institucion[] findByCompanyId_PrevAndNext(long institucionId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = findByPrimaryKey(institucionId);

		Session session = null;

		try {
			session = openSession();

			Institucion[] array = new InstitucionImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, institucion,
					companyId, orderByComparator, true);

			array[1] = institucion;

			array[2] = getByCompanyId_PrevAndNext(session, institucion,
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

	protected Institucion getByCompanyId_PrevAndNext(Session session,
		Institucion institucion, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSTITUCION_WHERE);

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
			query.append(InstitucionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(institucion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Institucion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the institucions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Institucion institucion : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(institucion);
		}
	}

	/**
	 * Returns the number of institucions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching institucions
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

			query.append(_SQL_COUNT_INSTITUCION_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "institucion.companyId = ?";

	public InstitucionPersistenceImpl() {
		setModelClass(Institucion.class);
	}

	/**
	 * Caches the institucion in the entity cache if it is enabled.
	 *
	 * @param institucion the institucion
	 */
	@Override
	public void cacheResult(Institucion institucion) {
		EntityCacheUtil.putResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionImpl.class, institucion.getPrimaryKey(), institucion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RUC,
			new Object[] { institucion.getRUC() }, institucion);

		institucion.resetOriginalValues();
	}

	/**
	 * Caches the institucions in the entity cache if it is enabled.
	 *
	 * @param institucions the institucions
	 */
	@Override
	public void cacheResult(List<Institucion> institucions) {
		for (Institucion institucion : institucions) {
			if (EntityCacheUtil.getResult(
						InstitucionModelImpl.ENTITY_CACHE_ENABLED,
						InstitucionImpl.class, institucion.getPrimaryKey()) == null) {
				cacheResult(institucion);
			}
			else {
				institucion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all institucions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InstitucionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InstitucionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the institucion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Institucion institucion) {
		EntityCacheUtil.removeResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionImpl.class, institucion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(institucion);
	}

	@Override
	public void clearCache(List<Institucion> institucions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Institucion institucion : institucions) {
			EntityCacheUtil.removeResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
				InstitucionImpl.class, institucion.getPrimaryKey());

			clearUniqueFindersCache(institucion);
		}
	}

	protected void cacheUniqueFindersCache(Institucion institucion) {
		if (institucion.isNew()) {
			Object[] args = new Object[] { institucion.getRUC() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RUC, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RUC, args,
				institucion);
		}
		else {
			InstitucionModelImpl institucionModelImpl = (InstitucionModelImpl)institucion;

			if ((institucionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_RUC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { institucion.getRUC() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RUC, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RUC, args,
					institucion);
			}
		}
	}

	protected void clearUniqueFindersCache(Institucion institucion) {
		InstitucionModelImpl institucionModelImpl = (InstitucionModelImpl)institucion;

		Object[] args = new Object[] { institucion.getRUC() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RUC, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RUC, args);

		if ((institucionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_RUC.getColumnBitmask()) != 0) {
			args = new Object[] { institucionModelImpl.getOriginalRUC() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RUC, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RUC, args);
		}
	}

	/**
	 * Creates a new institucion with the primary key. Does not add the institucion to the database.
	 *
	 * @param institucionId the primary key for the new institucion
	 * @return the new institucion
	 */
	@Override
	public Institucion create(long institucionId) {
		Institucion institucion = new InstitucionImpl();

		institucion.setNew(true);
		institucion.setPrimaryKey(institucionId);

		return institucion;
	}

	/**
	 * Removes the institucion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institucionId the primary key of the institucion
	 * @return the institucion that was removed
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion remove(long institucionId)
		throws NoSuchInstitucionException, SystemException {
		return remove((Serializable)institucionId);
	}

	/**
	 * Removes the institucion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the institucion
	 * @return the institucion that was removed
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion remove(Serializable primaryKey)
		throws NoSuchInstitucionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Institucion institucion = (Institucion)session.get(InstitucionImpl.class,
					primaryKey);

			if (institucion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstitucionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(institucion);
		}
		catch (NoSuchInstitucionException nsee) {
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
	protected Institucion removeImpl(Institucion institucion)
		throws SystemException {
		institucion = toUnwrappedModel(institucion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(institucion)) {
				institucion = (Institucion)session.get(InstitucionImpl.class,
						institucion.getPrimaryKeyObj());
			}

			if (institucion != null) {
				session.delete(institucion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (institucion != null) {
			clearCache(institucion);
		}

		return institucion;
	}

	@Override
	public Institucion updateImpl(
		pe.edu.aprolab.base.model.Institucion institucion)
		throws SystemException {
		institucion = toUnwrappedModel(institucion);

		boolean isNew = institucion.isNew();

		InstitucionModelImpl institucionModelImpl = (InstitucionModelImpl)institucion;

		Session session = null;

		try {
			session = openSession();

			if (institucion.isNew()) {
				session.save(institucion);

				institucion.setNew(false);
			}
			else {
				session.merge(institucion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InstitucionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((institucionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						institucionModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { institucionModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
			InstitucionImpl.class, institucion.getPrimaryKey(), institucion);

		clearUniqueFindersCache(institucion);
		cacheUniqueFindersCache(institucion);

		return institucion;
	}

	protected Institucion toUnwrappedModel(Institucion institucion) {
		if (institucion instanceof InstitucionImpl) {
			return institucion;
		}

		InstitucionImpl institucionImpl = new InstitucionImpl();

		institucionImpl.setNew(institucion.isNew());
		institucionImpl.setPrimaryKey(institucion.getPrimaryKey());

		institucionImpl.setInstitucionId(institucion.getInstitucionId());
		institucionImpl.setCompanyId(institucion.getCompanyId());
		institucionImpl.setCreateDate(institucion.getCreateDate());
		institucionImpl.setModifiedDate(institucion.getModifiedDate());
		institucionImpl.setRUC(institucion.getRUC());
		institucionImpl.setCodigoModular(institucion.getCodigoModular());

		return institucionImpl;
	}

	/**
	 * Returns the institucion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the institucion
	 * @return the institucion
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstitucionException, SystemException {
		Institucion institucion = fetchByPrimaryKey(primaryKey);

		if (institucion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstitucionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return institucion;
	}

	/**
	 * Returns the institucion with the primary key or throws a {@link pe.edu.aprolab.base.NoSuchInstitucionException} if it could not be found.
	 *
	 * @param institucionId the primary key of the institucion
	 * @return the institucion
	 * @throws pe.edu.aprolab.base.NoSuchInstitucionException if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion findByPrimaryKey(long institucionId)
		throws NoSuchInstitucionException, SystemException {
		return findByPrimaryKey((Serializable)institucionId);
	}

	/**
	 * Returns the institucion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the institucion
	 * @return the institucion, or <code>null</code> if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Institucion institucion = (Institucion)EntityCacheUtil.getResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
				InstitucionImpl.class, primaryKey);

		if (institucion == _nullInstitucion) {
			return null;
		}

		if (institucion == null) {
			Session session = null;

			try {
				session = openSession();

				institucion = (Institucion)session.get(InstitucionImpl.class,
						primaryKey);

				if (institucion != null) {
					cacheResult(institucion);
				}
				else {
					EntityCacheUtil.putResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
						InstitucionImpl.class, primaryKey, _nullInstitucion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InstitucionModelImpl.ENTITY_CACHE_ENABLED,
					InstitucionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return institucion;
	}

	/**
	 * Returns the institucion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institucionId the primary key of the institucion
	 * @return the institucion, or <code>null</code> if a institucion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Institucion fetchByPrimaryKey(long institucionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)institucionId);
	}

	/**
	 * Returns all the institucions.
	 *
	 * @return the institucions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Institucion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Institucion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Institucion> findAll(int start, int end,
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

		List<Institucion> list = (List<Institucion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSTITUCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSTITUCION;

				if (pagination) {
					sql = sql.concat(InstitucionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Institucion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Institucion>(list);
				}
				else {
					list = (List<Institucion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the institucions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Institucion institucion : findAll()) {
			remove(institucion);
		}
	}

	/**
	 * Returns the number of institucions.
	 *
	 * @return the number of institucions
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

				Query q = session.createQuery(_SQL_COUNT_INSTITUCION);

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
	 * Initializes the institucion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.pe.edu.aprolab.base.model.Institucion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Institucion>> listenersList = new ArrayList<ModelListener<Institucion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Institucion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InstitucionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSTITUCION = "SELECT institucion FROM Institucion institucion";
	private static final String _SQL_SELECT_INSTITUCION_WHERE = "SELECT institucion FROM Institucion institucion WHERE ";
	private static final String _SQL_COUNT_INSTITUCION = "SELECT COUNT(institucion) FROM Institucion institucion";
	private static final String _SQL_COUNT_INSTITUCION_WHERE = "SELECT COUNT(institucion) FROM Institucion institucion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "institucion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Institucion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Institucion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InstitucionPersistenceImpl.class);
	private static Institucion _nullInstitucion = new InstitucionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Institucion> toCacheModel() {
				return _nullInstitucionCacheModel;
			}
		};

	private static CacheModel<Institucion> _nullInstitucionCacheModel = new CacheModel<Institucion>() {
			@Override
			public Institucion toEntityModel() {
				return _nullInstitucion;
			}
		};
}