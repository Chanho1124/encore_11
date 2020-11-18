package day02;

public class Exam02 {

	public static void main(String[] args) {
		int number = 100;
		
		PlusMachine pm = new PlusMachine();
		int sum = pm.evenSum(number);
		System.out.println("짝수의 합 : "+sum);
		System.out.println("홀수의 합 : "+ pm.oddSum(number));
		System.out.println("전체 합 : "+ pm.sum(number));
		
		System.out.println(10);
		System.out.println('a');
		System.out.println("strr");
		System.out.println(10.1);
		
	}

}
