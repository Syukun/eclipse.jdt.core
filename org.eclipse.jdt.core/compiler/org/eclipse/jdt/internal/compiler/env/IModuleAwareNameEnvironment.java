/*******************************************************************************
 * Copyright (c) 2000, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This is an implementation of an early-draft specification developed under the Java
 * Community Process (JCP) and is made available for testing and evaluation purposes
 * only. The code is not compatible with any specification of the JCP.
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.compiler.env;

/**
 * A module aware name environment
 *
 */
public interface IModuleAwareNameEnvironment extends INameEnvironmentExtension {
	NameEnvironmentAnswer findType(char[][] compoundTypeName, IModuleContext moduleContext);
	NameEnvironmentAnswer findType(char[] typeName, char[][] packageName, IModuleContext moduleContext);
	boolean isPackage(char[][] parentPackageName, char[] packageName, IModuleContext moduleContext);
}