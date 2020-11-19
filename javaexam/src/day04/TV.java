package day04;

public class TV {
	//소리, 채널, 전원   -> 속성 
	int 소리;
	int 채널;
	boolean 전원;
	public TV() {
		채널 = 7;
		소리 = 20;
		전원 = false;
	}
	public TV(int 소리, int 채널) {
		this.소리 = 소리;
		this.채널 = 채널;
	}
	public TV(int 소리, int 채널, boolean 전원) {
		/*
		 * this.소리 = 소리; this.채널 = 채널;
		 */
		this(소리, 채널);
		this.전원 = 전원;
		
	}
	//소리를 줄이다. 
	public void 소리Down() {
		소리--;
	}
	//소리를 키우다.  
	public void 소리Up() {
		소리++;
	}
	//채널(int 번호)  채널Up 현재채널 + 1;  채널Down 현재채널 -1 
	public void 채널(int 채널) {
		this.채널 = 채널;
	}
	public void 채널Up() {
		채널++;
	}
	public void 채널Down() {
		채널--;
	}
	//확인 - 현재 티비의 상태.  전원, 소리, 채널을 알려줌.
	public void 확인() {
		if(전원)
			System.out.println("채널:"+채널+", 소리 :"+ 소리);
		else
			System.out.println(".....");
	}
	//전원버튼을 누르다 
	public void 전원버튼을누르다() {
		if(전원)
			전원 = false;
		else 
			전원 = true;
	}

}