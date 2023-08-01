package com.AW.SpringbootProject.helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App02HelloWorldJava {

	public static void main(String[] args) {
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2. Configuration for Spring
		// 3. Retrieve the Beans
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("address"));

		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}