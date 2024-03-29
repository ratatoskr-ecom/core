package de.sqrls.ratatoskr.core.calendar;

import com.neovisionaries.i18n.LanguageCode;

import de.sqrls.ratatoskr.core.Thing;
import de.sqrls.ratatoskr.core.location.Place;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
/**
 * This file is part of Ratatoskr ECOM.
 * Copyright (C) 2020  SQRL SOLUTIONS UG
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
/**
 * Represents a Calendar Event
 * We call this "Calendar Event" to not clash with messaging.Event
 */
public class CalendarEvent extends Thing {


    Thing about;

    /**
     * The time admission will commence.
     */
    ZonedDateTime doorTime;

    ZonedDateTime startDate;

    ZonedDateTime endDate;
    /**
     * The duration, in minutes
     */
    long duration;
    /**
     *  Flag to say that this is an all-day or multiple-day event
     */
    boolean allDay;

    /**
     * The language of the content or performance or used in an action.
     */
    LanguageCode inLanguage;

    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    boolean isAccessibleForFree;

    /**
     * A flag to signal this is pure virtual event.
     */
    boolean isVirtual;

    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    Place location;

    /**
     * meeting point, MAY differ from location.
     */
    Place meetingPlace;

    /**
     * A flag to signal that this event is part of a larger event.
     */
    boolean hasParent;

    CalendarEvent parentEvent;

    /**
     * The total number of individuals that may attend an event or venue.
     */
    int maximumAttendeeCapacity;


    /**
     * The number of attendee places for an event that remain unallocated.
     */
    int remainingAttendeeCapacity;
}
