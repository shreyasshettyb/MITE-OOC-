package bank_case;

public class Bank_Demo {
	public static void main(String args[]) {
		BankA ob1=new BankA();
		BankB ob2=new BankB();
		BankC ob3=new BankC();
		ob1.getBalance(100);
		ob2.getBalance(150);
		ob3.getBalance(200);
	}
}
