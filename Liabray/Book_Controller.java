package Liabray;

import java.util.Scanner;

public class Book_Controller {
	public static void main(String[] args) {
		Liabrary lbry=new Liabrary();
	
		Scanner sc =new Scanner(System.in);
		int input;
		int no_Of_book = 0;
		
		do {
			System.out.println(" Enter The Choice  ");
			System.out.println(" 1 For The Add BooK In Liabray !!!"
					+ "");
			System.out.println(" 2 For The Display  Book in The Liary");
			System.out.println(" 3 For The Remoove Book From The  Liabary ");
			System.out.println(" 0 For the Exit");
			input=sc.nextInt();
			
			switch (input) {
			case 1:{
				System.out.println(" Enter The No Of Book ");
				no_Of_book=sc.nextInt();
				Book [] b=new Book[no_Of_book];
				for (int i = 0; i < b.length; i++) {
					System.out.println(" Enter "+(i+1)+" The No Of Book ");
					System.out.println((i+1)+" Enter The Book ID: ");
					int id =sc.nextInt();
					System.out.println((i+1)+" Enter The Book Name : ");
					String bookName =sc.next();
					System.out.println((i+1)+" Enter The Book Author Name : ");
					String booKAuthorName =sc.next();
					System.out.println((i+1)+" Enter The Book Price :");
					int bookPrice=sc.nextInt();
					// Initialize the Book details by creating Book class Constructor
					b[i]=new Book(id, bookName, booKAuthorName, bookPrice);
					lbry.addBook(b[i]);
					
				}
				break;
			}
			case 2:{
//				for (int i = 1; i <no_Of_book; i++) {
//					System.out.println(i+"Books dettails  in the library: ");
//					lbry.displayBooks();
//				}
				lbry.displayBooks();
				
				break;
			}
			case 3:{
//				for (int i = 1; i < no_Of_book; i++) {
//					
//				}
				System.out.println(" Enthe the Book Id U want tro remoove ");
				int id =sc.nextInt();
				boolean result=lbry.remooveBook(id);
				if (result) {
					System.out.println(id+"  book is Removed Suceesfully");
				} else {
                         System.out.println(" Book Is Not Found !!!");
				}
				break;
			}
			
				

			default:
				break;
			}
			
		} while (input!=0);
	}
}
