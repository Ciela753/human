package kr.co.codingmonkey.aop5;

public class MyBean {
	
	public void setDependency(MyDependency dependency) {
		this.dependency = dependency;
	}
	private MyDependency dependency;
	public void run() {
		dependency.hello();
		dependency.goodbye();
	}
}
