package de.sqrls.ratatoskr.core.calendar;

import de.sqrls.ratatoskr.core.BaseState;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class EventStatus extends BaseState<CalendarEvent> {

    public enum STATES {
        EventCancelled,
        EventPostponed,
        EventRescheduled,
        EventScheduled
    }

    STATES state;
}
