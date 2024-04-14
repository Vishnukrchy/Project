package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BookController {
public static void main(String[] args) {
	List<Book> b=new ArrayList<Book>();
	b.add(new Book(101," phy","s.kumar", 199, "Scince"));
	b.add(new Book(102," chem","HC.Vema", 299, "Scince"));
	b.add(new Book(103," math"," KC.Shinha", 399, "Scince"));
	
	
	
	BookManager bm=new BookManager();
	Scanner sc =new Scanner(System.in);
	int input;
	
	
	do {
		System.out.println(" Enter The Choice  ");
		System.out.println(" 1 For The Add BooK In Liabray !!!"
				+ "");
		System.out.println(" 2 For The Display  Book in The ");
		System.out.println(" 3 For The Remoove Book From The  Liabary ");
		System.out.println(" 4 For The serachBookByTitle  ");
		System.out.println(" 5 For The serachBookBy Author  ");
		System.out.println(" 6 For The serachBook ID  ");
		System.out.println(" 0 For the Exit");
		input=sc.nextInt();
		
		switch (input) {
		case 2:{
			bm.displayBook(b);
			break;
		}
		case 1:{
			bm.addBook(b);
			break;
		}
		case 3:{
		bm.removeBook(b);
			break;
		}
		case 4:{
			bm.serachBookByTitle(b);
				break;
			}
		case 5:{		
			bm.serachBookByAuthor(b);
			break;
		}
		case 6:{		
			bm.searchBook(b);
			break;
		}
		
			

		default:
			break;
		}
		
	} while (input!=0);
}
}
