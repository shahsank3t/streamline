/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hortonworks.iotas.parser;


import com.hortonworks.iotas.common.Schema;

import java.util.Map;

public interface Parser {

    /**
     * Returns the unique device type associated with this parser.
     * @return
     */
    String deviceType();

    /**
     * Returns the device version this parser is associated with. This often
     * corresponds to a particular firmware version.
     * @return
     */
    String version();

    /**
     * Returns the format/schema of the data this parser produces.
     * @return
     */
    Schema schema();

    /**
     * Given a byte array of raw data from a device, returns a set of key-value
     * pairs conforming to the parser's Schema.
     * @param data
     * @return
     */
    Map<String, Object> parse(byte[] data);

}