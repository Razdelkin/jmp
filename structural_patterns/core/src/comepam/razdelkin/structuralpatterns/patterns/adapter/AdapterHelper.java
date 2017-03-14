package comepam.razdelkin.structuralpatterns.patterns.adapter;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Alex on 3/14/2017.
 */
public class AdapterHelper {
    public static Vector2 getCenter(int xLeft, int xRight, int yTop, int yBot){
        int middleX = (xLeft + xRight)/2;
        int middleY = (yTop + yBot)/2;
        return new Vector2(middleX, middleY);
    }
}
