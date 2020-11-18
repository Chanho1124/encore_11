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
		
		System.out.printf("주사위를 %d 회 굴려서 눈이 %d 가 나온 횟수는 %d 입니다.",count,eye,GamePlayer.diceGame(3, 100));
	}

}
