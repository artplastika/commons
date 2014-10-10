/******************************************************************************
 *
 * Copyright (c) 2013  Haixing Hu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package com.github.haixing_hu.io.serialize;

import com.github.haixing_hu.io.exception.SerializationException;

/**
 * Thrown to indicate that no binary serializer was registered for the specified
 * class.
 *
 * @author Haixing Hu
 */
public class NoBinarySerializerRegisteredException extends
    SerializationException {

  private static final long serialVersionUID = - 7020988206462175166L;

  private final Class<?> objectClass;

  public NoBinarySerializerRegisteredException(final Class<?> objectClass) {
    super("No binary serializer was registered for class " + objectClass);
    this.objectClass = objectClass;
  }

  public Class<?> getObjectClass() {
    return objectClass;
  }
}
