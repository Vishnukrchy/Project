package Customber1;

import java.util.Scanner;

public class CustomerController {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[4]; // Assuming 3 customers initially

        // Sample initialization
        customers[0] = new Customer("vishnu", "Noida", 629434, "Shirt", 999);
        customers[1] = new Customer("puja", "delhi", 62994, "Nothing", 900);
        customers[2] = new Customer("Krishna", "DWARKA", 6234994, "Dont Know", 99);
        customers[3] = new Customer("VISHNU -2", "MADUBANI", 623867994, "MOBILE", 29999);

        CustomerManager cm = new CustomerManager();
        int choice;
        do {
            System.out.println("\nEnter Choice:");
            System.out.println("1. Add New  Customer");
            System.out.println("2. Display All Customer Records");
            System.out.println("3. Display Customer Records By Location");
            System.out.println("4. Display Customer with Highest Purchase Amount");
            System.out.println("5. Display Customer with Lowest Purchase Amount");
          
            System.out.println("6. Delete Customer Record by Details");
            System.out.println("7. Search Customer by Any Details");
            System.out.println("8. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cm.addCustomerDetails(customers);
                    break;
                case 2:
                    cm.getAllCustomerRecord(customers);
                    break;
                case 3:
                    cm.getCustomerRecordByLoc(customers);
                    break;
                case 4:
                    cm.getCustomerRecordHighestPrice(customers);
                    break;
                case 5:
                    cm.getCustomerRecordMinPrice(customers);
                    break;
                case 7:
                    cm.getAllCustomerRecordByAnyDetails(customers);
                    break;
                case 6:
                    //cm.deleteCustomerRecordByDetails(customers);
                      cm.deleteCustomerRecordByName(customers);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 7);
    }
}
