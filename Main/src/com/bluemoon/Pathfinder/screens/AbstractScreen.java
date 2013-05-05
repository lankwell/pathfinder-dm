package com.bluemoon.pathfinder.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.bluemoon.pathfinder.PathfinderDM;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 2/05/13
 * Time: 6:47 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractScreen implements Screen {

    protected final PathfinderDM game;
    protected SpriteBatch batch;
    protected BitmapFont font;
    protected Skin skin;
    protected final Stage stage;


    public AbstractScreen(PathfinderDM game) {
        this.game = game;
        this.stage = new Stage(0, 0, true);
    }

    protected String getName() {
        return ((Object) this).getClass().getSimpleName();
    }

    public BitmapFont getFont() {
        if (font == null) {
            font = new BitmapFont();
        }
        return font;
    }

    public SpriteBatch getBatch() {
        if (batch == null) {
            batch = new SpriteBatch();
        }
        return batch;
    }

    protected Skin getSkin() {
        if (skin == null) {
            FileHandle skinFile = Gdx.files.internal( "skin/uiskin.json" );
            FileHandle textureFile = Gdx.files.internal( "skin/uiskin.png" );
            skin = new Skin( skinFile    );
        }
        return skin;
    }


    @Override
    public void render(float delta) {
        stage.act(delta);

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.draw();
    }

    @Override
    public void show() {
        Gdx.app.log(PathfinderDM.LOG, "Showing screen: " + getName());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(PathfinderDM.LOG, "Resizing screen: " + getName() + " to: " + width + " x " + height);

        // resize the stage
        stage.setViewport(width, height, true);
        stage.clear();
    }

    @Override
    public void hide() {
        Gdx.app.log(PathfinderDM.LOG, "Hiding screen: " + getName());

        // dispose the resources by default
        dispose();
    }

    @Override
    public void pause() {
        Gdx.app.log(PathfinderDM.LOG, "Pausing screen: " + getName());
    }

    @Override
    public void resume() {
        Gdx.app.log(PathfinderDM.LOG, "Resuming screen: " + getName());
    }

    @Override
    public void dispose() {
        Gdx.app.log(PathfinderDM.LOG, "Disposing screen: " + getName());

        // dispose the collaborators
        stage.dispose();
        if (font != null) font.dispose();
        if (batch != null) batch.dispose();
    }
}
