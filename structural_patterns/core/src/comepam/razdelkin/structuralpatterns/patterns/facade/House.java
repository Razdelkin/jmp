package comepam.razdelkin.structuralpatterns.patterns.facade;

import com.badlogic.gdx.Gdx;
import comepam.razdelkin.structuralpatterns.figures.Figure;
import comepam.razdelkin.structuralpatterns.patterns.decorator.GreenFigureDecorator;
import comepam.razdelkin.structuralpatterns.patterns.decorator.ThickLinesFigureDecorator;
import comepam.razdelkin.structuralpatterns.patterns.flyweight.FlyweightFactory;

/**
 * Created by Alex on 3/13/2017.
 */
public class House {

    private Figure greenRoof = new GreenFigureDecorator(FlyweightFactory.getFigure("triangle"));
    private Figure thickWalls = new ThickLinesFigureDecorator(FlyweightFactory.getFigure("rectangle"));
    private int triangleX = Gdx.graphics.getWidth()/2;
    private int triangleY = Gdx.graphics.getHeight()/2;
    private int rectX = triangleX-Figure.SIZE/2;
    private int rectY = triangleY-Figure.SIZE;

    public void drawFacade(){
        greenRoof.draw(triangleX, triangleY);
        thickWalls.draw(rectX, rectY);
    }

}
