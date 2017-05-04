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

package org.apache.carbondata.core.datastore.page;

import org.apache.carbondata.core.datastore.page.statistics.PageStatistics;
import org.apache.carbondata.core.metadata.datatype.DataType;

public class ColumnPage {

  protected final DataType dataType;
  protected final int pageSize;
  protected PageStatistics stats;

  protected ColumnPage(DataType dataType, int pageSize) {
    this.dataType = dataType;
    this.pageSize = pageSize;
    this.stats = new PageStatistics(dataType);
  }

  protected void updateStatistics(Object value) {
    stats.update(value);
  }

  public PageStatistics getStatistics() {
    return stats;
  }
}
