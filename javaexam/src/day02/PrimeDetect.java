package day02;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		
		while(divisor < num) {
			if(num % divisor++ == 0)
				isPrime = false;
		}
		if(isPrime)
			System.out.println("�Ҽ�");
		else
			System.out.println("not �Ҽ�");
	}

}
