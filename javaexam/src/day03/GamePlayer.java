package day03;

public class GamePlayer {
	public static int diceGame(int eye, int count) {
		int totalCount=0;
		Dice dice = new Dice();
		for(int i = 0; i < count; i++) {
			dice.cast();
			if(eye == dice.eye)
				totalCount++;				
		}
		
		return totalCount;
	}

	public static void main(String[] args) {
//		Dice dice = new Dice();
//		dice.cast();
//		System.out.println(dice.eye);
		
		int eye = 2;
		int count = 200;
		
		System.out.printf("�ֻ����� %d ȸ ������ ���� %d �� ���� Ƚ���� %d �Դϴ�.",count,eye,GamePlayer.diceGame(3, 100));
	}

}
