package day04;

public class TV {
	//�Ҹ�, ä��, ����   -> �Ӽ� 
	int �Ҹ�;
	int ä��;
	boolean ����;
	public TV() {
		ä�� = 7;
		�Ҹ� = 20;
		���� = false;
	}
	public TV(int �Ҹ�, int ä��) {
		this.�Ҹ� = �Ҹ�;
		this.ä�� = ä��;
	}
	public TV(int �Ҹ�, int ä��, boolean ����) {
		/*
		 * this.�Ҹ� = �Ҹ�; this.ä�� = ä��;
		 */
		this(�Ҹ�, ä��);
		this.���� = ����;
		
	}
	//�Ҹ��� ���̴�. 
	public void �Ҹ�Down() {
		�Ҹ�--;
	}
	//�Ҹ��� Ű���.  
	public void �Ҹ�Up() {
		�Ҹ�++;
	}
	//ä��(int ��ȣ)  ä��Up ����ä�� + 1;  ä��Down ����ä�� -1 
	public void ä��(int ä��) {
		this.ä�� = ä��;
	}
	public void ä��Up() {
		ä��++;
	}
	public void ä��Down() {
		ä��--;
	}
	//Ȯ�� - ���� Ƽ���� ����.  ����, �Ҹ�, ä���� �˷���.
	public void Ȯ��() {
		if(����)
			System.out.println("ä��:"+ä��+", �Ҹ� :"+ �Ҹ�);
		else
			System.out.println(".....");
	}
	//������ư�� ������ 
	public void ������ư��������() {
		if(����)
			���� = false;
		else 
			���� = true;
	}

}