package com.AW.SpringbootProject;

import com.AW.SpringbootProject.game.GameRunner;
import com.AW.SpringbootProject.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasicJava {

	public static void main(String[] args) {
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
