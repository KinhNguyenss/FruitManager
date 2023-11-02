package Fruit_Manage;

import java.util.Scanner;

public class FruitOut extends Fruit {
	private String orgin; // xuat xu
	private double extraOut; // phi nhap khau

	public FruitOut() {
		this.orgin = "";
		this.extraOut = 0;
	}

	public FruitOut(int Id, String Name, float Price, String Orgin, double ExtraOut) {
		super(Id, Name, Price);
		this.orgin = Orgin;
		this.extraOut = ExtraOut;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		orgin = orgin;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		extraOut = extraOut;
	}

	public String toString() {
		return "FruitOut [Id= " + super.getId() + ", Name=" + super.getName() + ", Orgin=" + orgin + ", ExtraOut="
				+ extraOut + "]";
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("input Orgin : ");
		this.orgin = sc.nextLine();
		System.out.print("input extraOut : ");
		this.extraOut = Double.valueOf(sc.nextLine());
	}

	public double priceForSale() {
		return super.getPrice() + this.extraOut + (0.1 * this.extraOut);
	}

}
