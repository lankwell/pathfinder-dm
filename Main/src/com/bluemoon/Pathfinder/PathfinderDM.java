package com.bluemoon.Pathfinder;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;

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

    @Override
    public void create() {
        Gdx.app.log( PathfinderDM.LOG, "Creating game" );
        fpsLogger = new FPSLogger();
    }

    @Override
    public void resize(
            int width,
            int height )
    {
        Gdx.app.log( PathfinderDM.LOG, "Resizing game to: " + width + " x " + height );
    }

    @Override
    public void render()
    {
        // the following code clears the screen with the given RGB color (green)
        Gdx.gl.glClearColor( 0f, 1f, 0f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );

        // output the current FPS
        fpsLogger.log();
    }

    @Override
    public void pause()
    {
        Gdx.app.log( PathfinderDM.LOG, "Pausing game" );
    }

    @Override
    public void resume()
    {
        Gdx.app.log( PathfinderDM.LOG, "Resuming game" );
    }

    @Override
    public void dispose()
    {
        Gdx.app.log( PathfinderDM.LOG, "Disposing game" );
    }}
