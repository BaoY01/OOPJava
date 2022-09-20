package demo.javaoop.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCadres {

	List<Cadres> listCadres = new ArrayList<Cadres>();
	Scanner sc = new Scanner(System.in);

	public ListCadres() {

	}

	public ListCadres(ArrayList<Cadres> listCadres) {
		this.listCadres = listCadres;
	}

	// them can bo
	public void addListCadres(Cadres cadres) {
		listCadres.add(cadres);
	}

	public void addList() {

		Cadres cadres;

		System.out.println("Nhap so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap thong tin cho tung can bo:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu { " + (i + 1) + " }:");
			System.out.println("Chon loai can bo: 1.Ky su - 2.Nhan vien - 3.Cong nhan : ");

			int option = sc.nextInt();
			sc.nextLine();

			cadres = new Cadres();

			switch (option) {
			case 1:
				cadres = new Engineer();
				break;

			case 2:
				cadres = new Employee();
				break;

			case 3:
				cadres = new Worker();
				break;

			}
			// nhap thong tin cho can bo do
			cadres.enterInfor();
			addListCadres(cadres);
		}
	}

	// tim kiem theo ten
	public void searchCadres(String name) {
		for (Cadres cadres : listCadres) {
			if (cadres.getName().indexOf(name) >= 0)
				System.out.println(cadres);
		}
	}

	//xuat danh sach can bo
	public void printListCadres() {
		for (Cadres cadres : listCadres) {
			System.out.println(cadres);
		}
	}
}
