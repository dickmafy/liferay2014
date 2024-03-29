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

package pe.edu.aprolab.identidad.service.persistence;

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

import pe.edu.aprolab.identidad.NoSuchPersonaException;
import pe.edu.aprolab.identidad.model.Persona;
import pe.edu.aprolab.identidad.model.impl.PersonaImpl;
import pe.edu.aprolab.identidad.model.impl.PersonaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the persona service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see PersonaPersistence
 * @see PersonaUtil
 * @generated
 */
public class PersonaPersistenceImpl extends BasePersistenceImpl<Persona>
	implements PersonaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PersonaUtil} to access the persona persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PersonaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, PersonaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, PersonaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODIGOID = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, PersonaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCodigoId",
			new String[] { String.class.getName() },
			PersonaModelImpl.CODIGOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODIGOID = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodigoId",
			new String[] { String.class.getName() });

	/**
	 * Returns the persona where codigoId = &#63; or throws a {@link pe.edu.aprolab.identidad.NoSuchPersonaException} if it could not be found.
	 *
	 * @param codigoId the codigo ID
	 * @return the matching persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona findByCodigoId(String codigoId)
		throws NoSuchPersonaException, SystemException {
		Persona persona = fetchByCodigoId(codigoId);

		if (persona == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("codigoId=");
			msg.append(codigoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPersonaException(msg.toString());
		}

		return persona;
	}

	/**
	 * Returns the persona where codigoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param codigoId the codigo ID
	 * @return the matching persona, or <code>null</code> if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByCodigoId(String codigoId) throws SystemException {
		return fetchByCodigoId(codigoId, true);
	}

	/**
	 * Returns the persona where codigoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param codigoId the codigo ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching persona, or <code>null</code> if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByCodigoId(String codigoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { codigoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODIGOID,
					finderArgs, this);
		}

		if (result instanceof Persona) {
			Persona persona = (Persona)result;

			if (!Validator.equals(codigoId, persona.getCodigoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PERSONA_WHERE);

			boolean bindCodigoId = false;

			if (codigoId == null) {
				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_1);
			}
			else if (codigoId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_3);
			}
			else {
				bindCodigoId = true;

				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCodigoId) {
					qPos.add(codigoId);
				}

				List<Persona> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODIGOID,
						finderArgs, list);
				}
				else {
					Persona persona = list.get(0);

					result = persona;

					cacheResult(persona);

					if ((persona.getCodigoId() == null) ||
							!persona.getCodigoId().equals(codigoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODIGOID,
							finderArgs, persona);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODIGOID,
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
			return (Persona)result;
		}
	}

	/**
	 * Removes the persona where codigoId = &#63; from the database.
	 *
	 * @param codigoId the codigo ID
	 * @return the persona that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona removeByCodigoId(String codigoId)
		throws NoSuchPersonaException, SystemException {
		Persona persona = findByCodigoId(codigoId);

		return remove(persona);
	}

	/**
	 * Returns the number of personas where codigoId = &#63;.
	 *
	 * @param codigoId the codigo ID
	 * @return the number of matching personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodigoId(String codigoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODIGOID;

		Object[] finderArgs = new Object[] { codigoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PERSONA_WHERE);

			boolean bindCodigoId = false;

			if (codigoId == null) {
				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_1);
			}
			else if (codigoId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_3);
			}
			else {
				bindCodigoId = true;

				query.append(_FINDER_COLUMN_CODIGOID_CODIGOID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCodigoId) {
					qPos.add(codigoId);
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

	private static final String _FINDER_COLUMN_CODIGOID_CODIGOID_1 = "persona.codigoId IS NULL";
	private static final String _FINDER_COLUMN_CODIGOID_CODIGOID_2 = "persona.codigoId = ?";
	private static final String _FINDER_COLUMN_CODIGOID_CODIGOID_3 = "(persona.codigoId IS NULL OR persona.codigoId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, PersonaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, PersonaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			PersonaModelImpl.COMPANYID_COLUMN_BITMASK |
			PersonaModelImpl.CODIGOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the personas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the personas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.identidad.model.impl.PersonaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of matching personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the personas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.identidad.model.impl.PersonaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findByCompanyId(long companyId, int start, int end,
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

		List<Persona> list = (List<Persona>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Persona persona : list) {
				if ((companyId != persona.getCompanyId())) {
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

			query.append(_SQL_SELECT_PERSONA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PersonaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Persona>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Persona>(list);
				}
				else {
					list = (List<Persona>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first persona in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPersonaException, SystemException {
		Persona persona = fetchByCompanyId_First(companyId, orderByComparator);

		if (persona != null) {
			return persona;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPersonaException(msg.toString());
	}

	/**
	 * Returns the first persona in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persona, or <code>null</code> if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Persona> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persona in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPersonaException, SystemException {
		Persona persona = fetchByCompanyId_Last(companyId, orderByComparator);

		if (persona != null) {
			return persona;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPersonaException(msg.toString());
	}

	/**
	 * Returns the last persona in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persona, or <code>null</code> if a matching persona could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Persona> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the personas before and after the current persona in the ordered set where companyId = &#63;.
	 *
	 * @param personaId the primary key of the current persona
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona[] findByCompanyId_PrevAndNext(long personaId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchPersonaException, SystemException {
		Persona persona = findByPrimaryKey(personaId);

		Session session = null;

		try {
			session = openSession();

			Persona[] array = new PersonaImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, persona, companyId,
					orderByComparator, true);

			array[1] = persona;

			array[2] = getByCompanyId_PrevAndNext(session, persona, companyId,
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

	protected Persona getByCompanyId_PrevAndNext(Session session,
		Persona persona, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PERSONA_WHERE);

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
			query.append(PersonaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(persona);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Persona> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personas where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Persona persona : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(persona);
		}
	}

	/**
	 * Returns the number of personas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching personas
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

			query.append(_SQL_COUNT_PERSONA_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "persona.companyId = ?";

	public PersonaPersistenceImpl() {
		setModelClass(Persona.class);
	}

	/**
	 * Caches the persona in the entity cache if it is enabled.
	 *
	 * @param persona the persona
	 */
	@Override
	public void cacheResult(Persona persona) {
		EntityCacheUtil.putResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaImpl.class, persona.getPrimaryKey(), persona);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODIGOID,
			new Object[] { persona.getCodigoId() }, persona);

		persona.resetOriginalValues();
	}

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	@Override
	public void cacheResult(List<Persona> personas) {
		for (Persona persona : personas) {
			if (EntityCacheUtil.getResult(
						PersonaModelImpl.ENTITY_CACHE_ENABLED,
						PersonaImpl.class, persona.getPrimaryKey()) == null) {
				cacheResult(persona);
			}
			else {
				persona.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all personas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PersonaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PersonaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the persona.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Persona persona) {
		EntityCacheUtil.removeResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaImpl.class, persona.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(persona);
	}

	@Override
	public void clearCache(List<Persona> personas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Persona persona : personas) {
			EntityCacheUtil.removeResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
				PersonaImpl.class, persona.getPrimaryKey());

			clearUniqueFindersCache(persona);
		}
	}

	protected void cacheUniqueFindersCache(Persona persona) {
		if (persona.isNew()) {
			Object[] args = new Object[] { persona.getCodigoId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODIGOID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODIGOID, args,
				persona);
		}
		else {
			PersonaModelImpl personaModelImpl = (PersonaModelImpl)persona;

			if ((personaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODIGOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { persona.getCodigoId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODIGOID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODIGOID, args,
					persona);
			}
		}
	}

	protected void clearUniqueFindersCache(Persona persona) {
		PersonaModelImpl personaModelImpl = (PersonaModelImpl)persona;

		Object[] args = new Object[] { persona.getCodigoId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODIGOID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODIGOID, args);

		if ((personaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODIGOID.getColumnBitmask()) != 0) {
			args = new Object[] { personaModelImpl.getOriginalCodigoId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODIGOID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODIGOID, args);
		}
	}

	/**
	 * Creates a new persona with the primary key. Does not add the persona to the database.
	 *
	 * @param personaId the primary key for the new persona
	 * @return the new persona
	 */
	@Override
	public Persona create(long personaId) {
		Persona persona = new PersonaImpl();

		persona.setNew(true);
		persona.setPrimaryKey(personaId);

		return persona;
	}

	/**
	 * Removes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personaId the primary key of the persona
	 * @return the persona that was removed
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona remove(long personaId)
		throws NoSuchPersonaException, SystemException {
		return remove((Serializable)personaId);
	}

	/**
	 * Removes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the persona
	 * @return the persona that was removed
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona remove(Serializable primaryKey)
		throws NoSuchPersonaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Persona persona = (Persona)session.get(PersonaImpl.class, primaryKey);

			if (persona == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersonaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(persona);
		}
		catch (NoSuchPersonaException nsee) {
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
	protected Persona removeImpl(Persona persona) throws SystemException {
		persona = toUnwrappedModel(persona);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(persona)) {
				persona = (Persona)session.get(PersonaImpl.class,
						persona.getPrimaryKeyObj());
			}

			if (persona != null) {
				session.delete(persona);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (persona != null) {
			clearCache(persona);
		}

		return persona;
	}

	@Override
	public Persona updateImpl(pe.edu.aprolab.identidad.model.Persona persona)
		throws SystemException {
		persona = toUnwrappedModel(persona);

		boolean isNew = persona.isNew();

		PersonaModelImpl personaModelImpl = (PersonaModelImpl)persona;

		Session session = null;

		try {
			session = openSession();

			if (persona.isNew()) {
				session.save(persona);

				persona.setNew(false);
			}
			else {
				session.merge(persona);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PersonaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((personaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						personaModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { personaModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
			PersonaImpl.class, persona.getPrimaryKey(), persona);

		clearUniqueFindersCache(persona);
		cacheUniqueFindersCache(persona);

		return persona;
	}

	protected Persona toUnwrappedModel(Persona persona) {
		if (persona instanceof PersonaImpl) {
			return persona;
		}

		PersonaImpl personaImpl = new PersonaImpl();

		personaImpl.setNew(persona.isNew());
		personaImpl.setPrimaryKey(persona.getPrimaryKey());

		personaImpl.setPersonaId(persona.getPersonaId());
		personaImpl.setCompanyId(persona.getCompanyId());
		personaImpl.setCreateDate(persona.getCreateDate());
		personaImpl.setModifiedDate(persona.getModifiedDate());
		personaImpl.setCodigoId(persona.getCodigoId());
		personaImpl.setNombres(persona.getNombres());
		personaImpl.setApellidoPaterno(persona.getApellidoPaterno());
		personaImpl.setApellidoMaterno(persona.getApellidoMaterno());
		personaImpl.setGenero(persona.isGenero());
		personaImpl.setEstadoCivil(persona.getEstadoCivil());
		personaImpl.setFechaNacimiento(persona.getFechaNacimiento());
		personaImpl.setUbigeoNacimiento(persona.getUbigeoNacimiento());

		return personaImpl;
	}

	/**
	 * Returns the persona with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the persona
	 * @return the persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPersonaException, SystemException {
		Persona persona = fetchByPrimaryKey(primaryKey);

		if (persona == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPersonaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return persona;
	}

	/**
	 * Returns the persona with the primary key or throws a {@link pe.edu.aprolab.identidad.NoSuchPersonaException} if it could not be found.
	 *
	 * @param personaId the primary key of the persona
	 * @return the persona
	 * @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona findByPrimaryKey(long personaId)
		throws NoSuchPersonaException, SystemException {
		return findByPrimaryKey((Serializable)personaId);
	}

	/**
	 * Returns the persona with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the persona
	 * @return the persona, or <code>null</code> if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Persona persona = (Persona)EntityCacheUtil.getResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
				PersonaImpl.class, primaryKey);

		if (persona == _nullPersona) {
			return null;
		}

		if (persona == null) {
			Session session = null;

			try {
				session = openSession();

				persona = (Persona)session.get(PersonaImpl.class, primaryKey);

				if (persona != null) {
					cacheResult(persona);
				}
				else {
					EntityCacheUtil.putResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
						PersonaImpl.class, primaryKey, _nullPersona);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PersonaModelImpl.ENTITY_CACHE_ENABLED,
					PersonaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return persona;
	}

	/**
	 * Returns the persona with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personaId the primary key of the persona
	 * @return the persona, or <code>null</code> if a persona with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Persona fetchByPrimaryKey(long personaId) throws SystemException {
		return fetchByPrimaryKey((Serializable)personaId);
	}

	/**
	 * Returns all the personas.
	 *
	 * @return the personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.identidad.model.impl.PersonaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pe.edu.aprolab.identidad.model.impl.PersonaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Persona> findAll(int start, int end,
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

		List<Persona> list = (List<Persona>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PERSONA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PERSONA;

				if (pagination) {
					sql = sql.concat(PersonaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Persona>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Persona>(list);
				}
				else {
					list = (List<Persona>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the personas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Persona persona : findAll()) {
			remove(persona);
		}
	}

	/**
	 * Returns the number of personas.
	 *
	 * @return the number of personas
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

				Query q = session.createQuery(_SQL_COUNT_PERSONA);

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
	 * Initializes the persona persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.pe.edu.aprolab.identidad.model.Persona")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Persona>> listenersList = new ArrayList<ModelListener<Persona>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Persona>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PersonaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PERSONA = "SELECT persona FROM Persona persona";
	private static final String _SQL_SELECT_PERSONA_WHERE = "SELECT persona FROM Persona persona WHERE ";
	private static final String _SQL_COUNT_PERSONA = "SELECT COUNT(persona) FROM Persona persona";
	private static final String _SQL_COUNT_PERSONA_WHERE = "SELECT COUNT(persona) FROM Persona persona WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "persona.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Persona exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Persona exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PersonaPersistenceImpl.class);
	private static Persona _nullPersona = new PersonaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Persona> toCacheModel() {
				return _nullPersonaCacheModel;
			}
		};

	private static CacheModel<Persona> _nullPersonaCacheModel = new CacheModel<Persona>() {
			@Override
			public Persona toEntityModel() {
				return _nullPersona;
			}
		};
}