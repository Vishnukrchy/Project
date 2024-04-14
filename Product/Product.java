package Product;

public class Product {
	public String p_Category;
	public String p_name;
	public int p_id;
	public String p_color;
	public double p_price;
	public String p_Country_Of_Origine;
	public String p_Status;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String p_Category, String p_name, int p_id, String p_color, double p_price,
			String p_Country_Of_Origine, String p_Status) {
		super();
		this.p_Category = p_Category;
		this.p_name = p_name;
		this.p_id = p_id;
		this.p_color = p_color;
		this.p_price = p_price;
		this.p_Country_Of_Origine = p_Country_Of_Origine;
		this.p_Status = p_Status;
	}

	@Override
	public String toString() {
		return "Product [p_Category=" + p_Category + ", p_name=" + p_name + ", p_id=" + p_id + ", p_color=" + p_color
				+ ", p_price=" + p_price + ", p_Country_Of_Origine=" + p_Country_Of_Origine + ", p_Status="
				+ p_Status +  "]";
	}

  
	
	
}
