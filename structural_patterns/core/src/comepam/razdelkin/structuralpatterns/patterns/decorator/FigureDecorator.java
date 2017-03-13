package comepam.razdelkin.structuralpatterns.patterns.decorator;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import comepam.razdelkin.structuralpatterns.figures.Figure;

/**
 * Created by Alex on 3/13/2017.
 */
public abstract class FigureDecorator implements Figure {

    private final Figure figure;


    public FigureDecorator(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void draw(int x, int y) {
        figure.draw(x , y);
    }

    @Override
    public ShapeRenderer getShapeRenderer() {
        return figure.getShapeRenderer();
    }
}
