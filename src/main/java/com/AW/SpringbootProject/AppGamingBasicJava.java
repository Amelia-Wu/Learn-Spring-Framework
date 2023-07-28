package com.AW.SpringbootProject;

import com.AW.SpringbootProject.game.GameRunner;
import com.AW.SpringbootProject.game.SuperContraGame;
import com.AW.SpringbootProject.game.PacmanGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGamingBasicJava {

	public static void main(String[] args) {
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
