package day03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "아우디";
		car.setName("아우디");
		
		System.out.printf("이 차의 이름은 %s 입니다.",car.name);
	}

}
