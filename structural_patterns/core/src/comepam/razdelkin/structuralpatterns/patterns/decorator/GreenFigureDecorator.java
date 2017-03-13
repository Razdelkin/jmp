package comepam.razdelkin.structuralpatterns.patterns.decorator;

import com.badlogic.gdx.graphics.Color;
import comepam.razdelkin.structuralpatterns.figures.Figure;

/**
 * Created by Alex on 3/13/2017.
 */
public class GreenFigureDecorator extends FigureDecorator{

    public GreenFigureDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void draw(int x, int y) {
        getShapeRenderer().setColor(Color.GREEN);
        super.draw(x, y);
    }
}
