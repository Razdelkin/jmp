package comepam.razdelkin.structuralpatterns.patterns.adapter;

import com.badlogic.gdx.math.Vector2;
import comepam.razdelkin.structuralpatterns.figures.Figure;
import comepam.razdelkin.structuralpatterns.figures.FrameworkFigure;
import comepam.razdelkin.structuralpatterns.patterns.flyweight.FlyweightFactory;

/**
 * Created by Alex on 3/14/2017.
 */
public class RectangleAdapter implements FrameworkFigure{

    private Figure rect;

    public RectangleAdapter(){
        rect = FlyweightFactory.getFigure("rectangle");
    }

    @Override
    public void paint(int leftX, int topY, int rightX, int bottomY) {
        Vector2 center = AdapterHelper.getCenter(leftX, rightX, topY, bottomY);
        rect.draw((int) center.x, (int)center.y);
    }
}
