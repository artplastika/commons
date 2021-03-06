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
package com.github.haixing_hu.collection.primitive.adaptor;

import static com.github.haixing_hu.lang.Argument.requireNonNull;

import com.github.haixing_hu.collection.primitive.IntIterator;
import com.github.haixing_hu.collection.primitive.IntListIterator;

/**
 * An unmodifiable version of {@link IntListIterator}.
 *
 * @author Haixing Hu
 */
public class UnmodifiableIntListIterator implements IntListIterator {

  /**
   * Wraps a {@link IntIterator} as an {@link UnmodifiableIntIterator}.
   *
   * @param iterator
   *          the {@link IntIterator} to be wrap.
   * @return an {@link UnmodifiableIntIterator} wrapping the specified
   *         iterator.
   */
  public static UnmodifiableIntListIterator wrap(final IntListIterator iterator) {
    if (iterator instanceof UnmodifiableIntListIterator) {
      return (UnmodifiableIntListIterator) iterator;
    } else {
      return new UnmodifiableIntListIterator(iterator);
    }
  }

  private final IntListIterator iterator;

  protected UnmodifiableIntListIterator(final IntListIterator iterator) {
    this.iterator = requireNonNull("iterator", iterator);
  }

  @Override
  public void add(final int element) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean hasNext() {
    return iterator.hasNext();
  }

  @Override
  public boolean hasPrevious() {
    return iterator.hasPrevious();
  }

  @Override
  public int next() {
    return iterator.next();
  }

  @Override
  public int nextIndex() {
    return iterator.nextIndex();
  }

  @Override
  public int previous() {
    return iterator.previous();
  }

  @Override
  public int previousIndex() {
    return iterator.previousIndex();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void set(final int element) {
    throw new UnsupportedOperationException();
  }

}
