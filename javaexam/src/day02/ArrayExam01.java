package day02;

import java.util.ArrayList;

class 약{
	
}

public class ArrayExam01 {

	public static void main(String[] args) {
		//배열
		약 월약;
		약 화약;
		약 수약;
		
		약[] 약들;
		
		int i1;
		int i2;
		int i3;
		
		i1 = 10;
		
		int[] arr; //배열 선언
		arr = new int[3];//배열의 생성
		
		int[] arr2 = new int[5]; //선언과 동시에 생성도 가능. 
		
		int arr3[] = new int[5];
		
		//배열에 값을 넣는 방법
		
		i1 = 10;
		arr[0] = 10;
		//배열에서 값을 꺼낼때. 
		i2 = arr[0];
		
		System.out.println(i2);
	//	System.out.println(arr[3]); 배열 인덱스에 벗어나면 예외가 발생한다. 
		
		//int[] iarr = {10,20,30,40,50};
		int[] iarr = new int[]{10,20,30,40,50};  //배열의 초기화는 생성과 동시에 가능!! 
		int[] iarr2 = {10,20,30,40,50};
	//	arr3= {10,20,30,40,50}; 중간에 초기값을 부여하는 것은 불가능 
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
