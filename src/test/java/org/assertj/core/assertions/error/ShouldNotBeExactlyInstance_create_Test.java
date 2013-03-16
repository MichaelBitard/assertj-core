/*
 * Created on Jun 11, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2012 the original author or authors.
 */
package org.assertj.core.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.assertj.core.assertions.error.ShouldNotBeExactlyInstanceOf.shouldNotBeExactlyInstance;

import java.io.File;


import org.assertj.core.assertions.description.Description;
import org.assertj.core.assertions.error.ErrorMessageFactory;
import org.assertj.core.assertions.internal.TestDescription;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link ShouldBeExactlyInstance#create(Description)}</code>.
 * 
 * @author Nicolas François
 */
public class ShouldNotBeExactlyInstance_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldNotBeExactlyInstance("Yoda", File.class);
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TestDescription("Test"));
    assertEquals("[Test] expected <'Yoda'> to have not exactly the same type as:<java.io.File> but was:<java.lang.String>",
        message);
  }
}