package day02;

public class WhileExam01 {

	public static void main(String[] args) {
		//while(����){}
		int i = 0;
		while(i < 10) {
			System.out.println("�ȳ�!!");
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
		//���ǿ� �����ϴ� ���� �ʴ� �ݵ�� �� ���� �����ϰ� �ϰ�ʹٸ�...  do while ������ �����.
		i = 0;
		do {
			System.out.println("do while~~~!!");
			i++;
		}while(i<3);
		
	}

}
