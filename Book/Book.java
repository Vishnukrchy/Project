package Book;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	private String gener;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String author, double price, String gener) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.gener = gener;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", gener=" + gener
				+   "]";
	}
	
}
