package com.caseydjbugs.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.caseydjbugs.game.BugsGame;
import com.caseydjbugs.game.Scenes.Hud;


/**
 * Created by David on 5/12/2016.
 */
public class BattleScreen implements Screen {
  private BugsGame game;

    private OrthographicCamera gameCamera;
    private Viewport viewport;
    private Hud hud;


    public BattleScreen(BugsGame game) {
        this.game = game;

        gameCamera = new OrthographicCamera();
        //different types of viewports change how you look at game
        viewport = new FitViewport(BugsGame.width,BugsGame.height,gameCamera);
        hud = new Hud(game.batch);

    }

    @Override
    public void show() {

    }

     public void handleInput(float dt) {
         //if(Gdx.input.isTouched());

     }
    public void update(float dt) {
        handleInput(dt);
    }
    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }
    /*
    User this to auto adjust screen
     */
    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}