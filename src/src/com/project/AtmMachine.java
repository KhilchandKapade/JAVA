package com.project;

public class AtmMachine implements Atm {

	 String bankName;
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		AtmMachine sbi = new AtmMachine();
		sbi.bankName = "SBI BANK";
		sbi.debit();
		System.out.println(sbi.chipNo);
		System.out.println(sbi.model);
		


	}

	
}
