package demo.javaoop.bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListAccount {
	List<Account> myList = new ArrayList<>();
	

	public ListAccount() {
		this.myList = new ArrayList<Account>();
	}

	public ListAccount(List<Account> myList) {
		this.myList = myList;
	}
	
	//them tai khoang
	public void addAcc(Account acc) {
		this.myList.add(acc);
	}
	
	//xuat danh sach tai khoang
	public void printAccount() {
		for (Account account : myList) {
			System.out.println(account);
		}
	}
	
	//tim so tai khoan
	public boolean checkExist(Account acc) {
		return this.myList.contains(acc);
	}
	
	public Account findUsingEnhancedForLoop(long numberAccount) {
		for (Account account : myList) {
			if(account.getAccountNumber() == numberAccount){
				return account;
			}
		}
		return null;
	}
	
}
