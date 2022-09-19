/*
 * Copyright 2021 Lightbend Inc.
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
 */

package com.example.wiring.eventsourcedentities.counter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Counter {

  public final Integer value;

  @JsonCreator
  public Counter(@JsonProperty("value") Integer value) {
    this.value = value;
  }

  public Counter increase(int byNum) {
    return new Counter(this.value + byNum);
  }

  public Counter onValueIncreased(ValueIncreased evt) {
    return new Counter(this.value + evt.value);
  }

  public Counter multiply(int times) {
    return new Counter(this.value * times);
  }

  public Counter onValueMultiplied(ValueMultiplied evt) {
    return new Counter(this.value * evt.value);
  }
}
