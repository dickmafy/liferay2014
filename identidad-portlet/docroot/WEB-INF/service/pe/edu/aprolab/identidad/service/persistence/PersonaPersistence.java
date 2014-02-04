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

import com.liferay.portal.service.persistence.BasePersistence;

import pe.edu.aprolab.identidad.model.Persona;

/**
 * The persistence interface for the persona service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza Soloisolo
 * @see PersonaPersistenceImpl
 * @see PersonaUtil
 * @generated
 */
public interface PersonaPersistence extends BasePersistence<Persona> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonaUtil} to access the persona persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the persona where codigoId = &#63; or throws a {@link pe.edu.aprolab.identidad.NoSuchPersonaException} if it could not be found.
	*
	* @param codigoId the codigo ID
	* @return the matching persona
	* @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a matching persona could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona findByCodigoId(
		java.lang.String codigoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.identidad.NoSuchPersonaException;

	/**
	* Returns the persona where codigoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codigoId the codigo ID
	* @return the matching persona, or <code>null</code> if a matching persona could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona fetchByCodigoId(
		java.lang.String codigoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the persona where codigoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codigoId the codigo ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching persona, or <code>null</code> if a matching persona could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona fetchByCodigoId(
		java.lang.String codigoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the persona where codigoId = &#63; from the database.
	*
	* @param codigoId the codigo ID
	* @return the persona that was removed
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona removeByCodigoId(
		java.lang.String codigoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.identidad.NoSuchPersonaException;

	/**
	* Returns the number of personas where codigoId = &#63;.
	*
	* @param codigoId the codigo ID
	* @return the number of matching personas
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodigoId(java.lang.String codigoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the persona in the entity cache if it is enabled.
	*
	* @param persona the persona
	*/
	public void cacheResult(pe.edu.aprolab.identidad.model.Persona persona);

	/**
	* Caches the personas in the entity cache if it is enabled.
	*
	* @param personas the personas
	*/
	public void cacheResult(
		java.util.List<pe.edu.aprolab.identidad.model.Persona> personas);

	/**
	* Creates a new persona with the primary key. Does not add the persona to the database.
	*
	* @param personaId the primary key for the new persona
	* @return the new persona
	*/
	public pe.edu.aprolab.identidad.model.Persona create(long personaId);

	/**
	* Removes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personaId the primary key of the persona
	* @return the persona that was removed
	* @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona remove(long personaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.identidad.NoSuchPersonaException;

	public pe.edu.aprolab.identidad.model.Persona updateImpl(
		pe.edu.aprolab.identidad.model.Persona persona)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the persona with the primary key or throws a {@link pe.edu.aprolab.identidad.NoSuchPersonaException} if it could not be found.
	*
	* @param personaId the primary key of the persona
	* @return the persona
	* @throws pe.edu.aprolab.identidad.NoSuchPersonaException if a persona with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona findByPrimaryKey(
		long personaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			pe.edu.aprolab.identidad.NoSuchPersonaException;

	/**
	* Returns the persona with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param personaId the primary key of the persona
	* @return the persona, or <code>null</code> if a persona with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public pe.edu.aprolab.identidad.model.Persona fetchByPrimaryKey(
		long personaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the personas.
	*
	* @return the personas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<pe.edu.aprolab.identidad.model.Persona> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<pe.edu.aprolab.identidad.model.Persona> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<pe.edu.aprolab.identidad.model.Persona> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the personas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of personas.
	*
	* @return the number of personas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}