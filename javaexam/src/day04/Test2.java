package day04;
class Parent2{
	int i = 5;
	
	public int getI() {
		return i;
	}
}

class Child2 extends Parent2{
	int i = 10;   //�������̵� 
	 
	public int getI() {
		return i;
	}
}


public class Test2 {
//���~~   �θ� �������� �ڽ��� �����޴°�!!!   
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		System.out.println(p.i);
		System.out.println(p.getI());
	//	System.out.println(p.j);
		
		Child2 c = new Child2();
		System.out.println(c.i);
		System.out.println(c.getI());
		
		//1.  �θ�� �ڽ��� ����ų �� �־��.  ������ �ڼ��� ����ų �� �־��. 
		Parent2 pc = new Child2();
		
	//	Child2 cc = new Parent2();
		//2. �ʵ�� �������̵� �Ǹ� Ÿ���� ������~~~!! 
		System.out.println(pc.i);
		
		//3. �޼ҵ�� �������̵� �Ǹ� ������~~~~!!!   �ڽĲ� ���!! 
		System.out.println(pc.getI());
		
		
		
		
		
	}

}
