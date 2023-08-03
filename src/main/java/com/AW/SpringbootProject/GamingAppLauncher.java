package com.AW.SpringbootProject;

import com.AW.SpringbootProject.game.GameRunner;
import com.AW.SpringbootProject.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.AW.SpringbootProject.game")
public class GamingAppLauncher {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}

}
