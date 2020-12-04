/*
 * Copyright (C) 2017-2020 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package com.here.xyz.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName(value = "IterateHistoryEvent")
public final class IterateHistoryEvent extends SearchForFeaturesEvent<IterateHistoryEvent> {

  private String nextPageToken;
  private Integer vStart;
  private Integer vEnd;
  private boolean compact;

  public Integer getVStart() {
    return vStart;
  }

  public void setVStart(Integer vStart) {
    this.vStart = vStart;
  }

  public IterateHistoryEvent withVStart(Integer vEnd) {
    setVStart(vEnd);
    return this;
  }

  public Integer getVEnd() {
    return vEnd;
  }

  public void setVEnd(Integer vEnd) {
    this.vEnd = vEnd;
  }

  public IterateHistoryEvent withVEnd(Integer vEnd) {
    setVEnd(vEnd);
    return this;
  }

  @SuppressWarnings("unused")
  public String getNextPageToken() {
    return nextPageToken;
  }

  @SuppressWarnings("WeakerAccess")
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @SuppressWarnings("unused")
  public IterateHistoryEvent withNextPageToken(String nextPageToken) {
    setNextPageToken(nextPageToken);
    return this;
  }

  public boolean isCompact() {
    return compact;
  }

  public void setCompact(Boolean compact) {
    this.compact = compact;
  }

  public IterateHistoryEvent withCompact(boolean compact) {
    setCompact(compact);
    return this;
  }
}
