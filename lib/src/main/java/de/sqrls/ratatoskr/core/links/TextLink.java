package de.sqrls.ratatoskr.core.links;

import com.neovisionaries.i18n.LanguageCode;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;


/**
 * Describes a Link to a (possible long) Text in the given Language.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false)
public class TextLink extends  WeightedLink {

    /**
     * ISO lang code
     */
    LanguageCode languageCode;
}
