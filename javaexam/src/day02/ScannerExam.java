package day02;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���. ");
		int value = keyboard.nextInt();
		
		PlusMachine pm = new PlusMachine();
		int oddSum = pm.oddSum(value);
		
		System.out.println(oddSum);
		System.out.println(value);
		System.out.println("1���� "+value+" ������ Ȧ���� ����"+oddSum+" �Դϴ�.");
		System.out.printf("1���� %d ������ Ȧ���� ���� %d �Դϴ�.",value,oddSum);
	}

}
