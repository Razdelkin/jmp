package comepam.razdelkin.structuralpatterns.figures.impl;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import comepam.razdelkin.structuralpatterns.figures.Figure;

/**
 * Created by Alex on 3/13/2017.
 */
public class Triangle implements Figure {

    private ShapeRenderer shapeRenderer = new ShapeRenderer();

    public Triangle(){
        shapeRenderer.setAutoShapeType(true);
    }

    @Override
    public void draw(int centerX, int centerY) {
        shapeRenderer.begin();
        shapeRenderer.triangle(centerX - SIZE/2, centerY, centerX+SIZE/2, centerY , centerX, centerY+ SIZE/2);
        shapeRenderer.end();
    }

    @Override
    public ShapeRenderer getShapeRenderer() {
        return shapeRenderer;
    }
}
