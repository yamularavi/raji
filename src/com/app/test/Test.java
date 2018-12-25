package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Product;
import com.app.config.config;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new AnnotationConfigApplicationContext(config.class); //java config
//ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");   //xml config
Product p=(Product)ac.getBean("pobject");
//System.out.println(p.toString());
System.out.println(p.hashCode());
System.out.println(p);
Product p2=(Product)ac.getBean("pobject");
//System.out.println(p.toString());
System.out.println(p2.hashCode());
System.out.println(p2);
	}

}
