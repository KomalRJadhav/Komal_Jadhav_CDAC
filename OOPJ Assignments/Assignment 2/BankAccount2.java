class BankAccount2{
	String accountHolder;
	double balance;
	static String bankName = "CDAC Bank";
	
	BankAccount2(String accountHolder, double balance){
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
	
	static void displayBankName(){
		System.out.println("Bank Name is: "+bankName);
	}
	
	
	public static void main(String[] args){
		displayBankName();
		
		
		BankAccount2 b1 = new BankAccount2("Komal", 2000000);
		b1.deposit(50000);
		b1.displayDetails();
	
		
	}
}