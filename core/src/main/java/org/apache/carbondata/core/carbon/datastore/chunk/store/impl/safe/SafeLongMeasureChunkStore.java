/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.carbondata.core.carbon.datastore.chunk.store.impl.safe;

/**
 * Below class will be used to store the measure values of long data type
 *
 */
public class SafeLongMeasureChunkStore extends
    SafeAbstractMeasureDataChunkStore<long[]> {

  /**
   * data
   */
  private long[] data;

  public SafeLongMeasureChunkStore(int numberOfRows) {
    super(numberOfRows);
  }

  /**
   * Below method will be used to store long array data
   *
   * @param data
   */
  @Override
  public void putData(long[] data) {
    this.data = data;
  }

  /**
   * to get the long value
   *
   * @param index
   * @return long value based on index
   */
  @Override
  public long getLong(int index) {
    return this.data[index];
  }
}