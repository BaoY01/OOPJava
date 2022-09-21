package demo.javaoop.bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListCustomer {
	
	Scanner sc = new Scanner(System.in);
	
	List<Customer> listCustomerVN = new ArrayList<Customer>();
	List<Customer> listForeignCus = new ArrayList<Customer>();

	public ListCustomer() {
	}

	public ListCustomer(List<Customer> listCustomer) {
		this.listCustomerVN = listCustomer;
		this.listForeignCus = listCustomer;
	}
	
	//them khach hang vao danh sach VN
	public void addListCustomerVN(Customer customer) {
		this.listCustomerVN.add(customer);
	}
	
	//them khach hang vao danh sach nuoc ngoai
	public void addListForeignCus(Customer customer) {
		this.listForeignCus.add(customer);
	}
	
	public void addCustomer() {
		
		Customer customer;
		
		System.out.println("Nhap so luong khach hang: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		
		int option = 0;
		for(int i = 0; i < n; i++) {
					
			System.out.println("Khach hang thu {" + (i + 1) + "}:");
			System.out.println("1. Khach hang Viet Nam --- 2. Khach hang nuoc ngoai.");
			option = sc.nextInt();
			
			customer = new Customer();
			
			switch(option) {
			case 1:{
				customer = new CustomerVN();
				customer.enterCustomer();
				addListCustomerVN(customer);
				break;
			}
			case 2:{
				customer = new ForeignCustomer();
				customer.enterCustomer();
				addListForeignCus(customer);
				break;
			}
			}
		}
	}
	
	//xuat danh sach khach hang Viet Nam
	public void printListCustomerVN() {
		 for (Customer customer : listCustomerVN) {
			System.out.println(customer);
		}
	}
	
	//xuat danh sach khach hang nuoc ngoai
	public void printForeignCus() {
		for (Customer customer : listForeignCus) {
			System.out.println(customer);
		}
	}
	
	//tinh tong so luong tieu thu khach hang VN
	public double totalCusVN() {
		double total = 0;
		for (Customer customer : listCustomerVN) {
			total = total + customer.getAmount();
		}
		return total;
	}
	
	//tinh tong so luong tieu thu khach hang nuoc ngoai
	public double totalForeignCus() {
		double total = 0;
		for (Customer customer : listForeignCus) {
			total = total + customer.getAmount();
		}
		return total;
	}
	
	//ham tinh tong tien
	
	//ham tinh trung binh thanh tien khach hang nuoc ngoai
	public double AvgMoney() {
		double avg = 0;
		for (Customer customer : listForeignCus) {
			avg += (customer.amount * customer.price) / listForeignCus.size();
		}
		return avg;
	}
	
	
	
	DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
	
	//xuat hoa don khach hang VN
	public void printBillCusVN() {
		
		for (Customer customer : listCustomerVN) {
			try {
				Date date = df.parse(customer.getDate());
				if(date.before(df.parse("30/9/2013"))) {
					if(date.after(df.parse("1/9/2013"))){
						System.out.println(customer);
					}
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//xuat hao don khach hang nuoc ngoai
	public void printBillForeign() {
		for (Customer customer : listForeignCus) {
			try {
				Date date2 = df.parse(customer.getDate());
				if(date2.before(df.parse("30/9/2013"))) {
					if(date2.after(df.parse("1/9/2013"))) {
						System.out.println(customer);
					}
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
