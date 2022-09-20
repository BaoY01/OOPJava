package demo.javaoop.bai2;

import java.util.Scanner;

public class Employee extends Cadres{
	String job;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
			
	}
	
	public Employee(String name, String birthDay, String sex, String address, String job) {
		super(name, birthDay, sex, address);
		this.job = job;
	}

	

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void enterInfor() {
		super.enterInfor();;
		System.out.println("Nhap cong viec: ");
		job = sc.nextLine();
	}
	

	@Override
	public String toString() {
		return " Ho ten: " + getName() + "\n Nam sinh: " + getBirthDay() + "\n Gioi tinh: " + getSex() +"\n Dia chi: " + getAddress() +"\n Cong viec: " + job +"";
	}
	
	
}
