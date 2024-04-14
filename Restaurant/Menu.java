package Restaurant;

public class Menu implements Comparable<Menu> {
	private int id;
	private String name;
	private String decrription;
	private double price;
	private String catogery;

	Menu() {

	}

	public Menu(int id, String name, String decrription, double price, String catogery) {
		super();
		this.id = id;
		this.name = name;
		this.decrription = decrription;
		this.price = price;
		this.catogery = catogery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecrription() {
		return decrription;
	}

	public void setDecrription(String decrription) {
		this.decrription = decrription;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCatogery() {
		return catogery;
	}

	public void setCatogery(String catogery) {
		this.catogery = catogery;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", decrription=" + decrription + ", price=" + price + ", catogery="
				+ catogery +  "]";
	}

	@Override
	public int compareTo(Menu m) {
		
		return (int) (this.price-m.price);
	}
	

}
