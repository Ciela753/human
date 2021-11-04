package kr.co.codingmonkey.aop6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop6.xml");
		ctx.getBean(name);
	}
	
}
