package Fruit_Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitList {

	private ArrayList<Fruit> fruits = new ArrayList<Fruit>();

	public FruitList() {
		this.fruits = new ArrayList<Fruit>();
	}

	public FruitList(ArrayList<Fruit_Manage.Fruit> Fruit) {
		this.fruits = Fruit;
	}

	public ArrayList<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList<Fruit> fruits) {
		this.fruits = fruits;
	}

	public void addFruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding Fruit....");
		System.out.println("===================");
		System.out.println("+ 1. Add FruitIn  +");
		System.out.println("+ 2. Add FruitOut +");
		System.out.println("===================");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			Fruit FI = new FruitIn ();
			FI.input();
			fruits.add(FI);
			break;
		case 2 : 
			Fruit FO = new FruitOut ();
			FO.input();
			fruits.add(FO);
			break;
		}

	}

	public void printfFruit() {
	System.out.println(fruits);
	}

	public void PForSale() {
		for (Fruit fruit : fruits)
		{
			if (fruit.priceForSale() >20)
			{
				System.out.println(fruit);
			}
		}
	}

	public int AllFruit() {
		return fruits.size();
	}
}
