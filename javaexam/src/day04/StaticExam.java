package day04;

public class StaticExam {
	String name;
	int speed;
	
	static int numberOfCars;
	
	
	static void sm1() {
		//static 한 메소드에서는 static 한 필드만 접근 가능하다!!! 
	//	System.out.println(name);
		System.out.println(numberOfCars);
	}
	
	void m1() {
		System.out.println(name);
		System.out.println(numberOfCars);
	}
	
	static void sm2() {
		//m1();
		sm1();
	}
	void m2() {
		m1();
		sm1();
		System.out.println(name);
	}
	

}
