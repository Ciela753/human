package kr.co.codingmonkey.aop7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.codingmonkey.aop6.MyDependency;

@Component
public class MyBean {
	private MyDependency dependency;
	
	@Autowired
	public void setDependency(MyDependency dependency) {
		this.dependency = dependency;
	}
	
	public void run() {
		dependency.hello(6000);
		dependency.hello(4000);
		dependency.goodbye(6000);
		dependency.goodbye(4000);
	}
}
