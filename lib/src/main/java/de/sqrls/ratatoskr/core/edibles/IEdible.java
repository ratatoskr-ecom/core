package de.sqrls.ratatoskr.core.edibles;

import de.sqrls.ratatoskr.core.IBaseModel;


/**
 * Marker interface for Products and Things that are "Edible"
 */
public interface IEdible extends IBaseModel {

    NutritionInformation getNutritionInfo();
    void getNutritionInfo(NutritionInformation  nutriInfo);
}
