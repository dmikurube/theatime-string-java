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

package org.theatime.format.posix;

import java.time.format.DateTimeFormatterBuilder;
import java.util.Objects;

final class Literal extends Specification {
    private Literal(final String literal, final Context context) {
        super(context);
        this.literal = literal;
    }

    static Literal of(final String immediate, final Context context, final boolean formatted) {
        if (formatted) {
            // TODO: Format the immediate string with context.
            //
            // For example,
            // "%010q" => "00000%010q"
            // "%010%" => "000000000%"
            // "%^010q" => "0000%^010Q"
            return new Literal(format(immediate, context), context);
        } else {
            return new Literal(immediate, context);
        }
    }

    static Literal ofPercent(final Context context, final boolean formatted) {
        return of("%", context, formatted);
    }

    static Literal ofNewline(final Context context, final boolean formatted) {
        return of("\n", context, formatted);
    }

    static Literal ofTab(final Context context, final boolean formatted) {
        return of("\t", context, formatted);
    }

    Literal append(final Literal other) {
        if (this.end != other.start) {
            throw new IllegalArgumentException("Non-consecutive literals are appended.");
        }

        return new Literal(
                this.literal + other.literal,
                new Context(
                        false,
                        false,
                        -1,
                        -1,
                        '\0',
                        '\0',
                        this.entireFormat,
                        this.start,
                        other.end));
    }

    @Override
    DateTimeFormatterBuilder appendTo(final DateTimeFormatterBuilder formatter) {
        return formatter.appendLiteral(this.literal);
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (!(otherObject instanceof Literal)) {
            return false;
        }

        final Literal other = (Literal) otherObject;
        return Objects.equals(this.literal, other.literal);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.literal);
    }

    @Override
    public final String toString() {
        return this.literal;
    }

    private static String format(final String original, final Context context) {
        final int length = original.length();
        if (length > context.precision) {
            return original;
        }

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < (context.precision - length); i++) {
            builder.append(context.pad == '\0' ? ' ' : context.pad);
        }
        builder.append(original);
        return builder.toString();
    }

    private final String literal;
}
