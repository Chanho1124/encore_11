package day04;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car("�ƿ��");
		Car car3 = new Car("�׽���");
		Car car4 = new Car("Ƽ��");
		
		System.out.println(car.numberOfCars);
		System.out.println(car2.numberOfCars);
		System.out.println(Car.numberOfCars);

	}

}
