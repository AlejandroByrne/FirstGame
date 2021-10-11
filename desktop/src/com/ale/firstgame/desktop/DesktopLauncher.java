package com.ale.firstgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ale.firstgame.Launcher;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Water Drop Game";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Launcher(), config);
	}
}
