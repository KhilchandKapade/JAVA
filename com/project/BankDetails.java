package com.project;

public class BankDetails {

	private String accountNo;
	private String accountname;
	private String ifscNo;


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String acNo) {
		this.accountNo = acNo;
	}


	public String getAccountname() {
		return accountname;
	}


	public void setAccountname(String acname) {
		this.accountname = acname;
	}


	public String getIfscNo() {
		return ifscNo;
	}


	public void setIfscNo(String iNo) {
		this.ifscNo = iNo;
	}
	
	
	private String holderName ;

	public void setHolderName(String name) {
		this.holderName = name;
	}

	private String ifscCode;

	public void setIfscCode(String ifsc) {
		this.ifscCode = ifsc;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BankDetails divya = new BankDetails();
		divya.setAccountNo("1234567898765678");
		divya.setHolderName("Divya Rane");
		divya.setIfscCode("BAYDRI2536");

		System.out.println(divya.getAccountNo()); 


	}

}
