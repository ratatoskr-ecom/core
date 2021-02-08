package de.sqrls.ratatoskr.core.warehouse;

import de.sqrls.ratatoskr.core.Thing;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

/**
 * A Storage Unit is Specific Physical Location that can store Things.
 * Examples include cupboards and containers.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class StorageUnit extends Thing {

    StorageUnit parent;
    Warehouse warehouse;
}
