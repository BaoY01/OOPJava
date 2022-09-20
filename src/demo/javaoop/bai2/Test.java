package demo.javaoop.bai2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListCadres myList = new ListCadres();
		
		int option = 0;
		do {
			System.out.println("-------MENU-------");
			System.out.println("0. Thoat chuong trinh.");
			System.out.println("1. Nhap thong tin can bo.");
			System.out.println("2. Tim kiem theo ho ten.");
			System.out.println("3. Hien thi danh sach can bo.");
			
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:{
				myList.addList();
				break;
			}
			case 2:{
				System.out.println("Nhap ten can bo can tim: ");
				String name = sc.nextLine();
				myList.searchCadres(name);
				break;
			}
			case 3:{
				System.out.println("Danh sach can bo la: ");
				myList.printListCadres();
				break;
			}
			}
		}while(option != 0);
		
	}
}
