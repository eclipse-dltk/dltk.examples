/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.example.docprovider;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.model.ForeignElement;
import org.eclipse.dltk.javascript.typeinfo.model.Element;

public class ElementWrapper extends ForeignElement {

	final Element element;

	public ElementWrapper(IModelElement parent, Element element)
			throws IllegalArgumentException {
		super(parent);
		this.element = element;
	}

	@Override
	public void codeSelect() {
		// TODO Auto-generated method stub
	}
}