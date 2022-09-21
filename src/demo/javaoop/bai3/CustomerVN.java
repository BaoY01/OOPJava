package demo.javaoop.bai3;


public class CustomerVN extends Customer{

	final int QUOTA = 300;
	String customers;
	
	public CustomerVN() {
	}

	public CustomerVN(String id, String name, String date, double amount, double totalPrice, String customers) {
		super(id, name, date, amount, totalPrice);
		this.customers = customers;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}
	
	public void enterCustomer() {
		super.enterCustomer();
		System.out.println("Nhap doi tuong khach hang (sinh hoat, kinh doanh, san xuat): ");
		customers = sc.nextLine();
	}
	

	@Override
	public String toString() {
		return "CustomerVN [id=" + id + ", name=" + name + ", date=" + date + ", amount=" + amount + ", totalPrice=" + money() +", customers=" + customers + "]";
	}
	
	//ham tinh tien
	public double money() {
		double totalPice = 0;
		if(amount <= QUOTA) {
			totalPice = amount * price;
		}else {
			totalPice = amount * price * QUOTA + (amount - QUOTA) * price * 2.5;
		}
		return totalPice;
	}
	
	
}
