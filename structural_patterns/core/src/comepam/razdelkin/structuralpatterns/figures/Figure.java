package comepam.razdelkin.structuralpatterns.figures;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Alex on 3/12/2017.
 */
public interface Figure {
    int SIZE = 150;

    void draw(int x, int y);

    ShapeRenderer getShapeRenderer();

}
