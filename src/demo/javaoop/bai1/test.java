package demo.javaoop.bai1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ListAccount listAcc = new ListAccount();
		Scanner sc = new Scanner(System.in);

		int option = 0;

		do {

			System.out.println("------------------MENU---------------");
			System.out.println("0. Thoat chuong trinh.");
			System.out.println("1. Them tai khoan.");
			System.out.println("2. In danh sach tai khoan.");
			System.out.println("3. Nap tien vao tai khoan.");
			System.out.println("4. Rut tien.");
			System.out.println("5. Chuyen tien.");
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1: {
				System.out.println("Nhap so tai khoan: ");
				long number = sc.nextLong();
				sc.nextLine();
				System.out.println("Nhap ten tai khoan");
				String nameAccount = sc.nextLine();
				Account acc = new Account(number, nameAccount, 50);
				listAcc.addAcc(acc);
				break;
			}
			case 2: {
				System.out.println("Danh sach cac tai khoan.");
				listAcc.printAccount();
				break;
			}
			case 3: {
				System.out.println("Nhap so tai khoan can nap tien: ");
				long numberAdd = sc.nextLong();
				//kiem tra tai khoan da ton tai trong list chua
				Account account = listAcc.findUsingEnhancedForLoop(numberAdd);
				if (account != null) {
					System.out.println("Moi ban nhap so tien can nap: ");
					double add = sc.nextDouble();
					if (add > 0) {
						//them tien vao tai khoan
						account.addMoney(add);
						System.out.println("Ban vua nap " + NumberFormat.getCurrencyInstance().format(add) + " vao tai khoan.");
					} else {
						System.out.println("So tien phai lon hon 0 nhe!");
					}
				} else {
					System.out.println("So tai khoan khong ton tai.");
				}
				break;
			}
			case 4:{
				System.out.println("Nhap so tai khoan can rut tien: ");
				long numberRm = sc.nextLong();
				//kiem tra tai khoan da ton tai trong list chua
				Account account = listAcc.findUsingEnhancedForLoop(numberRm);
				if(account != null) {
					System.out.println("Moi ban nhap so tien can rut: ");
					double rm = sc.nextDouble();
					if(rm > 0) {
						//rut tien khoi tai khoan
						account.rmMoney(rm);
						System.out.println("Ban vua rut " + NumberFormat.getCurrencyInstance().format(rm) + " khoi tai khoan.");
					}else {
						System.out.println("So tien phai lon hon 0 ban nhe!");
					}
				}else {
					System.out.println("Tai khoan khong ton tai.");
				}
				break;
			}
			case 5:{
				//cho nguoi dung nhap so tai khoan can chuyen
				System.out.println("Hay nhap so tai khoan cua ban: ");
				long yourAcc = sc.nextLong();
				//kiem tra so tai khoan da ton tai chua
				Account your = listAcc.findUsingEnhancedForLoop(yourAcc);
				if(your != null) {
					//cho nguoi dung nhap so tai khoan nhan tien
					System.out.println("Hay nhap so tai khoan nhan tien: ");
					long accountGet = sc.nextLong();
					//kiem tra so tai khoan da ton tai chua
					Account change = listAcc.findUsingEnhancedForLoop(accountGet);
					if(change != null) {
						//cho nguoi dung nhap so tien can chuyen
						System.out.println("Hay nhap so tien ban muon chuyen: ");
						double money = sc.nextDouble();
						if(money > 0) {
							if(money < your.getMoney()) {
								//xu ly chuyen tien
								your.changeMoney(money);
								change.addMoney(money);
							}else {
								System.out.println("Rat tiet ban khong du tien!");
							}
						}else {
							System.out.println("So tien chuyen phai lon hon 0!");
						}					
					}else {
						System.out.println("Tai khoan nay khong ton tai.");
					}
				}else {
					System.out.println("Tai khoan nay khong ton tai.");
				}
				break;
			}
			}

		} while (option != 0);

	}
}
