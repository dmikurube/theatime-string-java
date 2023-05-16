/*
 * Copyright 2023 Dai MIKURUBE
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

package org.theatime.string;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public final class PosixTimeFormatOptions {
    private PosixTimeFormatOptions(final Map<PosixTimeFormatOption, Boolean> options) {
        this.options = options;
    }

    public static PosixTimeFormatOptions of(final PosixTimeFormatOption... options) {
        final EnumMap<PosixTimeFormatOption, Boolean> optionsMap = new EnumMap<>(PosixTimeFormatOption.class);

        for (final PosixTimeFormatOption option : options) {
            switch (option) {
                case GNU_EXTENSION:
                    optionsMap.put(PosixTimeFormatOption.GNU_EXTENSION, true);
                    break;
                default:
                    optionsMap.put(option, true);
                    break;
            }
        }

        return new PosixTimeFormatOptions(Collections.unmodifiableMap(optionsMap));
    }

    @SuppressWarnings("checkstyle:AbbreviationAsWordInName")
    public boolean isPlusSignAsTerminatingConversionSpecifier() {
        return this.options.getOrDefault(PosixTimeFormatOption.PLUS_SIGN_AS_TERMINATING_CONVERSION_SPECIFIER, false);
    }

    @SuppressWarnings("checkstyle:AbbreviationAsWordInName")
    public boolean isUpperCaseLAsTerminatingConversionSpecifier() {
        return this.options.getOrDefault(PosixTimeFormatOption.UPPERCASE_L_AS_TERMINATING_CONVERSION_SPECIFIER, false);
    }

    @SuppressWarnings("checkstyle:AbbreviationAsWordInName")
    public boolean isUpperCaseNAsTerminatingConversionSpecifier() {
        return this.options.getOrDefault(PosixTimeFormatOption.UPPERCASE_N_AS_TERMINATING_CONVERSION_SPECIFIER, false);
    }

    private final Map<PosixTimeFormatOption, Boolean> options;
}
