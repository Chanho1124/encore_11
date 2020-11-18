package day02;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int result = 1;
		System.out.print("승수: ");
		int pow = stdin.nextInt();
		int n = pow;
		
		//2*2*2   
		while(n-- > 0) {
			result = result * 2;
		}
		
		System.out.printf("2의 %d 제곱근은 %d 입니다.", pow,result);
 
	}

}
