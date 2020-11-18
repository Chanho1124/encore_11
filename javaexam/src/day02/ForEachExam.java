package day02;

public class ForEachExam {

	public static void main(String[] args) {
		//¹è¿­ 
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[3] = 3;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(arr[3]);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int value : arr) {
			System.out.println(value);
		}
	}

}
