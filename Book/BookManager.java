package Book;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	public void remove2Book(List<Book> b) {
	    // TODO: Implement book removal logic
	    System.out.println("Enter the Book ID you want to remove: ");
	    int idToRemove = sc.nextInt();
	    
	    // Iterate through the list of books
	    Iterator<Book> iterator = b.iterator();
	    boolean removed = false;
	    while (iterator.hasNext()) {
	        Book book = iterator.next();
	        if (book.getId() == idToRemove) {
	            iterator.remove(); // Remove the book from the list
	            removed = true;
	            System.out.println("Book removed successfully.");
	            break; // Exit the loop once the book is removed
	        }
	    }
	    
	    if (!removed) {
	        System.out.println("No book found with the specified ID.");
	    }
	}


	public void addBook(List<Book> bl) {
		System.out.println(" Enter The No Of Book ");

		int no_Of_book = sc.nextInt();
		
		Book[] b = new Book[no_Of_book];
		for (int i = 0; i < b.length; i++) {
			System.out.println(" Enter " + (i + 1) + " The No Of Book ");
			System.out.println((i + 1) + " Enter The Book ID: ");
			int id = sc.nextInt();
			System.out.println((i + 1) + " Enter The Book Name : ");
			String bookName = sc.next();
			System.out.println((i + 1) + " Enter The Book Author Name : ");
			String booKAuthorName = sc.next();
			System.out.println((i + 1) + " Enter The Book Price :");
			int bookPrice = sc.nextInt();

			bl.add(new Book(id, bookName, booKAuthorName, bookPrice, booKAuthorName));
			System.out.println(bl);

		}
	}

	public void searchBook(List<Book> b) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Boom Id");
		int id = sc.nextInt();
		boolean found = false;
		for (Book book : b) {
			if (book.getId() == id) {
				System.out.println(b);
				found = true;
				break;

			}

		}
		if (!found) {
			System.out.println(" Bekar h Bhaiya mai to tut gya");
		}

	}

//	public void removeBook(List<Book> b) {
//		// TODO Auto-generated method stub
//		System.out.println(" Enthe the Book Id U want tro remove ");
//		int id = sc.nextInt();
//		for (Book book : b) {
//			if (book.getId() == id) {
//				book.
//				
//			}
//		}
//
//	}
	public void removeBook(List<Book> b) {
	    System.out.println("Enter the Book ID you want to remove: ");
	    int idToRemove = sc.nextInt();
	    
	    boolean removed = false;
	    for (int i = 0; i < b.size(); i++) {
	        Book book = b.get(i);
	        if (book.getId() == idToRemove) {
	            b.remove(i); // Remove the book from the list
	            removed = true;
	            System.out.println("Book removed successfully.");
	            break; // Exit the loop once the book is removed
	        }
	    }
	    
	    if (!removed) {
	        System.out.println("No book found with the specified ID.");
	    }
	}


	public void serachBookByTitle(List<Book> b) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Boom Author");
		String title = sc.next();
		boolean found = false;
		for (Book book : b) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				found = true;
				System.out.println(b);
				break;
			}

		}
		if (!found) {
			System.out.println(" Bekar h Bhaiya mai to tut gya");
		}
	}
	public void serachBookByAuthor(List<Book> b) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Boom Author");
		String author = sc.next();
		boolean found = false;
		for (Book book : b) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				found = true;
				System.out.println(b);
				break;
			}

		}
		if (!found) {
			System.out.println(" Bekar h Bhaiya mai to tut gya");
		}
	}
	public void displayBook(List<Book> b) {
		// TODO Auto-generated method stub
		for (Book book : b) {
			System.out.println(book);
		}
	}
	

}
