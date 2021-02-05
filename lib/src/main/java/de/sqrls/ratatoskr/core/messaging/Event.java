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
 * An Event is something that HAS happened. It represents a View into HISTORY.
 */
public class Event<PAYLOAD extends IBaseModel> implements IMessage<PAYLOAD> {

    PAYLOAD payload;
    UUID id;

}
