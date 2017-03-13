package comepam.razdelkin.structuralpatterns;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import comepam.razdelkin.structuralpatterns.patterns.composite.CompositeFigure;
import comepam.razdelkin.structuralpatterns.patterns.facade.House;

public class Main extends ApplicationAdapter {

	House house;
	CompositeFigure cf1;
	CompositeFigure cf2;
	CompositeFigure cf3;
	CompositeFigure cf4;
	CompositeFigure cf5;

	@Override
	public void create () {
		//we cannot initialize these in constructor because openGL is not initialized yet
		house = new House();

		//create stairs
		cf1 = new CompositeFigure();
		cf2 = new CompositeFigure();
		cf3 = new CompositeFigure();
		cf4 = new CompositeFigure();
		cf5 = new CompositeFigure();
		cf1.add(cf2);
		cf1.add(cf3);
		cf3.add(cf4);
		cf4.add(cf5);
	}

	@Override
	public void render () {
		//clear background before rendering
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//draw house
		house.drawFacade();

		//draw stairs
		cf1.draw(205, 95);
	}
	
	@Override
	public void dispose () {}
}
