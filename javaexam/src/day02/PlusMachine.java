package day02;

public class PlusMachine {
	
	//�޼ҵ� 
	//�޼ҵ� �����ε� (���� �̸��� �޼��带 ������ ���� �� ���ִ�.
	public int evenSum(int startNumber, int endNumber) {
		int sum=0;
		for(int i = startNumber; i <= endNumber; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		return sum;
	}
	//����������  ����Ÿ�� �޽����(�Ű�������...)
	public int evenSum(String num) {
		return 0;
	}
	public int evenSum(int number) {
//		int sum=0;
//		for(int i = 1; i <= number; i++) {
//			if(i % 2 == 0)
//				sum += i;
//		}
//		return sum;
		return evenSum(1, number);
	}
	
	//Ȧ���� ���� ���ϴ� �޼��� 
	public int  oddSum(int number) {
		int sum=0;
		for(int i = 1; i <= number; i++) {
			if(i % 2 != 0)
				sum += i;
		}
		return sum;
	}
	//1���� number ������ ��
	public int sum(int number) {
//		int sum =0;
//		for(int i = 1; i<= number; i++ )
//			sum += i;
//		return sum;
		return evenSum(number)+oddSum(number);
	}
}