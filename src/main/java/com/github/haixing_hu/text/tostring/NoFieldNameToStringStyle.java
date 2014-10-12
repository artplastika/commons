/*
 * Copyright (c) 2014  Haixing Hu
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
 */
package com.github.haixing_hu.text.tostring;

import javax.annotation.concurrent.Immutable;

/**
 * The no field names {@code toString()} style.
 * <p>
 * Using the {@code Person} example from {@link ToStringBuilder}, the
 * output would look like this:
 * </p>
 *
 * <pre>
 * Person@182f0db[John Doe,33,false]
 * </pre>
 *
 * @author Haixing Hu
 */
@Immutable
public final class NoFieldNameToStringStyle extends ToStringStyle {

  private static final long serialVersionUID = 8376261817715975340L;

  public static final NoFieldNameToStringStyle INSTANCE = new NoFieldNameToStringStyle();

  public NoFieldNameToStringStyle() {
    super();
    this.setUseFieldNames(false);
  }

  @Override
  public String toString() {
    return "NoFieldNameToStringStyle";
  }
}