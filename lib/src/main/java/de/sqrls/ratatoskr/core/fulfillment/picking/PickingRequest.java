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
public class PickingRequest extends StructuredValue {

    Order order;

    FulfillmentRequest fulfillmentRequest;

    Warehouse warehouse;

    List<StockItem> stockItems;

}
