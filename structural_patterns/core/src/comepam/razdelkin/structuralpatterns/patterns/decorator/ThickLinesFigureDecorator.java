package comepam.razdelkin.structuralpatterns.patterns.decorator;

import com.badlogic.gdx.Gdx;
import comepam.razdelkin.structuralpatterns.figures.Figure;

/**
 * Created by Alex on 3/13/2017.
 */
public class ThickLinesFigureDecorator extends FigureDecorator{

    public ThickLinesFigureDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void draw(int x, int y) {
        Gdx.gl.glLineWidth(4);
        super.draw(x, y);
        Gdx.gl.glLineWidth(1);
    }
}
