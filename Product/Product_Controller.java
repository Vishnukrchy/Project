package Product;

import java.util.Scanner;

public class Product_Controller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[6];
		p[1] = new Product(" Mobile", " Vivo", 101, "\nGold ", 79999, "Chaina", "\nMay-2024");
		p[0] = new Product(" Mobile", " MI", 102, "\nWhite ", 29999, "India", "\nMar-2024");
		p[2] = new Product(" Book", " Chem Book", 103, "\nGold", 99, "India", "\ndeliverd");
		p[3] = new Product(" Book", " Math Book", 104, "\nGold ", 599, "USA", "\nOn The Way");
		p[4] = new Product(" Food ", "Rash Malai (Anandi)", 1, "\n NA", 135, "\nGar Par hi Ban H", "Kuch Banki h ");
		p[5] = new Product(" Food", "Rashgula ", 12, "\nwhite", 240, "\nHamne Bnaya  h",
				"Bekar h Bhai main  To Tut gya sab khala  liya hh !!!");
		Product_Manager pm = new Product_Manager();
		int choice;
		do {
			System.err.println(" ====================Enter the Choice===================== ");
			System.out.println(" 0 For  Add More  Product details by user   !!!");
			System.out.println(" 1 For  Dispay Product  the details !!! ");
			System.out.println(" 2 For  Dispay Product  the details on the basis of Id !!! ");
			System.out.println(" 3 For  Display Product  Details By by Product Max price   !!!");
			System.out.println(" 4 For  Display Product  Details By by Product Min price   !!!");
			System.out.println(" 5 For  Dispay Product  the details on the basis of Product  Categoery    !!!");
			System.out.println(" 6 For  Display Product  Details By by Product  Origin(Manufacturing )  !!!");
			System.out.println(" 7 Fo2r  Display Product  Details By by Product  name  !!!");
			System.out.println(" 8 Fo2r  exit  !!!");

			
			choice = sc.nextInt();
			switch (choice) {
			case 0:{
				pm.addProductdetailsByUser(p);
				break;
			}
			case 1: {
				pm.displayAllProductDetails(p);
				break;
			}

			case 2: {
				pm.displayAll_Product_By_Id(p);
				break;
			}
			case 3: {
				pm.displayAll_Product_MaxPrice(p);
				break;
			}
			case 4: {
				pm.displayAll_Product_MinPrice(p);
				break;
			}
			case 5: {
				pm.displayAll_Product_ProducrtCatogery(p);
				break;
			}
			case 6: {
				pm.displayAll_Product_Origine(p);
				break;
			}
			case 7: {
				pm.displayAll_Product_ProducrtName(p);
			}		
//			case 8: {
//				pm.addProductdetailsByUser(p);
//				break;
//			}



			default: {
                   System.err.println(" Thanks Phir ana ");
			}

			}

		} while (choice != 8);
	}
}
