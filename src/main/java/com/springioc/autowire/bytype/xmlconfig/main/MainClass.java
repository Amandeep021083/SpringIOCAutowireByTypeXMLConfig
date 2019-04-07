package com.springioc.autowire.bytype.xmlconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.autowire.bytype.xmlconfig.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getCar1().getName());
	}

}
