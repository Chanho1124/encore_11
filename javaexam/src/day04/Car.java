package day04;

public class Car {
	//�Ӽ� ( �ʵ� , �������)
	String name;
	int speed; 
	
	static int numberOfCars;
	public Car() {
//		name = "My Car";
//		speed = 0; 
//		numberOfCars++;
		this("My Car");
		System.out.println("Car ����Ʈ ������ ����");		
	}
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		numberOfCars++;
		System.out.println("name �� �޾ƿ��� ������ ����");
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
