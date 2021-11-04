package kr.co.codingmonkey.aop6;

import kr.co.codingmonkey.aop6.MyDependency;

public class MyBean {
	private MyDependency dependency;

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
