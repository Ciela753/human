package kr.co.codingmonkey.aop7;

public class MyDependency {
	public void hello(int value) {
		System.out.println("hello :: " + value);
	}
	
	public void goodbye(int value){
		System.out.println("goodbye ::"+value);
	}
}
