package comepam.razdelkin.structuralpatterns.patterns.composite;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import comepam.razdelkin.structuralpatterns.figures.Figure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 3/14/2017.
 */
public class CompositeFigure implements Figure {

    private ShapeRenderer shapeRenderer;

    public CompositeFigure(){
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setAutoShapeType(true);

    }

    private List<CompositeFigure> compositeFigures = new ArrayList<CompositeFigure>();

    @Override
    public void draw(int x, int y) {
        shapeRenderer.begin();
        shapeRenderer.line(x, y, x+5, y+5);
        shapeRenderer.end();
        if(compositeFigures.size()>0){
            for(CompositeFigure cf : compositeFigures){
                cf.draw(x+10, y+10);
            }
        }
    }

    public void add(CompositeFigure compositeFigure){
        compositeFigures.add(compositeFigure);
    }

    @Override
    public ShapeRenderer getShapeRenderer() {
        return shapeRenderer;
    }
}
