package Fruit_Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class Running {
public static void main(String[] args) {
	FruitList List = new FruitList();
	Fruit F = new Fruit();
	Fruit FI = new FruitIn();
	Fruit FO = new FruitOut();
	Scanner sc = new Scanner(System.in);
	System.out.println("=====input 1 is start : ======");
	int choose1 = sc.nextInt();
	do {
		System.out.println("===================================");
		System.out.println("+       1. Add fruit              +");
		System.out.println("+       2. Printf                 +");
		System.out.println("+    3. FruitPriceForsale >20     +");
		System.out.println("+       4. ALL Fruit              +");
		System.out.println("+       5. Exit                   +");
		System.out.println("====================================");
		int choose = sc.nextInt(); 
		switch (choose) {
	case 1:
		List.addFruit();
		break;
	case 2 :
		List.printfFruit();
		break;
	case 3:
		List.PForSale();
		break;
	case 5 : 
		choose1 = 10;
		break;
	case 4 :
		System.out.println("All Fruit List :  " + List.AllFruit());
		break;
		}
	} while (choose1 < 9);
}
}
