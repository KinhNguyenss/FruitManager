package Fruit_Manage;

import java.util.Scanner;

public class Fruit implements IFruit {
	private int id;
	private String name;
	private float price;

	public Fruit() {
		this.id = 0;
		this.name = "";
		this.price = 0;
	}

	public Fruit(int Id, String Name, float Price) {
		this.id = Id;
		this.name = Name;
		this.price = Price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		price = price;
	}

	@Override
	public String toString() {
		return "Fruit [Id=" + id + ", Name=" + name + ", Price=" + price + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input Id : ");
		this.id = Integer.valueOf(sc.nextLine());
		System.out.print("input Name : ");
		this.name = sc.nextLine();
		System.out.print("input Price : ");
		this.price = Float.valueOf(sc.nextFloat());
	}

	@Override
	public double priceForSale() {

		return 0;
	}
}