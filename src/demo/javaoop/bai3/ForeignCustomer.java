package demo.javaoop.bai3;


public class ForeignCustomer extends Customer{
	
	String nationality;

	public ForeignCustomer() {
	}

	public ForeignCustomer(String id, String name, String date, double amount,double totalPrice, String nationality) {
		super(id, name, date, amount, totalPrice);
		this.nationality = nationality;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void enterCustomer() {
		super.enterCustomer();
		System.out.println("Nhap quoc tich khach hang: ");
		nationality = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "ForeignCustomer [id=" + id + ", name=" + name + ", date=" + date + ", amount=" + amount + ",totalPrice="+ money() +", nationality=" + nationality + "]";
	}
	
	//ham tinh tien
	public double money() {
		double totalPrice;
		return totalPrice = amount * price;
	}
	

	
}
