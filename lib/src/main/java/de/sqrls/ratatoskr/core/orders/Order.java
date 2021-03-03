package de.sqrls.ratatoskr.core.orders;

import de.sqrls.ratatoskr.core.StructuredValue;
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
public class Order extends StructuredValue {


    List<OrderLineItem> lineItems;

    ShippingInformation shippingInfo;

    BillingInformation billingInfo;

}
