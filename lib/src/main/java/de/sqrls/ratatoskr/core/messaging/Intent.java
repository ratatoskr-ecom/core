package de.sqrls.ratatoskr.core.messaging;

import de.sqrls.ratatoskr.core.BaseModel;
import de.sqrls.ratatoskr.core.IBaseModel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false)
/**
 * An Intent is something that SHOULD happen. It represents a view into the FUTURE.
 */
public class Intent<PAYLOAD extends IBaseModel> implements IMessage<PAYLOAD> {

    PAYLOAD payload;

    String action;
    UUID id;
}
