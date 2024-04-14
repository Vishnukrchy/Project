package Restaurant;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Menu_Controller {
	
	static Scanner sc = new Scanner(System.in);

	public void addNew_Menu(List<Menu> ml) {
		// TODO Auto-generated method stub
		int add = 1;
		while (add == 1) {
			System.out.println(" Enter the Item Id ");
			int id = sc.nextInt();
			System.out.println(" Enter the Item Name ");
			String name = sc.next();
			System.out.println(" Enter the Item decrription ");
			String desc = sc.next();
			System.out.println(" Enter the Item price ");
			double price = sc.nextDouble();
			System.out.println(" Enter the Item catogery ");
			String catogery = sc.next();

			ml.add(new Menu(id, name, desc, price, catogery));
			System.out.println(ml);
			
			System.out.println("\n=====  For Add More item press 1 else any chartec");
			add=sc.nextInt();
		}
	}

	public void display_All_Menu(List<Menu> ml) {
		// TODO Auto-generated method stub
		for (Menu menu : ml) {
			System.out.println(menu);
		}

	}

	public void removeItem_Menu(List<Menu> ml) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Id Or Name Of Item");
		int id = sc.nextInt();
		String name = sc.next();
		boolean remove = false;

		for (int i = 0; i < ml.size(); i++) {
			Menu m = ml.get(i);
			if (id == m.getId() || name.equalsIgnoreCase(m.getName())) {
				ml.remove(i);
				remove = true;
				break;
			}

		}
		if (!remove) {
			System.out.println(" Bekar h baiya Mai To tu gya");
		} else {
			System.out.println(" Item Removed Successfully ");
		}
	}

	public static void removedByCatogery(List<Menu> ml) {
		System.out.println("Enter The Id Or Name Of Item");
		String cname = sc.next();
		boolean remove = false;

		ListIterator<Menu> ltr = ml.listIterator();

		while (ltr.hasNext()) {
			Menu menu = ltr.next();
			if (cname.equalsIgnoreCase(menu.getCatogery())) {
				ltr.remove();
				remove = true;
				break;
			}
		}
		if (!remove) {
			System.out.println(" Bekar h baiya Mai To tu gya");
		} else {
			System.out.println(" Item Removed Successfully ");
		}
	}

	public void updateItem_Menu(List<Menu> ml) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Id Of Item  That u Want Update ");
		int id = sc.nextInt();
		boolean upt = false;
//		for (Menu menu : ml) {
//			if (id==menu.getId()) {
//				System.out.println(" Enter the Item Id ");
//				int id1 = sc.nextInt();
//				System.out.println(" Enter the Item Name ");
//				String name = sc.next();
//				System.out.println(" Enter the Item decrription ");
//				String desc = sc.next();
//				System.out.println(" Enter the Item price ");
//				double price = sc.nextDouble();
//				System.out.println(" Enter the Item catogery ");
//				String catogery = sc.next();
//			}
//		}
		ListIterator<Menu> ltr = ml.listIterator();
		while (sc.hasNext()) {
		Menu m = ltr.next();
			if (id == m.getId()) {
				System.out.println(" Enter the Item Id ");
				int id1 = sc.nextInt();
				System.out.println(" Enter the Item Name ");
				String name = sc.next();
				System.out.println(" Enter the Item decrription ");
				String desc = sc.next();
				System.out.println(" Enter the Item price ");
				double price = sc.nextDouble();
				System.out.println(" Enter the Item catogery ");
				String catogery = sc.next();

				ltr.set(new Menu(id1, name, desc, price, catogery));
				upt = true;
			}

		}
		if (upt) {
			System.out.println(" Item Get Updated");
		} else {
			System.out.println(" Bekar H bhaiya Main to tut gya");
		}

	}

	public void displayitemBy_catogery(List<Menu> ml) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Item Catogery !!!");
		String cname = sc.next();
		boolean found = false;

		for (int i = 0; i < ml.size(); i++) {
			Menu menu = ml.get(i);
			if (cname.equalsIgnoreCase(menu.getCatogery())) {
				System.out.println(menu);
				found = true;
			}
		}
		if (!found) {
			System.err.println("Bekar h bhaiya mai to tut gaya !! Not Available ");
		}

	}

}




































































//public void updateItem_Menu(List<Menu> ml) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the ID of the menu item you want to update: ");
//    int idToUpdate = sc.nextInt();
//
//    boolean found = false;
//    for (Menu menu : ml) {
//        if (menu.getId() == idToUpdate) {
//            System.out.println("Enter the new name: ");
//            String newName = sc.next();
//            System.out.println("Enter the new type: ");
//            String newType = sc.next();
//            System.out.println("Enter the new price: ");
//            double newPrice = sc.nextDouble();
//            System.out.println("Enter the new category: ");
//            String newCategory = sc.next();

//            menu.setName(newName);
//            menu.setType(newType);
//            menu.setPrice(newPrice);
//            menu.setCategory(newCategory);
//
//            found = true;
//            System.out.println("Menu item updated successfully.");
//            break; 
//        }
//    }
//
//    if (!found) {
//        System.out.println("No menu item found with the specified ID.");
//    }
//}
