package day03;

/*class ����{
	
}*/
public class Car {
	//default ������ 
	public Car() {
		System.out.println("Car ������");
	}
	//������ �����ε�
	public Car(String name) {
		this.name = name;
	}
	//Ŭ������ �Ӽ� - �ʵ�  
	String name;
	int speed;
	static int numberOfCars;
	//���� e;
	
	//Ŭ������ ��� , ����  - �޼ҵ� 
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
