package Shoping_Sirt;

import java.util.List;
import java.util.Scanner;
public class Sirt_Controller {
	Scanner sc=new Scanner(System.in);
	public  void getAllShirts(List<Shirt> x)
	{
		for(Shirt p: x)
			System.out.println(p);
	}
	public  void getShirtOfSize(List<Shirt> x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		for(Shirt p:x)
		{
			if(p.size==size)
				System.out.println(p);
			
		}
	}
	
	public  void addSirtDetails(List<Shirt> shirt) {
		Shirt s= new Shirt();
		System.out.println("Enter The No Of Student ");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter The "+(i)+" Sirt Details");
			
			System.out.println("Enter Brand Name  !!");
			String name = sc.next();
			System.out.println("Enter Sirt size ");
			int size = sc.nextInt();
			
			System.out.println("Enter Sirt Price ");
			double peice = sc.nextDouble();
			System.out.println("Enter Sirt Color ");
			String color=sc.next();
			s=new Shirt(name,size , peice, color);
			
			shirt.add(s);
			

			
		}
	}
}
