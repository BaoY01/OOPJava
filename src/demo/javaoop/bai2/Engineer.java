package demo.javaoop.bai2;

import java.util.Scanner;

public class Engineer extends Cadres{
	String trainingIndustry;
	
	Scanner sc = new Scanner(System.in);

	public Engineer(String name, String birthDay, String sex, String address, String trainingIndustry) {
		super(name, birthDay, sex, address);
		this.trainingIndustry = trainingIndustry;
	}

	public Engineer() {
		
	}

	public String getTrainingIndustry() {
		return trainingIndustry;
	}

	public void setTrainingIndustry(String trainingIndustry) {
		this.trainingIndustry = trainingIndustry;
	}
	
	public void enterInfor() {
		super.enterInfor();
		System.out.println("Nhap nganh dao tao: ");
		trainingIndustry = sc.nextLine();
	}


	@Override
	public String toString() {
		return " Ho ten: " + getName() + "\n Nam sinh: " + getBirthDay() + "\n Gioi tinh: " + getSex() +"\n Dia chi: " + getAddress() +"\n Nganh dao tao: " + trainingIndustry + "";
	}
	
	
}
