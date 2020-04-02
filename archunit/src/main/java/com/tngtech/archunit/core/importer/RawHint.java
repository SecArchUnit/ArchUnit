/*
 * Copyright 2014-2020 TNG Technology Consulting GmbH
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
package com.tngtech.archunit.core.importer;

import com.tngtech.archunit.core.domain.JavaType;

import java.util.Objects;

public class RawHint {
    private JavaType type;
    private JavaType memberOwner;
    private String memberName;

    public RawHint(JavaType type) {
        this.type = type;
    }

    public RawHint(JavaType type, JavaType owner, String name) {
        this(type);
        this.memberOwner = owner;
        this.memberName = name;
    }

    public JavaType getType() {
        return type;
    }

    public JavaType getMemberOwner() {
        return memberOwner;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RawHint rawHint = (RawHint) o;
        return type.equals(rawHint.type) &&
                Objects.equals(memberOwner, rawHint.memberOwner) &&
                Objects.equals(memberName, rawHint.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, memberOwner, memberName);
    }

    @Override
    public String toString() {
        return "RawHint{" +
                "type=" + type +
                ", memberOwner=" + memberOwner +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}
