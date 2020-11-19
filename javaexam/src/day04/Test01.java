package day04;
class Parent1{
	int i = 5;
	
	public int getI() {
		return i;
	}
}

class Child1 extends Parent1{
	int j = 10;
	public int getJ() {
		return j;
	}
}


public class Test01 {
//»ó¼Ó~~  
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		System.out.println(p.i);
		System.out.println(p.getI());
	//	System.out.println(p.j);
		
		Child1 c = new Child1();
		System.out.println(c.i);
		System.out.println(c.getI());
		
	}

}
