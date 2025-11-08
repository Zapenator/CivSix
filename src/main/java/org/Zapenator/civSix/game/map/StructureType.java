package org.Zapenator.civSix.game.map;

public class StructureType {
    private final String id;

    public StructureType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Optional static registry or load in through file
    public static final StructureType CITY = new StructureType("city");
    public static final StructureType FARM = new StructureType("farm");
}