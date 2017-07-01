package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestIOC {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("resource/applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
		System.out.println(person.say());
	}
	
}
