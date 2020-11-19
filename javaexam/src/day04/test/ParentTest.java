package day04.test;

import day04.Parent;

public class ParentTest extends Parent{
	public void testMethod() {
	//	System.out.println(age);
		System.out.println(height);
	}

	public static void main(String[] args) {
		Parent p = new Parent();
//		System.out.println(p.age);
		System.out.println(p.name);
//		System.out.println(p.height);
	//	System.out.println(p.w);
	}

}
