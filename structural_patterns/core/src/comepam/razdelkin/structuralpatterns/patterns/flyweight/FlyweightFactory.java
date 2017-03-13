package comepam.razdelkin.structuralpatterns.patterns.flyweight;

import comepam.razdelkin.structuralpatterns.figures.Figure;
import comepam.razdelkin.structuralpatterns.figures.impl.Rectangle;
import comepam.razdelkin.structuralpatterns.figures.impl.Triangle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 3/14/2017.
 */
public class FlyweightFactory {

    private static Map<String, Figure> figureMap = new HashMap<String, Figure>();
    public static Figure getFigure(String figureType){

        Figure figure = figureMap.get(figureType);

        if(figure == null){
            if(figureType.equals("rectangle")){
                figure = new Rectangle();
                figureMap.put(figureType, new Rectangle());
            }
            else if(figureType.equals("triangle")){
                figure = new Triangle();
                figureMap.put(figureType, figure);
            }
        }
        return figure;
    }
}
