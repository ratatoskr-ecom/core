package de.sqrls.ratatoskr.core.links;


import de.sqrls.ratatoskr.core.BaseModel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false)
public class WeightedLink extends BaseModel {

    private URL url;

    private String title;

}
