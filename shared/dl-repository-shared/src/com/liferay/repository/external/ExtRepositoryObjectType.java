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

package com.liferay.repository.external;

/**
 * @author Iván Zaera
 * @author Sergio González
 */
public final class ExtRepositoryObjectType<T extends ExtRepositoryModel> {

	public static final ExtRepositoryObjectType<ExtRepositoryObject> ENTRY =
		new ExtRepositoryObjectType<ExtRepositoryObject>("OBJECT");

	public static final ExtRepositoryObjectType<ExtRepositoryFileEntry> FILE =
		new ExtRepositoryObjectType<ExtRepositoryFileEntry>("FILE");

	public static final ExtRepositoryObjectType<ExtRepositoryFolder> FOLDER =
		new ExtRepositoryObjectType<ExtRepositoryFolder>("FOLDER");

	@Override
	public String toString() {
		return _name;
	}

	private ExtRepositoryObjectType(String name) {
		_name = name;
	}

	private String _name;

}