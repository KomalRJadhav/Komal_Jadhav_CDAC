class BankAccount{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	
	void displayDetails(){
		System.out.println("AccountHolder: "+accountHolder+",Balance: "+ balance);
	}
	
	public static void main(String[] args){
		BankAccount b1 = new BankAccount("Komal", 2000000);
		b1.displayDetails();
	}
}