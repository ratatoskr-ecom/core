package de.sqrls.ratatoskr.core;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class BaseState<T extends IBaseModel> extends BaseModel{

    /**
     * This is the State of Object X.
     */
    UUID ofId;

    /**
     * This is the State of Object X.
     */
    T of;

}
