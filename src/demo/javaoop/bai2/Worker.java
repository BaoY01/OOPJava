package demo.javaoop.bai2;

import java.util.Scanner;

public class Worker extends Cadres{
	String step;
	
	Scanner sc = new Scanner(System.in);
	
	public Worker(String name, String birthDay, String sex, String address, String step) {
		super(name, birthDay, sex, address);
		this.step = step;
	}

	public Worker() {
		
	}


	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}
	
	public void enterInfor() {
		super.enterInfor();
		System.out.println("Nhap bac: ");
		step = sc.nextLine();
	}
	

	@Override
	public String toString() {
		return " Ho ten: " + getName() + "\n Nam sinh: " + getBirthDay() + "\n Gioi tinh: " + getSex() +"\n Dia chi: " + getAddress() +"\n Cap bac: " + step + "";
	}
	
	
	
}
