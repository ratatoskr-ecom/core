package de.sqrls.ratatoskr.core.edibles.menu;


import de.sqrls.ratatoskr.core.CreativeWork;

import de.sqrls.ratatoskr.core.edibles.IEdible;
import de.sqrls.ratatoskr.core.edibles.NutritionInformation;
import de.sqrls.ratatoskr.core.edibles.RestrictedDiet;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
/**
 * This file is part of Ratatoskr ECOM.
 * Copyright (C) 2020  SQRL SOLUTIONS UG
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class EdibleMenuItem extends CreativeWork {

    RestrictedDiet suitableForDiet;
    NutritionInformation nutritionInformation;

    Money price;
    CurrencyUnit currencyUnit;

    IEdible about;
}
