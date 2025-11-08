package org.Zapenator.civSix.game.map;

import java.util.LinkedList;
import java.util.List;

public class GameMap {
    private Tile[][] tiles;

    Tile getTile(int x, int y){return tiles[x][y];}

    // Gets the 4 adjacent tiles to the given tile.
    // Can be adjusted to fit needs
    List<Tile> getAdjacent(Tile tile){
        LinkedList<Tile> list = new LinkedList<Tile>();

        if(tile.x>0) list.add(tiles[tile.x-1][tile.y]);
        if(tile.x<tiles.length-1) list.add(tiles[tile.x+1][tile.y]);
        if(tile.y>0) list.add(tiles[tile.x][tile.y-1]);
        if(tile.y<tiles[0].length-1) list.add(tiles[tile.x][tile.y+1]);

        return list;
    }
}
