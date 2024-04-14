package Sirt_Project;

public class Shirt {
	String brand_name;
	int size;
	double price;
	String color;
	Shirt()
	{
		
	}
	Shirt(String brand_name, int size, double price, String color)
	{
		this.brand_name=brand_name;
		this.size=size;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Brand Name: "+brand_name+" Size: "+size+" Price: "+price+" Color: "+color;
	}
}
