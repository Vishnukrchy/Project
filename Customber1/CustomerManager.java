package Customber1;

import java.util.Scanner;

public class CustomerManager {
	Scanner sc = new Scanner(System.in);

	public void addCustomerDetails(Customer c[]) {
		int n = c.length;
		System.out.println("========Enter The No OF Cutomer U Want To ADd");
		int n1 = sc.nextInt();
		c = new Customer[n + n1];
		for (int i = n; i < c.length; i++) {
			System.out.println("Enter Customer " + (i + 1) + " Details:");
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Location: ");
			String location = sc.next();
			System.out.println("Enter Mobile No: ");
			long mobileNo = sc.nextLong();
			System.out.println("Enter Purchased Item: ");
			String purchaseItem = sc.next();
			System.out.println("Enter Purchase Amount: ");
			double purchaseAmount = sc.nextDouble();

			c[i] = new Customer(name, location, mobileNo, purchaseItem, purchaseAmount);
			System.out.println((i + 1) + " Customer Details Added Successfully.");
		}
		System.out.println(" Now  APN LOG KE PASS " + c.length + " COM HH");
	}

	public void getAllCustomerRecord(Customer[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println("********  CUSTOMER " + (1 + i) + " DETAILS ***************");
			System.out.println(c[i]);
		}
	}

	public void getAllCustomerRecordByAnyDetails(Customer[] c) {
		System.out.println("Enter the Details to Search Customer:");
		String details = sc.next();
		for (int i = 0; i < c.length; i++) {
			if (c[i].name.equalsIgnoreCase(details) || c[i].location.equalsIgnoreCase(details)
					|| String.valueOf(c[i].mobileNo).equalsIgnoreCase(details)
					|| c[i].purchaseItem.equalsIgnoreCase(details)
					|| String.valueOf(c[i].purchaseAmount).equalsIgnoreCase(details)) {
				System.out.println("Customer Found:");
				System.out.println(c[i]);
				return;
			}
		}
		System.out.println("Customer with given details not found.");
	}

	public void getCustomerRecordByLoc(Customer[] c) {
		System.out.println("Enter the Location to Find Customer Records:");
		String loc = sc.next();
		boolean found = false;
		for (int i = 0; i < c.length; i++) {
			if (c[i].location.equalsIgnoreCase(loc)) {
				System.out.println(loc + " Location Customers:");
				System.out.println(c[i]);
				found = true;

			}
		}
		if (found) {
			System.out.println(loc + " Location Customer  Found!  ");
		} else {
			System.out.println(loc + " Location Customer Not Found!");
		}
	}

	public void getCustomerRecordHighestPrice(Customer[] c) {
		double maxPrice = c[0].purchaseAmount;
	Customer countb = null;
		for (int i = 1; i < c.length; i++) {
			if (c[i].purchaseAmount > maxPrice) {
				maxPrice = c[i].purchaseAmount;
			countb = c[i];
			}
		}
		System.out.println("======Customer with Highest Purchase Amount: ==== " + maxPrice);
		System.out.println(countb);
	}

	public void getCustomerRecordMinPrice(Customer[] c) {
		// TODO Auto-generated method stub
		double minPrice = c[0].purchaseAmount;
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i].purchaseAmount < minPrice) {
				minPrice = c[i].purchaseAmount;
				count++;
			}
		}
		System.out.println("======Customer with Lowest Purchase Amount: ==== " + minPrice);
		System.out.println(c[count]);
	}

//	public void deleteCustomerRecordByDetails(Customer[] c) {
//		System.out.println("Enter the Details of Customer to Delete:");
//		String details = sc.next();
//		boolean found = false;
//		for (int i = 0; i < c.length; i++) {
//			if (c[i] != null && (c[i].name.equalsIgnoreCase(details) || c[i].location.equalsIgnoreCase(details)
//					|| String.valueOf(c[i].mobileNo).equalsIgnoreCase(details)
//					|| c[i].purchaseItem.equalsIgnoreCase(details)
//					|| String.valueOf(c[i].purchaseAmount).equalsIgnoreCase(details))) {
//				c[i] = null; // Remove the customer record
//				found = true;
//				break;
//			}
//		}
//		if (found) {
//			System.out.println("Customer Record Deleted Successfully.");
//		} else {
//			System.out.println("Customer with given details not found.");
//		}
//	}
	public void deleteCustomerRecordByName(Customer[] c) {
		System.out.println("Enter the Name of Customer to Delete:");
		String nameToDelete = sc.next();
		boolean found = false;
		int indexToDelete = -1;

		// Find the index of the customer record to delete
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].name.equalsIgnoreCase(nameToDelete)) {
				found = true;
				indexToDelete = i;
				break;
			}
		}

		if (found) {
			// Shift the elements in the array to remove the record for the specified
			// customer
			for (int i = indexToDelete; i < c.length - 1; i++) {
				c[i] = c[i + 1];
			}
			// Set the last element to null to avoid duplicate records
			c[c.length - 1] = null;
			System.out.println("Customer Record for " + nameToDelete + " Deleted Successfully.");
		} else {
			System.out.println("Customer with name " + nameToDelete + " not found.");
		}
	}

}
