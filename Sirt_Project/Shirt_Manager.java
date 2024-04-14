package Sirt_Project;

import java.util.List;
import java.util.Scanner;

public class Shirt_Manager {
	Shirt_Manager() {

	}

	public static void getAllShirts(List<Shirt> x) {
		
		for (Shirt p : x) {
			System.out.println(p);
		}
	} 

	public static void getShirtOfSize(List<Shirt> x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		for (Shirt p : x) {
			if (p.size == size)
				System.out.println(p);

		}
	}
}
