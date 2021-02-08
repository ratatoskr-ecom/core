package de.sqrls.ratatoskr.core.edibles;

import lombok.Data;

@Data
public class NutritionInformation {

    long calories;
    /**The number of grams of carbohydrates.**/
    long carbohydrateContent;
    /**The number of milligrams of cholesterol.**/
    long cholesterolContent;
    /**The number of grams of fat.**/
    long fatContent;

    /**The number of grams of fat.**/
    long fiberContent; //	Mass 	The number of grams of fiber.
    /**he number of grams of protein.**/
    long proteinContent; //	Mass 	The number of grams of protein.
    /**he number of grams of saturated fat.**/
    long saturatedFatContent; //	Mass 	The number of grams of saturated fat.
    /**The serving size, in terms of the number of volume or mass.**/
    String servingSize;	//Text 	The serving size, in terms of the number of volume or mass.
    /**The number of milligrams of sodium.**/
    long sodiumContent; //	Mass 	The number of milligrams of sodium.
    /**The number of grams of sugar.**/
    long sugarContent; //	Mass 	The number of grams of sugar.
    /**The number of grams of trans fat.**/
    long transFatContent; //	Mass 	The number of grams of trans fat.
    /**The number of grams of unsaturated fat.**/
    long unsaturatedFatContent; //	Mass 	The number of grams of unsaturated fat.

}
