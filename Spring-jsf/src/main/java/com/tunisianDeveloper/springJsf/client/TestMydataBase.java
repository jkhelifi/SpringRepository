package com.tunisianDeveloper.springJsf.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMydataBase {

	public static void main(String[] args) {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("**************dataBase created with success!!!****************");

	}

}
