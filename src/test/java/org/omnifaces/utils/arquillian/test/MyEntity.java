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

/**
 * A DAO used to test setting of values involving conversion.
 */
public class MyEntity {
	private String property0;

	public MyEntity() {
	}

	public MyEntity(String property0) {
		this.property0 = property0;
	}

	public String getProperty0() {
		return property0;
	}

	public void setProperty0(String property0) {
		this.property0 = property0;
	}
}
