package de.sqrls.ratatoskr.core.edibles.menu;


import de.sqrls.ratatoskr.core.CreativeWork;

import de.sqrls.ratatoskr.core.edibles.IEdible;
import de.sqrls.ratatoskr.core.edibles.NutritionInformation;
import de.sqrls.ratatoskr.core.edibles.RestrictedDiet;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;

public class EdibleMenuItem extends CreativeWork {

    RestrictedDiet suitableForDiet;
    NutritionInformation nutritionInformation;

    Money price;
    CurrencyUnit currencyUnit;

    IEdible about;
}
