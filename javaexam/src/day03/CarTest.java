package day03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.numberOfCars++;
		car.name = "아우디";
		car.setName("아우디");
		car.setSpeed(100);
		
		System.out.printf("이 차의 이름은 %s 입니다.",car.name);
		System.out.println();
		Car car2 = new Car();
		Car.numberOfCars++;
		car2.name = "제네시스";
		
		Car car3 = new Car();
		car3.name = "포르쉐";
		Car.numberOfCars++;
		
		System.out.println(car.name);
		System.out.println(car2.name);
		System.out.println(car3.name);
		System.out.println(car3.numberOfCars);
		System.out.println(Car.numberOfCars);
		
		
	}

}
