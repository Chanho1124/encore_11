package day04;

public class StaticExam {
	String name;
	int speed;
	
	static int numberOfCars;
	
	
	static void sm1() {
		//static �� �޼ҵ忡���� static �� �ʵ常 ���� �����ϴ�!!! 
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
