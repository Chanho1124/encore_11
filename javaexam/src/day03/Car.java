package day03;

/*class 엔진{
	
}*/
public class Car {
	//default 생성자 
	public Car() {
		System.out.println("Car 생성자");
	}
	//생성자 오버로딩
	public Car(String name) {
		this.name = name;
	}
	//클래스의 속성 - 필드  
	String name;
	int speed;
	static int numberOfCars;
	//엔진 e;
	
	//클래스의 기능 , 행위  - 메소드 
	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
	
	
}
