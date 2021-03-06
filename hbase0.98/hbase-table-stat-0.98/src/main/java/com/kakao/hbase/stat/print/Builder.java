/*
 * Copyright 2015 Kakao Corporation
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

package com.kakao.hbase.stat.print;

import com.kakao.hbase.common.LoadEntry;

import java.util.Map;

abstract class Builder {
    static final String DELIMITER_DIFF = " | ";

    int getLength(String string) {
        return string == null ? LoadEntry.NOT_AVAILABLE.length() : string.length();
    }

    abstract void build(Map<String, Length> lengthMap, StringBuilder sb, String key, String value, String diff, Formatter.Type formatType);
}