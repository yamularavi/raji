package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.app.bean.Product;

@Configuration
public class config {
	@Bean
	@Scope("prototype")
	public Product pobject()
	{
		Product p=new Product();
		p.setId(2);
		p.setName("ravikumar");
		return p;
	}
	

}
