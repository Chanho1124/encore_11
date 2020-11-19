package day04;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car("아우디");
		Car car3 = new Car("테슬라");
		Car car4 = new Car("티코");
		
		System.out.println(car.numberOfCars);
		System.out.println(car2.numberOfCars);
		System.out.println(Car.numberOfCars);

	}

}
