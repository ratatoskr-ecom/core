package de.sqrls.ratatoskr.core.location;

import de.sqrls.ratatoskr.core.StructuredValue;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class GeoShape  extends StructuredValue {

}
