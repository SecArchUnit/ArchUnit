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
package com.tngtech.archunit.core.domain;

import java.util.Objects;

public class Hint {
    private final JavaClass javaClass;
    private final JavaMember javaMemberOrigin;

    public Hint(JavaClass javaClass, JavaMember memberOrigin) {
        this.javaClass = javaClass;
        this.javaMemberOrigin = memberOrigin;
    }

    public JavaClass getJavaClass() {
        return javaClass;
    }

    public JavaMember getMemberOrigin() {
        return javaMemberOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hint hint = (Hint) o;
        return javaClass.equals(hint.javaClass) &&
                Objects.equals(javaMemberOrigin, hint.javaMemberOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(javaClass, javaMemberOrigin);
    }
}
