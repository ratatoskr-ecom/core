package de.sqrls.ratatoskr.core.edibles.menu;


import de.sqrls.ratatoskr.core.CreativeWork;

import java.time.ZonedDateTime;
import java.util.List;

public class EdibleMenu extends CreativeWork {

    List<EdibleMenuSection> sections;
    List<EdibleMenuItem> menuItems;

    ZonedDateTime validFrom;
    ZonedDateTime validUntil;

}
