package Liabray;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	Book(int id ,String title,String author,double price ){
		this.bookId=id;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}

	public int getId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAouther() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book Id Is  ="+bookId+" Title "+title+" Aouther "+author+" price "+price;
	}
}
