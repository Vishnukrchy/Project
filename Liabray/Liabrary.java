package Liabray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Liabrary {
	 List<Book> book=new ArrayList<Book>();
                
	Book b = new Book();
      
//	public Liabrary() {
//		// TODO Auto-generated constructor stub
//		this.book = new ArrayList<>();
//	}

	public void addBook(Book b) {
		book.add(b);

	}

	public boolean remooveBook(int id) {
		Iterator<Book> iterator = book.iterator();
		while (iterator.hasNext()) {
			Book b = iterator.next();
			if (b.getId() == id) {
				iterator.remove();
				return true;

			}
		}
		return false;
	}

	public void displayBooks() {
		for (Book book : book)// Book==Object {
			System.out.println(book);

	}
	//System.out.println(b.toString();
}
