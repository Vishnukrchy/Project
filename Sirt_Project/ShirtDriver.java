package Sirt_Project;

import java.util.ArrayList;
import java.util.List;

public class ShirtDriver {
	public static void main(String[] args) {
		List<Shirt> l1=new ArrayList<>();
		Shirt s1=new Shirt("Arrow", 40, 2300, "white");
		l1.add(s1);
		l1.add(new Shirt("peter england", 42, 1800, "red"));
		l1.add(new Shirt("blackberry", 40, 2800, "white"));
		System.out.println("Access all shirts=============");
		Shirt_Manager.getAllShirts(l1);
		System.out.println("Access all shirts with given size=============");
		Shirt_Manager.getShirtOfSize(l1);
	}
}
