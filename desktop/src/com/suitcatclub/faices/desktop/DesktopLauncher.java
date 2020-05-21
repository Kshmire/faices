package com.suitcatclub.faices.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.suitcatclub.faices.fAIcesGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "fAIces";
		config.width = 480;
		config.height = 320;
		new LwjglApplication(new fAIcesGame(), config);
	}
}
