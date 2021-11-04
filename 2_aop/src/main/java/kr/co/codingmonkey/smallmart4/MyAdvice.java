package kr.co.codingmonkey.smallmart4;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component @Aspect
public class MyAdvice {
	@Before("execution(* good*(..))")
	public void simple(JoinPoint jp, int value) {
		if(value>5000) {
			System.out.println("advice access!!!");
		}
	}
	@Before("execution(* good*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around!!!");
		Object obj = pjp.proceed();
		System.out.println("suf around!!!");
		return obj;
	}
	
	@Before("execution(* *2(..)")
	public void before(Joinpoint jp) {
		System.out.println("before");
	}
	
}
