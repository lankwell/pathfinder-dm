package com.bluemoon.pathfinder.screens;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.bluemoon.pathfinder.PathfinderDM;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 2/05/13
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuScreen extends AbstractScreen {

    private static final float BUTTON_WIDTH = 300f;
    private static final float BUTTON_HEIGHT = 60f;
    private static final float BUTTON_SPACING = 10f;

    public MenuScreen(PathfinderDM game) {
        super(game);
    }

    @Override
    public void resize(
            int width,
            int height) {
        super.resize(width, height);

        // retrieve the skin (created on the AbstractScreen class)
        Skin skin = super.getSkin();

        // create the table actor
        Table layout = new Table();
        layout.setFillParent(true);
        stage.addActor(layout);

        TextButton continueButton = new TextButton("Continue Adventure", skin);
        continueButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(game.getAdventureScreen());
            }
        });
        layout.add(continueButton);
        layout.row();

        TextButton newAdventureButton = new TextButton("New Adventure", skin);
        newAdventureButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(game.getNewAdventureScreen());
            }
        });
        layout.add(newAdventureButton);
        layout.row();

        TextButton hallOfFameButton = new TextButton("Import Adventure", skin);
        hallOfFameButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(game.getImportAdventureScreen());
            }
        });
        layout.add(hallOfFameButton);
    }
}
