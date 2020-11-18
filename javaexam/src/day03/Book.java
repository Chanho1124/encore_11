package day03;

public class Book {
	//책이 가지는 속성 
	String 지은이;
	String isbn;
	String 제목;
	int 전체페이지수;
	int 현재페이지;
	
	//책이 가지는 기능. 
	public void 책장을넘기다(int page) {
		현재페이지 = page;
	}
	
	public void 책장을넘기다() {
		현재페이지++;
	}
}
