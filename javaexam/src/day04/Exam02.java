package day04;


class Child  extends Parent {
	
}


public class Exam02 {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);
		Child child = new Child();
		System.out.println(child.i);
	}

}
