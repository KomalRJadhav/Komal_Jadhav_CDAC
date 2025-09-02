class BankAccount1{
	String accountHolder;
	double balance;
	
	BankAccount1(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	
	double deposit(double amount){
		balance = balance+amount;
		return balance;
	}
	
	double withdraw(double amount){
		balance = balance-amount;
		return balance;
	}
	
	void displayDetails(){
		System.out.println("AccountHolder: "+accountHolder+",Balance: "+ balance);
	}
	
	
	public static void main(String[] args){
		BankAccount1 b1 = new BankAccount1("Komal", 2000000);
		BankAccount1 b2 = new BankAccount1("Neha", 50000);
		b1.deposit(50000);
		b2.withdraw(4500);
		b1.displayDetails();
		b2.displayDetails();
		
	}
}