package comepam.razdelkin.structuralpatterns.patterns.facade;

import com.badlogic.gdx.Gdx;
import comepam.razdelkin.structuralpatterns.figures.Figure;
import comepam.razdelkin.structuralpatterns.figures.impl.Rectangle;
import comepam.razdelkin.structuralpatterns.figures.impl.Triangle;
import comepam.razdelkin.structuralpatterns.patterns.decorator.GreenFigureDecorator;
import comepam.razdelkin.structuralpatterns.patterns.decorator.ThickLinesFigureDecorator;

/**
 * Created by Alex on 3/13/2017.
 */
public class House {

    private Figure greenRoof = new GreenFigureDecorator(new Triangle());
    private Figure thickWalls = new ThickLinesFigureDecorator(new Rectangle());
    private int triangleX = Gdx.graphics.getWidth()/2;
    private int triangleY = Gdx.graphics.getHeight()/2;
    private int rectX = triangleX-Figure.SIZE/2;
    private int rectY = triangleY-Figure.SIZE;

    public void drawFacade(){
        greenRoof.draw(triangleX, triangleY);
        thickWalls.draw(rectX, rectY);
    }

}
