class BankAccount{
	String name;
	private int accountNumber;
	private double balance;
	private static int id = 0;
	public BankAccount(String n){
		name = n;
		id++;
		accountNumber = id;
	}
	public BankAccount(String name, int accountNumber, int balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public BankAccount(){
		this("",0,0);
	}
	public String toString(String name, double balance){
		this.name = name;
		this.balance = balance;
		return name + balance;
	}
	public void withdraw(double amount){
		if(this.balance > amount){
			this.balance -= amount;
		}
		else{
			System.out.println("Not enough funds");
		}
	}
	public void deposit(double amount){
		this.balance += amount;
	}
	public int returnBankAccountObjects(){
		return this.id;
	}
}