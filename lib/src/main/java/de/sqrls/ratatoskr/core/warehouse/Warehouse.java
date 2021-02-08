package de.sqrls.ratatoskr.core.warehouse;

import de.sqrls.ratatoskr.core.location.Venue;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;


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
     * true if this represents a Warehouse not under our Control,
     * e.g. the Stock at a Fulfillment Partner.
     */
    boolean isExternal;

}
