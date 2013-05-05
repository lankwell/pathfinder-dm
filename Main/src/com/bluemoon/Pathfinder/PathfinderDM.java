package com.bluemoon.pathfinder;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.bluemoon.pathfinder.screens.*;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 30/04/13
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class PathfinderDM extends Game {

    // constant useful for logging
    public static final String LOG = PathfinderDM.class.getSimpleName();

    // a libgdx helper class that logs the current FPS each second
    private FPSLogger fpsLogger;

    public PathfinderDM() {

    }

    @Override
    public void create() {
        Gdx.app.log(PathfinderDM.LOG, "Creating game");
        fpsLogger = new FPSLogger();
        setScreen(getSplashScreen());
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(PathfinderDM.LOG, "Resizing game to: " + width + " x " + height);
    }

    @Override
    public void render() {
        super.render();

        // output the current FPS
        fpsLogger.log();
    }

    @Override
    public void pause() {
        Gdx.app.log(PathfinderDM.LOG, "Pausing game");
    }

    @Override
    public void resume() {
        Gdx.app.log(PathfinderDM.LOG, "Resuming game");
    }

    @Override
    public void dispose() {
        Gdx.app.log(PathfinderDM.LOG, "Disposing game");
    }

    public SplashScreen getSplashScreen() {
        return new SplashScreen(this);
    }

    public MenuScreen getMenuScreen() {
        return new MenuScreen(this);
    }

    public AdventureScreen getAdventureScreen() {
        return new AdventureScreen(this);
    }

    public NewAdventureScreen getNewAdventureScreen() {
        return new NewAdventureScreen(this);
    }

    public ImportAdventureScreen getImportAdventureScreen() {
        return new ImportAdventureScreen(this);
    }

    @Override
    public void setScreen(Screen screen) {
        super.setScreen(screen);
        Gdx.app.log(PathfinderDM.LOG, "Setting screen: " + screen.getClass().getSimpleName());
    }

}
