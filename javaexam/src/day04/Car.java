package day04;

public class Car {
	//속성 ( 필드 , 멤버변수)
	String name;
	int speed; 
	
	static int numberOfCars;
	public Car() {
//		name = "My Car";
//		speed = 0; 
//		numberOfCars++;
		this("My Car");
		System.out.println("Car 디폴트 생성자 실행");		
	}
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		numberOfCars++;
		System.out.println("name 을 받아오는 생성자 실행");
	}
	public String getName() {
		return name;
	}
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
