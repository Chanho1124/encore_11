package day04;

public class Goods {
	private String name;
	private int  price;
	private int countStock;
	private int countSold;
	public Goods() {
		
	}
	public Goods(String name) {
	//	this.name = name;
		this(name,0,0,0);
	}
	
	public Goods(String name, int price) {
//		this.name = name;
////		this(name);
//		this.price = price;
		
		this(name,price,0,0);
		
		
	}
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
//		this(name,price);
		this.countStock = countStock;
		this.countSold = countSold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.getName();
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void print() {
		System.out.println("��ǰ�̸� : "+ name);
		System.out.println("��ǰ����: "+ price);
		System.out.println("��ǰ��� : "+ countStock);
		System.out.println("�Ǹŷ� : "+ countSold);
	}

}
