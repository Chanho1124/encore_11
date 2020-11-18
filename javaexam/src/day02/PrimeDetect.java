package day02;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		
		while(divisor < num) {
			if(num % divisor++ == 0)
				isPrime = false;
		}
		if(isPrime)
			System.out.println("소수");
		else
			System.out.println("not 소수");
	}

}
