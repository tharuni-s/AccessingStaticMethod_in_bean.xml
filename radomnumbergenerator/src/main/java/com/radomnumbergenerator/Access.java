package com.radomnumbergenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		RandomNumberGenerator random = context.getBean(RandomNumberGenerator.class);
		System.out.println("random num id"+random.getRandomNumber());
		System.out.println("pi value is" +random.getPi());
		System.out.println("value from another class"+random.getDataFromAnotherClass());
		System.out.println("function from another class"+random.getGetValueFromAnotherFunction());

	}

}
