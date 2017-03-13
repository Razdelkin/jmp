package comepam.razdelkin.structuralpatterns;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import comepam.razdelkin.structuralpatterns.patterns.facade.House;

public class Main extends ApplicationAdapter {

	House house;

	@Override
	public void create () {
		house = new House();
	}

	@Override
	public void render () {
		//clear background
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//draw house
		house.drawFacade();

	}
	
	@Override
	public void dispose () {

	}
}
