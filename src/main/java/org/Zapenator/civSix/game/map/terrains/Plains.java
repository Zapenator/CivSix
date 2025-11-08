package org.Zapenator.civSix.game.map.terrains;

import org.Zapenator.civSix.game.map.StructureType;
import org.Zapenator.civSix.game.map.Terrain;

public class Plains extends Terrain {
    @Override
    public boolean canSupport(StructureType type) {
        return type == StructureType.FARM || type == StructureType.CITY;
    }
}