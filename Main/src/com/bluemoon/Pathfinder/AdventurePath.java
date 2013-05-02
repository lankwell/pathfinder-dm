package com.bluemoon.Pathfinder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 1/05/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdventurePath {

    private ArrayList<AdventureChapter> chapters = new ArrayList<AdventureChapter>();
    private String splashImageFilename;

    public AdventurePath() {

    }

    public AdventurePath loadFromFile(String filename) {
        AdventurePath ap = new AdventurePath();
        return ap;
    }

    public boolean save() {
        return true;
    }
}
