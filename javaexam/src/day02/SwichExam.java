package day02;

public class SwichExam {
public SwichExam() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		char c = 'g';
		switch (c) {
		case 'a':
			System.out.println("입력된 문자는 a 입니다.");
		//	break;
		case 'b':
			System.out.println("입력된 문자는 b 입니다.");
		//	break;
		case 'c':
			System.out.println("입력된 문자는 c 입니다.");
		//	break;
		default:
			System.out.println("모르는 문자야~");
			break;
		}
	}

}
