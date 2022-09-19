package demo.javaoop.bai1;

import java.text.NumberFormat;

public class Account {
	long accountNumber;
	String accountName;
	double money;
	
	final double INTEREST_RATE = 0.035;
	

	//khoi tao co tham so voi money mac dinh 50
	public Account(long accountNumber, String accountName, double money) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.money = money;
	}

	public Account(long accountNumber) {
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", money=" + NumberFormat.getCurrencyInstance().format(getMoney()) + "]";
	}
	
	//phuong thuc nap tien vao tai khoan
	public double addMoney(double add) {
		money += add;
		return money;
	}
	
	//phuong thuc rut tien trong tai khoang
	public double rmMoney(double rm) {
		double cost = 3000;
		money = money - (rm + cost);
		return money;
	}
	
	//chuyen tien
	public double changeMoney(double change) {
		return money -= change;
	}

	
	
}
