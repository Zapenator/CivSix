package org.Zapenator.civSix.game.map;

public class Tile {
    public final int x,y;
    private final Terrain terrain;
    private Terrain structure;

    public Tile(int x, int y, Terrain terrain) {
        this.x = x;
        this.y = y;
        this.terrain = terrain;
    }

    public boolean canBuild(StructureType type){
        return terrain.canSupport(type);
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public Terrain getStructure() {
        return structure;
    }

}
