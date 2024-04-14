package Shoping_Sirt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Shirt_Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shirt> l1 = new ArrayList<>();
		Sirt_Controller s=new Sirt_Controller();
		int n = 0;
		int ch;// Choice
		do {
			System.out.println(" Enter The Choice ");
			System.out.println(" 1. For Add The SHIRT  Collections  ");
			System.out.println(" 2. For Display The SHIRT");
			System.out.println(" 3 For  Display shirts with given size");
			System.out.println(" 0. For Exit !!!  ");
			
			
			ch = sc.nextInt();

			switch (ch) {
			case 1: {
                      s.addSirtDetails(l1);
				break;
			}

			case 2: {
                       s.getAllShirts(l1);
				break;
			}

			case 3: {
                       s.getShirtOfSize(l1);
				break;
			}

			default:
				break;
			}
		} while (ch != 0);

	}
}
