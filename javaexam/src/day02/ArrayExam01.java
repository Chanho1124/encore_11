package day02;

import java.util.ArrayList;

class ��{
	
}

public class ArrayExam01 {

	public static void main(String[] args) {
		//�迭
		�� ����;
		�� ȭ��;
		�� ����;
		
		��[] ���;
		
		int i1;
		int i2;
		int i3;
		
		i1 = 10;
		
		int[] arr; //�迭 ����
		arr = new int[3];//�迭�� ����
		
		int[] arr2 = new int[5]; //����� ���ÿ� ������ ����. 
		
		int arr3[] = new int[5];
		
		//�迭�� ���� �ִ� ���
		
		i1 = 10;
		arr[0] = 10;
		//�迭���� ���� ������. 
		i2 = arr[0];
		
		System.out.println(i2);
	//	System.out.println(arr[3]); �迭 �ε����� ����� ���ܰ� �߻��Ѵ�. 
		
		//int[] iarr = {10,20,30,40,50};
		int[] iarr = new int[]{10,20,30,40,50};  //�迭�� �ʱ�ȭ�� ������ ���ÿ� ����!! 
		int[] iarr2 = {10,20,30,40,50};
	//	arr3= {10,20,30,40,50}; �߰��� �ʱⰪ�� �ο��ϴ� ���� �Ұ��� 
		for(int i = 0; i < iarr.length;i++ ) {
			System.out.println(iarr[i]);
		}
		
		
//		ArrayUtil arrayUtil = new ArrayUtil();
//		System.out.println(arrayUtil.equals(iarr2, iarr));
		
		System.out.println(ArrayUtil.equals(iarr2, iarr));
		
	//	Integer ii = new Integer(10);
		
		int i = Integer.parseInt("20");
	}

}