package ExtendsPractice;

public abstract class Account {
	private double balance;
	private Person costumer;

	public Account(double balance, Person costumer) {
		this.balance = balance;
		this.costumer = new Person(costumer);
	}

	public void deposit(double amount) {
		if (amount >= 0)
			this.balance += amount;
		else
			System.out.println("cant deposit negative amount");
	}

	public double getbalance() {
		return this.balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}

	public abstract boolean withdraw(double amount);

}
