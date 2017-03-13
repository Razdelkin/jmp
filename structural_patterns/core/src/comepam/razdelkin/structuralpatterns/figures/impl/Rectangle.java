package comepam.razdelkin.structuralpatterns.figures.impl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import comepam.razdelkin.structuralpatterns.figures.Figure;
import comepam.razdelkin.structuralpatterns.render.ShapeRendererContainer;


/**
 * Created by Alex on 3/13/2017.
 */
public class Rectangle implements Figure{
    private ShapeRenderer shapeRenderer = new ShapeRenderer();

    public Rectangle(){
        shapeRenderer.setAutoShapeType(true);
    }

    @Override
    public void draw(int centerX, int centerY) {
        shapeRenderer.begin();
        shapeRenderer.rect(centerX, centerY, SIZE, SIZE);
        shapeRenderer.end();
    }

    @Override
    public ShapeRenderer getShapeRenderer() {
        return shapeRenderer;
    }
}
