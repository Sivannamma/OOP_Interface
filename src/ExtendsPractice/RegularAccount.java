package ExtendsPractice;

public class RegularAccount extends Account {

	public RegularAccount(double balance, Person costumer) {
		super(balance, costumer);
	}

	@Override
	public boolean withdraw(double amount) { // cant have minus in bank
		if (amount > this.getbalance())
			return false;
		else {
			this.setBalance(this.getbalance() - amount);
			return true;
		}
	}
}
