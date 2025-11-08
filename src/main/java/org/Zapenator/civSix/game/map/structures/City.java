package org.Zapenator.civSix.game.map.structures;

import org.Zapenator.civSix.game.map.Structure;
import org.Zapenator.civSix.game.map.StructureType;

public class City implements Structure {
    @Override
    public void onTurnStart() {
        // whatever happens on turn start
    }

    @Override
    public StructureType getType() {
        return StructureType.CITY;
    }
}
