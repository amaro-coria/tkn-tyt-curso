package com.teknei.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teknei.main.beans.MaquinaDeDespidos;

public class Main {
	
	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		MaquinaDeDespidos despedidos = ctx.getBean(MaquinaDeDespidos.class);
		System.out.println(despedidos.despedido());
	}

}
