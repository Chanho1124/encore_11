package day02;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int result = 1;
		System.out.print("�¼�: ");
		int pow = stdin.nextInt();
		int n = pow;
		
		//2*2*2   
		while(n-- > 0) {
			result = result * 2;
		}
		
		System.out.printf("2�� %d �������� %d �Դϴ�.", pow,result);
 
	}

}
