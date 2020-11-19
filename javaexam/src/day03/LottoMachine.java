package day03;

public class LottoMachine {
	//�Ӽ�
	LottoBall[] balls  = new LottoBall[45];
	//���
	//�ζ� ���� �ִ�. 
	public void putBalls() {
		for(int i = 0; i < balls.length; i++) {
			LottoBall ball = new LottoBall();
			ball.number = i+1;
			balls[i] = ball;
		}
	}
	//���� ����
	public void mixBalls() {
		for(int i = 0; i < 100; i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			LottoBall ball = balls[x];
			balls[x] = balls[y];
			balls[y] = ball;
		}
	}
	//�̴�. 
	public LottoBall getBall() {
		mixBalls();
		LottoBall ball=null;
		
		return ball;
	}
	
	public LottoBall[] getBalls() {
		LottoBall[] fixBalls = new LottoBall[6];
		for(int i = 0; i < 6; i++) {
			fixBalls[i] = balls[i];
		}
		return fixBalls;
	}
	public void print(LottoBall[] balls) {
		for(int i = 0; i < balls.length; i++) {
			System.out.print(balls[i].number+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();
		
		lm.putBalls();
		System.out.println("�ζǺ� ���� ��!!");
//		
		lm.print(lm.balls);
		
		lm.mixBalls();
		System.out.println("�ζ� �� ���� ��");
		lm.print(lm.balls);
		
		System.out.println("��÷��~~~");
		LottoBall[] fixBalls = lm.getBalls();
		lm.print(fixBalls);
	}
}
