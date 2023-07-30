package com.AW.SpringbootProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { }
record Address (String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Beijing"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
