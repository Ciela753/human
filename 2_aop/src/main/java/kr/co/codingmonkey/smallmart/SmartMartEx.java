package kr.co.codingmonkey.smallmart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartMartEx {
	public static void main(String[] args) {
		//applicationContext
		//getProduct2 sml app
		
		//proxyFactoryBean
		//advice
		//Pointcut
		//advisor
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mart.xml");
		SmallMart mart = ctx.getBean("smallMart", SmallMart.class);
		
		mart.getProduct("식빵");
		System.out.println("==============================");
		mart.getProduct2("커피");
		
		ctx.close();
	}
}
