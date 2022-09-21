package demo.javaoop.bai3;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ListCustomer myList = new ListCustomer();
		
		int option = 0;
		do {
			
			System.out.println("----------MENU---------");
			System.out.println("0. Thoat chuong trinh.");
			System.out.println("1. Nhap khach hang.");
			System.out.println("2. Xuat danh sach khach hang Viet Nam.");
			System.out.println("3. Xuat danh sach khach hang nuoc ngoai.");
			System.out.println("4. Tong so luong tieu thu khach hang Viet Nam.");
			System.out.println("5. Tong so luong tieu thu khach hang nuoc ngoai.");
			System.out.println("6. Tinh trung binh thanh tien cua khach hang nuoc ngoai.");
			System.out.println("7. In hoa don thang 9 nam 2013.");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:{
				myList.addCustomer();
				break;
			}
			case 2:{
				System.out.println("Danh sach khach hang Viet Nam: ");
				myList.printListCustomerVN();
				break;
			}
			case 3:{
				System.out.println("Danh sach khach hang nuoc ngoai: ");
				myList.printForeignCus();
				break;
			}
			case 4:{
				System.out.println("Tong so luong tieu thu khach hang VN la: " + myList.totalCusVN());
				break;
			}
			case 5:{
				System.out.println("Tong so luong tieu thu khach hang nuoc ngoai la: " + myList.totalForeignCus());
				break;
			}
			case 6:{
				System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai la: " + myList.AvgMoney());
				break;
			}
			case 7:{
				System.out.println("Hoa don khach hang VN thang 9 nam 2013 la:");
				myList.printBillCusVN();
				System.out.println("Hoa don khach hang nuoc ngoai thang 9 nam 2013 la: ");
				myList.printBillForeign();
				break;
			}
			}
			
		}while(option != 0);
	}
}
