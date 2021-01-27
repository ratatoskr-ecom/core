package de.sqrls.ratatoskr.core.location;

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
public class GeoCoordinates extends Thing {

    /**The latitude of a location. For example 37.42242 (WGS 84).**/
    double latitude;
    /**The longitude of a location. For example -122.08585 (WGS 84).**/
    double longitude;

    /**The elevation of a location (WGS 84). **/
    double elevation;
}
