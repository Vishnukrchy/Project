package Sirt_Project;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sirt_Controller {
	Scanner sc = new Scanner(System.in);

	public void getAllShirts(List<Shirt> x) {
		int count = 1;
		for (Shirt sirt : x) {
			System.out.println("========== Sirt " + count + " Details ============ ");
			System.out.println(sirt);
			count++;
		}
	}

	public void getShirtOfSize(List<Shirt> x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		for (Shirt p : x) {
			if (p.size == size)
				System.out.println(p);

		}
	}

	Shirt s = new Shirt();

	public void addSirtDetails(List<Shirt> shirt) {
		System.out.println();
		System.out.println("Enter The No Of Studnet ");
		int n = sc.nextInt();
		int n1 = shirt.size();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter The " + (n1 + i) + " Sirt Details");

			System.out.println("Enter Brand Name  !!");
			String name = sc.next();
			System.out.println("Enter Sirt size ");
			int size = sc.nextInt();

			System.out.println("Enter Sirt Price ");
			double peice = sc.nextDouble();
			System.out.println("Enter Sirt Color ");
			String color = sc.next();
			s = new Shirt(name, size, peice, color);

			shirt.add(s);

		}
	}

	public void getShirtOfBy_Starting_And_Ending_Price(List<Shirt> l1) {
		System.out.println("=== Enter Your Your Minimum Range Shirt Price ===== ");
		double minRange = sc.nextDouble();
		System.out.println("=== Enter Your Your Maxm Range Shirt Price ===== ");
		double maxRange = sc.nextDouble();
		boolean found = false;
//		for (int i = 0; i < l1.size(); i++) {
//				
//		}
		for (Shirt shirt : l1) {
			if (shirt.price >= minRange && shirt.price <= maxRange) {
				System.out.println(":::::::::::::::::::::::: Sirt Details IS ::::::::::::::::::::::::");
				System.out.println(shirt);
				found = true;
			}
		}
		if (!found) {
			System.out.println(" Sirt Are Not Found !!!!!! Bekar H Bhai Mai To Tut Gya  Nhi Mila ");
		}

	}

	public void getShirtBrandName_And_Size(List<Shirt> l1) {
		System.out.println("=== Enter  Barnd Name Of Shirt  ===== ");
		String barndName = sc.next();
		System.out.println("=== Enter Shirt Size ===== ");
		int size = sc.nextInt();
		boolean found = false;
		for (Shirt shirt : l1) {
			if (shirt.brand_name.equalsIgnoreCase(barndName) && shirt.size==size) {
				System.out.println(":::::::::::::::::::::::: Sirt Details IS ::::::::::::::::::::::::");
				System.out.println(shirt);
				found = true;
				
			}

		}
		if (!found) {
			System.out.println(" Sirt Are Not Found !!!!!! \n Bekar H Bhai Mai To Tut Gya  Nhi Mila ");
		}

	}

	public void getShirtOfBy_BrandName_And_Color(List<Shirt> l1) {
		System.out.println("=== Enter  Barnd Name Of Shirt  ===== ");
		String barndName = sc.next();
		System.out.println("=== Enter Shirt Color ===== ");
		String color = sc.next();
		boolean found = false;
		for (Shirt shirt : l1) {
			if (shirt.brand_name.equalsIgnoreCase(barndName) && shirt.color.equalsIgnoreCase(color)) {
				System.out.println(":::::::::::::::::::::::: Sirt Details IS ::::::::::::::::::::::::");
				System.out.println(shirt);
				found = true;
				
			}

		}
		if (!found) {
			System.out.println(" Sirt Are Not Found !!!!!! \n Bekar H Bhai Mai To Tut Gya  Nhi Mila ");
		
		
	}
}
}
