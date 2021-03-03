package de.sqrls.ratatoskr.core.fulfillment;

import de.sqrls.ratatoskr.core.StructuredValue;
import de.sqrls.ratatoskr.core.location.Venue;
import de.sqrls.ratatoskr.core.orders.Order;
import de.sqrls.ratatoskr.core.orders.ShippingInformation;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class FulfillmentRequest extends StructuredValue {

    public enum FulfillmentType {
        /**
         * A Customer will pick this up at a physical location.
         */
        PICKUP,
        /**
         * Delivery by Shipping or Courier.
         */
        DELIVERY,
        /**
         * Virtual/Digital product made available by download or similar.
         */
        VIRTUAL
    }

    FulfillmentType fulfillmentType;

    Venue pickupLocation;

    ShippingInformation shippingInformation;

    /**
     * true if this is complete fulfillment of the order.
     * false is this is partial fulfillment of the order.
     */
    boolean isCompleteFulfillment;

    /**
     * true is this request is executed by partners or external systems.
     * if externalPartnerURL is set, likely a connector node will pick this request up
     * and forward it to an external system, e.g. a dropshippping platform.
     * false if this request can be completed by internal systems.*
     */
    boolean isExternal;

    URL externalPartnerURL;

    Order order;
}
