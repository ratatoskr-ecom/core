package de.sqrls.ratatoskr.core;


import de.sqrls.ratatoskr.core.texts.FormatedText;
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
public class CreativeWork extends Thing {

    List<FormatedText> workAbstract;
}
