/*
 * Copyright 2018 OmniFaces
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.omnifaces.utils.arquillian.test;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 * A test converter.
 */
public class MyEntityConverter implements Converter<MyEntity>, Serializable {
	public static final String ONLY_ENTITY0_PROPERTY0 = "DAOValue 1";
	private static final long serialVersionUID = 1L;

	@Override
	public MyEntity getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null) {
			return null;
		}
		if(value.equals(ONLY_ENTITY0_PROPERTY0)) {
			return new MyEntity(ONLY_ENTITY0_PROPERTY0);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, MyEntity value) {
		if(value == null) {
			throw new ConverterException();
		}
		return value.getProperty0();
	}
}
