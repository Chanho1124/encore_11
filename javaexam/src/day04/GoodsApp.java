package day04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		camera.print();
		
		Goods phone = new Goods("¾ÆÀÌÆù");
		
		Goods camera2 = new Goods("samsung",200000,20,40);
		camera2.print();
	//	Goods camera3 = new Goods("samsung",200000,20);
		
	}

}
