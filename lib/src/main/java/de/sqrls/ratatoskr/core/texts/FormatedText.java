package de.sqrls.ratatoskr.core.texts;

import com.neovisionaries.i18n.LanguageCode;
import de.sqrls.ratatoskr.core.BaseModel;
import de.sqrls.ratatoskr.core.ITranslateable;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

/**
 * A text with formatting in a specific Language.
 * use it for titles, unformatted headlines and such.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class FormatedText extends BaseModel implements ITranslateable {

    /**
     * ISO lang code
     */
    LanguageCode languageCode;

    /**
     * Formatting language
     */
    TextFormattingType textFormattingType;

    /**
     * The text in language.
     */
    String text;
}
