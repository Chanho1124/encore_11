package day03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.numberOfCars++;
		car.name = "�ƿ��";
		car.setName("�ƿ��");
		car.setSpeed(100);
		
		System.out.printf("�� ���� �̸��� %s �Դϴ�.",car.name);
		System.out.println();
		Car car2 = new Car();
		Car.numberOfCars++;
		car2.name = "���׽ý�";
		
		Car car3 = new Car();
		car3.name = "������";
		Car.numberOfCars++;
		
		System.out.println(car.name);
		System.out.println(car2.name);
		System.out.println(car3.name);
		System.out.println(car3.numberOfCars);
		System.out.println(Car.numberOfCars);
		
		
	}

}
