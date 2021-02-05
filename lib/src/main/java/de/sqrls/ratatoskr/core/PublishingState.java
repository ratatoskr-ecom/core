package de.sqrls.ratatoskr.core;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class PublishingState<T extends IPublishable> extends BaseState<T>{

    public enum STATES{
        DRAFT,
        REVIEW,
        PRIVATE,
        PUBLISHED
    }

    STATES state;
}
