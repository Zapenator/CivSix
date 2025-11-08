package org.Zapenator.civSix.game;

import org.Zapenator.civSix.game.map.GameMap;

public class GameManager {
    public GameMap map;
    private int turn;
    private boolean gameOver;

    public GameManager(GameMap map) {
        this.map = map;
        this.turn = 0;
        this.gameOver = false;
    }

    public void startGame(){
        while (!gameOver){
            turn++;
            // Per Turn Logic

        }
    }
}
