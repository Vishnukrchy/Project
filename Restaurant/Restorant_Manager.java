package Restaurant;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Restorant_Manager {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	int input;
	Menu_Controller mc= new Menu_Controller();
	
	List<Menu> ml= new LinkedList<Menu>();
	ml.add(new Menu(101, "Paneer Samosa", "veg",35 , "apetiser"));
	ml.add(new Menu(102, "Manchurian", "veg",110 , "Starter"));
	ml.add(new Menu(103, "Jear Rice", "veg",100 , "Main Cource"));
	ml.add(new Menu(104, "Ras Malai", "veg",90 , "desert"));
	ml.add(new Menu(105, "Sprite", "liqued",45 , "ColdDrink"));
	
	do {
		System.out.println(" Enter The Choice  ");
		System.out.println(" 1 For The Add New Menu Itme in List !!!");
		System.out.println(" 2 For The Display  All ");
		System.out.println(" 3 For The Remoove itme from menu ");
		System.out.println(" 4 For The Update itme from menu ");
		System.out.println(" 5 For The Display By Catogery  ");
		System.out.println(" 6 For The Display By Min-Max Price item  ");
		System.out.println(" 7 For Sort By item name  ");
		System.out.println(" 0 For the Exit");
		input=sc.nextInt();
		switch (input) {
		case 1:{
			mc.addNew_Menu(ml);
			break;
		}
		case 2:{
			mc.display_All_Menu(ml);
			break;
		}
		case 3:{
			mc.removeItem_Menu(ml);
			break;
		}
		case 4:{
			mc.updateItem_Menu(ml);
			break;
		}
		case 5:{
			mc.displayitemBy_catogery(ml);
			break;
		}
		case 6:{
			Collections.sort(ml);
			for (Menu menu : ml) {
				System.out.println(menu);
			}
			break;
		}
		case 7:{
			Collections.sort(ml,new Name());
			break;
		}
		case 8:{
			mc.removedByCatogery(ml);
			break;
		}
			
			

		default:
			break;
		}
		
	} while (input!=0);
}
}
