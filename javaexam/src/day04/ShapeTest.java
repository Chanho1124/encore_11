package day04;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Shape(2, 5);
		s1.show();
		s1.show(false);
		s1.setX(10);
		s1.setY(23);
		
		s1.show(true);
		s1.show(false);
		
	}
}
