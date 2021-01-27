package de.sqrls.ratatoskr.core.texts;

import com.neovisionaries.i18n.LanguageCode;
import de.sqrls.ratatoskr.core.BaseModel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

/**
 * Text with no formatting in a specific Language.
 * use it for titles, unformatted headlines and such.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class UnformatedText extends BaseModel {

    /**
     * ISO lang code
     */
    LanguageCode languageCode;

    /**
     * The text in language.
     */
    String text;
}
