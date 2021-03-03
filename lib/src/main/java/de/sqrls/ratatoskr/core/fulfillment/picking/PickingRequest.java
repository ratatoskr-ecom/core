package de.sqrls.ratatoskr.core.fulfillment.picking;


import de.sqrls.ratatoskr.core.StructuredValue;
import de.sqrls.ratatoskr.core.fulfillment.FulfillmentRequest;
import de.sqrls.ratatoskr.core.orders.Order;
import de.sqrls.ratatoskr.core.warehouse.StockItem;
import de.sqrls.ratatoskr.core.warehouse.Warehouse;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class PickingRequest extends StructuredValue {

    Order order;

    FulfillmentRequest fulfillmentRequest;

    Warehouse warehouse;

    List<StockItem> stockItems;

}
