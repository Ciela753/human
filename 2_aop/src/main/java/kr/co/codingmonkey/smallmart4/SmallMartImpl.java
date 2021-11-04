package kr.co.codingmonkey.smallmart4;

import org.springframework.stereotype.Component;

@Component
public class SmallMartImpl implements SmallMart {

	@Override
	public void getProduct(String msg) {
		System.out.println(msg);
	}

	@Override
	public void getProduct2(String msg) {
		System.out.println(msg);		
	}
	
}
