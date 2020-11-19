package day04;

public class 발표머신 {
	String[] students;

	public 발표머신(String[] names) {
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
		String[] names = {"이명재","윤성현","최정훈","심우용","이지현","홍은표","원세영","박찬호","강동섭","김명은","윤진희","조의상","윤형진","임원걸"};
//		System.out.println(names.length);
		발표머신 test = new 발표머신(names);
		test.mix();
		System.out.println(test.getStudent(0));
	}
}
