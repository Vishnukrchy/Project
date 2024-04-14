package Product;

import java.util.Scanner;

public class Product_Manager {
	Scanner sc = new Scanner(System.in);

	public void displayAllProductDetails(Product[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println("********  PRODUCT " + (1 + i) + " DETAILS ***************");
			System.out.println(p[i]);
		}

	}

	public void displayAll_Product_By_Id(Product[] p) {
		System.out.println("========= Enter The Product ID ===============");
		boolean found = false;
		int id = sc.nextInt();
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_id == id) {
				System.out.println(p[i]);
				found=true;
			}
		}
		if (found) {
			System.out.println("  Product Found !!! Mila gya hh ");
		} else {
			System.out.println(" Bekar h bhai Mai to Tuk gya nhi mila kuch");
		}

	}

	public void displayAll_Product_MaxPrice(Product[] p) {
		double maxPrice = p[0].p_price;
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_price > maxPrice) {
				maxPrice = p[i].p_price;
				count++;
				
			}
		}
		System.out.println("============== Max Price is ======   "+maxPrice);
		System.out.println(p[count]);
		System.out.println("PAisa Hi Paisa  Hoga !!!");
	}

	public void displayAll_Product_MinPrice(Product[] p) {
		double minPrice = p[0].p_price;
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_price < minPrice) {
				minPrice = p[i].p_price;
				count++;
				
			}
		}
		System.out.println("============== Min Price is ======   "+minPrice);
		System.out.println(p[count]);
		System.out.println(" ==== Paisa Nhi h    ====!!!");
	}

	public void displayAll_Product_ProducrtCatogery(Product[] p) {
		System.out.println("========= Enter The Product Catogery  ===============");
		boolean found = false;
		String name = sc.next();
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_Category.equalsIgnoreCase(name)) {
				System.out.println(p[i]);
				found=true;
			}
		}
		if (found) {
			System.out.println("  Product Found !!! Mila gya hh ");
		} else {
			System.out.println(" NoT Found \n Bekar h bhai Mai to Tuk gya nhi mila kuch");
		}
	}

	public void displayAll_Product_ProducrtName(Product[] p) {
		System.out.println("========= Enter The Product NAme ===============");
		boolean found = false;
		String name = sc.next();
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_name.equalsIgnoreCase(name)) {
				System.out.println(p[i]);
				found=true;
			}
		}
		if (found) {
			System.out.println("  Product Found !!! Mila gya hh ");
		} else {
			System.out.println(" Bekar h bhai Mai to Tuk gya nhi mila kuch");
		}

	}

	public void displayAll_Product_Origine(Product[] p) {
		System.out.println("========= Enter The Product Manufacturing place ===============");
		boolean found = false;
		String name = sc.nextLine();
		for (int i = 0; i < p.length; i++) {
			if (p[i].p_Country_Of_Origine.equalsIgnoreCase(name)) {
				System.out.println(p[i]);
				found=true;
			}
		}
		if (found) {
			System.out.println("  Product Found !!! Mila gya hh ");
		} else {
			System.out.println(" Bekar h bhai Mai to Tuk gya nhi mila kuch");
		}

	}

	public void addProductdetailsByUser(Product[] p) {
        int n=p.length-1;
       
        System.out.println("===== Enter The No Product That U WanT aDd In the List============");
        int n1=sc.nextInt();
        p=new Product[n+n1];
        for (int i = n; i < p.length; i++) {
        	System.out.println("Enter the  " + (n + 1)+" Producdetailst");
        	System.out.println(" Enter the Product Catogery ");
			String p_Category = sc.next();
			System.out.println(" Enter the Product name ");
			String p_name = sc.next();
			System.out.println(" Enter the Product p_id ");
			int p_id = sc.nextInt();
			System.out.println(" Enter the Product p_color ");
			String p_color = sc.next();
			System.out.println(" Enter the Product p_price ");
			int p_price = sc.nextInt();
			System.out.println(" Enter the Product p_Country_Of_Origine ");
			String p_Country_Of_Origine = sc.next();
			System.out.println(" Enter the Product p_Status ");
			String p_Status = sc.next();
			
			p[i]=new Product(p_Category, p_name, p_id, p_color, p_price, p_Country_Of_Origine, p_Status);
			
		}
        System.err.println(" Ab "+p.length+" Saman Hogya h apn logo ke pass");
	}

}
