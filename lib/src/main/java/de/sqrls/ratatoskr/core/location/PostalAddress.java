package de.sqrls.ratatoskr.core.location;


import de.sqrls.ratatoskr.core.Thing;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
/**
 * This file is part of Ratatoskr ECOM.
 * Copyright (C) 2020  SQRL SOLUTIONS UG
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
