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
public class PostalAddress extends Thing {
    String street;
    String city;
    String region;
    String locality;
    String country;
    String postalCode;
    String houseNumber;
  //  CountryCode countryCode; //FIXME COUNTRYOCDE ?

}
