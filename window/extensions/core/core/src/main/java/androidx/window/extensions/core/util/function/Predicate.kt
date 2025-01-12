/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.window.extensions.core.util.function

/**
 * Represents a predicate boolean-valued function of one argument.
 * It is used internally to avoid using Java 8 functional interface that leads to desugaring and
 * Proguard shrinking.
 *
 * @param T the type of the input to the predicate
 *
 * @see java.util.function.Predicate
 */
fun interface Predicate<in T : Any> {
    /**
     * Tests the predicate against a given argument.
     *
     * @param t the input of the predicate
     * @return `true` if the input matches the [Predicate], otherwise, `false`
     */
    fun test(t: T): Boolean
}