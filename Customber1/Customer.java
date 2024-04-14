package Customber1;

public class Customer {
	public String name;
	public String location;
	public long mobileNo;
	public String purchaseItem;
	public double purchaseAmount;

	public Customer() {
		// Default constructor
	}

	public Customer(String name, String location, long mobileNo, String purchaseItem, double purchaseAmount) {
		this.name = name;
		this.location = location;
		this.mobileNo = mobileNo;
		this.purchaseItem = purchaseItem;
		this.purchaseAmount = purchaseAmount;
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", location='" + location + '\'' + ", mobileNo=" + mobileNo
				+ ", purchaseItem='" + purchaseItem + '\'' + ", purchaseAmount=" + purchaseAmount + '}';
	}
}
