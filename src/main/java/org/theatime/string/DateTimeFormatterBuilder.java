/*
 * Copyright 2021 Dai MIKURUBE
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

import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.FormatStyle;
import java.time.format.SignStyle;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class DateTimeFormatterBuilder {
    private DateTimeFormatterBuilder() {
    }

    public DateTimeFormatterBuilder appendValue(final TemporalField field) {
        return this;
    }

    public DateTimeFormatterBuilder appendValue(final TemporalField field, final int width) {
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField field, int minWidth, int maxWidth, SignStyle signStyle) {
        return this;
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField field, int width, int maxWidth, int baseValue) {
        return this;
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField field, int width, int maxWidth, ChronoLocalDate baseDate) {
        return this;
    }

    public DateTimeFormatterBuilder appendFraction(TemporalField field, int minWidth, int maxWidth, boolean decimalPoint) {
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField field) {
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField field, TextStyle textStyle) {
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField field, Map<Long, String> textLookup) {
        return this;
    }

    public DateTimeFormatterBuilder appendInstant() {
        return this;
    }

    public DateTimeFormatterBuilder appendInstant(int fractionalDigits) {
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String pattern, String noOffsetText) {
        return this;
    }

    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle style) {
        return this;
    }

    public DateTimeFormatterBuilder appendZoneId() {
        return this;
    }

    public DateTimeFormatterBuilder appendZoneRegionId() {
        return this;
    }

    public DateTimeFormatterBuilder appendZoneOrOffsetId() {
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle, Set<ZoneId> preferredZones) {
        return this;
    }

    public DateTimeFormatterBuilder appendChronologyId() {
        return this;
    }

    public DateTimeFormatterBuilder appendChronologyText(TextStyle textStyle) {
        return this;
    }

    public DateTimeFormatterBuilder appendLocalized(FormatStyle dateStyle, FormatStyle timeStyle) {
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char literal) {
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String literal) {
        return this;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter formatter) {
        return this;
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeFormatter formatter) {
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String pattern) {
        return this;
    }

    public DateTimeFormatterBuilder padNext(int padWidth) {
        return null;
    }

    public DateTimeFormatterBuilder padNext(int padWidth, char padChar) {
        return this;
    }

    public DateTimeFormatterBuilder optionalStart() {
        return this;
    }

    public DateTimeFormatterBuilder optionalEnd() {
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return null;
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return null;
    }
}
