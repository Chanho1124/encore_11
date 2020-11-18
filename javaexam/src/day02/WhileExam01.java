package day02;

public class WhileExam01 {

	public static void main(String[] args) {
		//while(조건){}
		int i = 0;
		while(i < 10) {
			System.out.println("안녕!!");
			i++;
		}
		
		while(true) {
			if(i > 5)
				break;
			System.out.println("hello~~!!");
			i++;
			
		}
		while(i < 3) {
			System.out.println("hhhhhhhhhhhhh");
		}
		//조건에 만족하던 하지 않던 반드시 한 번은 실행하게 하고싶다면...  do while 구문을 사용함.
		i = 0;
		do {
			System.out.println("do while~~~!!");
			i++;
		}while(i<3);
		
	}

}
