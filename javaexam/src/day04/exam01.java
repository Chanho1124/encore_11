package day04;

import java.lang.reflect.Method;

public class exam01 {
	String name;
	
	public void method(String nmae) {
		this.name = name;
	}
	//스택한 메소드 안에서 this라는 키워드는 쓸수 없다. 
	public static void smethod(String name) {
	//	this.name = name;
		System.out.println("name");
	}
	public static void main(String[] args) {
		Math.random();
		
		smethod("nmae");
		
		exam01 ex1= new exam01();
		
		ex1.method("kang");
	}

}
