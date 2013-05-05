package com.bluemoon.pathfinder.screens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.utils.Scaling;
import com.bluemoon.pathfinder.PathfinderDM;
import com.bluemoon.pathfinder.screens.AbstractScreen;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.*;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 2/05/13
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashTexture;
    private TextureRegion splashTextureRegion;

    public SplashScreen(PathfinderDM game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        // load the splash image and create the texture region
        splashTexture = new Texture("splash.png");

        // we set the linear texture filter to improve the stretching
        splashTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        splashTextureRegion = new TextureRegion(splashTexture, 203, 0, 618, 800);
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        stage.clear();

        TextureRegion splashRegion = new TextureRegion(splashTexture, 213, 0, 616, 800);

        // here we create the splash image actor and set its size
        Image splashImage = new Image(splashRegion);
        splashImage.setWidth(width);
        splashImage.setHeight(height);
        splashImage.setAlign(Align.bottom | Align.left);
        splashImage.setScaling(Scaling.stretch);
        Color c = splashImage.getColor();
        splashImage.setColor(c.r, c.g, c.b, 0f);

        // configure the fade-in/out effect on the splash image
        splashImage.addAction(sequence(fadeIn(1.0f), delay(2.0f), fadeOut(1.0f),
                new Action() {
                    @Override
                    public boolean act(float delta) {
                        // the last action will move to the next screen
                        game.setScreen(game.getMenuScreen());
                        return true;
                    }
                }
        ));

        // and finally we add the actors to the stage, on the correct order
        stage.addActor(splashImage);
    }

    @Override
    public void hide() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispose() {
        super.dispose();
        splashTexture.dispose();
    }
}
