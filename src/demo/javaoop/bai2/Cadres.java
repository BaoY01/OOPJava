package demo.javaoop.bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cadres {
	String name;
	String birthDay;
	String sex;
	String address;
	
	Scanner sc = new Scanner(System.in);
	
	DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public Cadres() {
		
	}
	
	public Cadres(String name, String birthDay, String sex, String address) {
		this.name = name;
		this.birthDay = birthDay;
		this.sex = sex;
		this.address = address;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void enterInfor() {
		System.out.println("Nhap ho ten: ");
		name = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		birthDay = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		sex = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		address = sc.nextLine();
	}
	

	@Override
	public String toString() {
		return " Ho ten: " + name + "\n Nam sinh: " + LocalDate.parse(birthDay, dft) + "\n Gioi tinh: " + sex +"\n Dia chi: " + address +"";
	}
	
	
}
