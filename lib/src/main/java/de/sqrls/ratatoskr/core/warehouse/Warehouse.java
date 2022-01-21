package de.sqrls.ratatoskr.core.warehouse;

import de.sqrls.ratatoskr.core.location.Venue;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;
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

/**
 * A Warehouse is a special venue that has Products on Stock.
 * If the warehouse supports Shipping or Pickups, we expect it to be able to complete Fulfillment Requests.
 * A Warehouse is a Container of StorageUnits. StorageUnits can be represented as a Tree Structure of subunits.
 * This allows for precise representation of shelves if need be.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends Venue {

    boolean supportsShipping;

    boolean supportsPickup;

    List<StorageUnit> storageunits;

    /**
     * true if this represents a Warehouse not under direct Control,
     * e.g. the Stock at a Fulfillment Partner.
     */
    boolean isExternal;

}
