class BankAccount{
	String name;
	double balance;
	
	static{
		System.out.println("Bank Interest Rate Initialized: 4.0%");
	}
	
	BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	
	void displayAccounts(){
		System.out.println("Name: "+name+",Balance: "+balance+",Interest Rate=4.0%");
	}
}
public class BankAccountMain{
	public static void main(String[] args){
		BankAccount account1 = new BankAccount("Rohit",5000);
		BankAccount account2 = new BankAccount("Priya",15000);
		
		account1.displayAccounts();
		account2.displayAccounts();
	}
}