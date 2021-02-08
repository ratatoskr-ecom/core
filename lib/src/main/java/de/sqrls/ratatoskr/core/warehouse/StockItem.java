package de.sqrls.ratatoskr.core.warehouse;


import de.sqrls.ratatoskr.core.Thing;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class StockItem extends Thing {

    StorageUnit storageUnit;

    long quantity;

}
