package day04;

public class LottoMachine {
	//속성
	LottoBall[] balls  = null;
	
	//생성자
	public LottoMachine() {
		balls = new LottoBall[45];
		putBalls();
	}
	public LottoMachine(int count) {
		balls = new LottoBall[count];
		putBalls();
	}
	
	//기능
	//로또 볼을 넣다. 
	public void putBalls() {
		for(int i = 0; i < balls.length; i++) {
			LottoBall ball = new LottoBall();
			ball.number = i+1;
			balls[i] = ball;
		}
	}
	//볼을 섞다
	public void mixBalls() {
		for(int i = 0; i < 100; i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			LottoBall ball = balls[x];
			balls[x] = balls[y];
			balls[y] = ball;
		}
	}
	//뽑다. 
	public LottoBall getBall() {
		mixBalls();
		LottoBall ball=null;
		
		return ball;
	}
	public LottoBall getBall(int index) {
		return balls[index];
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
		System.out.println("로또볼 섞기 전!!");
//		
		lm.print(lm.balls);
		
		lm.mixBalls();
		System.out.println("로또 볼 섞은 후");
		lm.print(lm.balls);
		
		System.out.println("당첨볼~~~");
		LottoBall[] fixBalls = lm.getBalls();
		lm.print(fixBalls);
	}
}
