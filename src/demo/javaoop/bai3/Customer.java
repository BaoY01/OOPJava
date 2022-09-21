package demo.javaoop.bai3;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Customer {
	String id;
	String name;
	String date;
	double amount;
	double totalPrice;
	final double price = 2536;
	
	
	Scanner sc = new Scanner(System.in);
	
	public Customer() {
		
	}

	public Customer(String id, String name, String date, double amount, double totalPrice) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.amount = amount;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void enterCustomer() {
		System.out.println("Nhap ma khach hang: ");
		id = sc.nextLine();
		System.out.println("Nhap ten khach hang: ");
		name = sc.nextLine();
		System.out.println("Nhap ngay xuat hoa don: ");
		date = sc.nextLine();
		System.out.println("Nhap so luong dien: ");
		amount = sc.nextDouble();
		sc.nextLine();
	}
	
	DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
	
	@Override
	public String toString() {
		
		try {
			return "Customer [id=" + id + ", name=" + name + ", date=" + df.parse(date) + ", amount=" + amount + ", totalPrice=" + totalPrice +"]";
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
