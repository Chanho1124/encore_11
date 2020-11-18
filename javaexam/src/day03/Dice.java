package day03;

public class Dice {
	int eye;
	public void cast() {
		eye = (int)(Math.random()*6+1);
	}
}
