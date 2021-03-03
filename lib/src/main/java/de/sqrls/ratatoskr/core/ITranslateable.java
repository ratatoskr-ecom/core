package de.sqrls.ratatoskr.core;

import com.neovisionaries.i18n.LanguageCode;

/**
 * Marker interface for Objects that are subject to a specific language,.
 */
public interface ITranslateable extends IBaseModel{

    LanguageCode getLanguageCode();
}
