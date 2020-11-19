package day04;
class Parent2{
	int i = 5;
	
	public int getI() {
		return i;
	}
}

class Child2 extends Parent2{
	int i = 10;   //오버라이드 
	 
	public int getI() {
		return i;
	}
}


public class Test2 {
//상속~~   부모가 가진것을 자식이 물려받는것!!!   
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		System.out.println(p.i);
		System.out.println(p.getI());
	//	System.out.println(p.j);
		
		Child2 c = new Child2();
		System.out.println(c.i);
		System.out.println(c.getI());
		
		//1.  부모는 자식을 가리킬 수 있어요.  조상은 자손을 가리킬 수 있어요. 
		Parent2 pc = new Child2();
		
	//	Child2 cc = new Parent2();
		//2. 필드는 오버라이드 되면 타입을 따른다~~~!! 
		System.out.println(pc.i);
		
		//3. 메소드는 오버라이드 되면 무조건~~~~!!!   자식꺼 사용!! 
		System.out.println(pc.getI());
		
		
		
		
		
	}

}
