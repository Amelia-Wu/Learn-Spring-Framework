package com.AW.SpringbootProject;

import com.AW.SpringbootProject.game.GameRunner;
import com.AW.SpringbootProject.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App02GamingBasicJava {

	public static void main(String[] args) {
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2. Configuration for Spring
		// 3. Retrieve the Beans
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
	}

}
