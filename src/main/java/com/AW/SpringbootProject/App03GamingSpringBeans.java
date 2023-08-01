package com.AW.SpringbootProject;

import com.AW.SpringbootProject.game.GameRunner;
import com.AW.SpringbootProject.game.GamingConsole;
import com.AW.SpringbootProject.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}

}
