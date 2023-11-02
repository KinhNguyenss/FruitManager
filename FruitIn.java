package Fruit_Manage;

import java.util.Scanner;

public class FruitIn extends Fruit {
	private double extraIn; // phi noi bo trai cay trong nuoc

	public FruitIn() {
		this.extraIn = 0;
	}

	public FruitIn(double extraIn, int Id, String Name, float Price) {
		super(Id, Name, Price);
		this.extraIn = extraIn;
	}

	public double getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}

	@Override
	public String toString() {
		return "FruitIn [Id= " + super.getId() + ", Name=" + super.getName() + ", Price=" + super.getPrice()
				+ ", extraIn=" + extraIn + "]";
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("input extraIn : ");
		this.extraIn = sc.nextDouble();
	}

	public double priceForSale() {

		return super.getPrice() + this.extraIn;
	}

}
