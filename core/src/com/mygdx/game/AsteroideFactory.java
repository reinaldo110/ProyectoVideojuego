package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public interface AsteroideFactory {
    Asteroide createAsteroide(int x, int y, int size, int xSpeed, int ySpeed, Texture tx);
}
