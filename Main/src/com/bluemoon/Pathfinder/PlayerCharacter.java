package com.bluemoon.Pathfinder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 1/05/13
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerCharacter extends Character {

    private String playerName;
    private Race race;
    private long ageInMinutes;
    private int height; // inches
    private int weight; // pounds
    private String hair;
    private String eyes;
    private String homeland;
    private int copperPieces;
    private int silverPieces;
    private int goldPieces;
    private int platinumPieces;
    private ArrayList<Trait> traits;

    public PlayerCharacter() {

    }

    public PlayerCharacter fromJson(String json) {
        PlayerCharacter pc = new PlayerCharacter();
        return pc;
    }
}
