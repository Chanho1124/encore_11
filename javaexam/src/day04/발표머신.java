package day04;

public class ��ǥ�ӽ� {
	String[] students;

	public ��ǥ�ӽ�(String[] names) {
		students = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			students[i] = names[i];
		}
	}

	public void mix() {
		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * students.length);
			int y = (int) (Math.random() * students.length);
			String student = students[x];
			students[x] = students[y];
			students[y] = student;
		}
	}
	
	public String getStudent(int index) {
		return students[index];
	}
	
	public static void main(String[] args) {
		String[] names = {"�̸���","������","������","�ɿ��","������","ȫ��ǥ","������","����ȣ","������","�����","������","���ǻ�","������","�ӿ���"};
//		System.out.println(names.length);
		��ǥ�ӽ� test = new ��ǥ�ӽ�(names);
		test.mix();
		System.out.println(test.getStudent(0));
	}
}
