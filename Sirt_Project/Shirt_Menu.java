package Sirt_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shirt_Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shirt> l1 = new ArrayList<>();
	
		Shirt s1=new Shirt("Arrow", 40, 2300, "white");
		l1.add(s1);
		l1.add(new Shirt("peter england", 42, 1800, "red"));
		l1.add(new Shirt("blackberry", 40, 2800, "white"));
		Sirt_Controller s=new Sirt_Controller();
		//Shirt_Manager sm= new Shirt_Manager();
		int n = 0;
		int ch;// Choice
		do {
			System.out.println(" Enter The Choice ");
			System.out.println(" 0. For Add The More  SHIRT  Collections  ");
			System.out.println(" 1. For Display The SHIRT");
			System.out.println(" 2 Display all shirts with given size=============");
			System.out.println(" 3 Access all shirts with  Brand Name && size=============");
		
			System.out.println(" 4 Display all shirts with  Min && Max Price=============");
			System.out.println(" 5 Display all shirts with Brand Name And Color=============");
//			System.out.println(" 5 Display all shirts with  Min && Max Price=============");
//			System.out.println(" 6 Display all shirts with  Min && Max Price=============");
//			System.out.println(" 7 Display all shirts with  Min && Max Price=============");
			System.out.println(" 8. For Exit !!!  ");
			
			
			ch = sc.nextInt();

			switch (ch) {
			case 0: {
                      s.addSirtDetails(l1);
				break;
			}

			case 1: {
                       s.getAllShirts(l1);
				break;
			}

			case 2: {
                       s.getShirtOfSize(l1);
				break;
			}
			case 3: {
                s.getShirtBrandName_And_Size(l1);
			break;
		}
			case 4: {
                s.getShirtOfBy_Starting_And_Ending_Price(l1);
			break;
		}
			case 5: {
                s.getShirtOfBy_BrandName_And_Color(l1);
			break;
		}

			default:
				break;
			}
		} while (ch != 8);

	}
}
