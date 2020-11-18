package day02;

public class ArrayExam03 {
	
	public static void main(String[] args) {
		int[][] arr[][];
		
		int[] iarr[];
		int[][] iarr2;
		int iarr3[][];
		
		int[][] iarr4 = new int[3][2];
		iarr4[0][1]=10;
		
		System.out.println(iarr4[0][1]);
		
		int[][] iarr5 = new int[3][];
	//	iarr5[0][1]=10;
		iarr5[0] = new int[5];
		iarr5[1] = new int[1];
		iarr5[2] = new int[2];
		
		String str=null;
	//	str.charAt(0);
		
		int[][] iarr6 = {{1,2,3},{4,5},{6},{7,8,9}};
		
		for(int i = 0 ; i < iarr6.length; i++) {
			for(int j = 0; j < iarr6[i].length; j++) {
				System.out.print(iarr6[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
