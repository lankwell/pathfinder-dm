package com.bluemoon.pathfinder;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 30/04/13
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class DesktopStarter {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Pathfinder DungeonMaster";
        cfg.useGL20 = true;
        cfg.width = 1280;
        cfg.height = 800;
        new LwjglApplication(new PathfinderDM(), cfg);
    }

}
