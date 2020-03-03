package ExtendsPractice;

public class GoldAccount extends Account {

	public GoldAccount(double balance, Person costumer) {
		super(balance, costumer);
	}

	@Override
	public boolean withdraw(double amount) { // can be minus , golden account
		this.setBalance(this.getbalance() - amount);
		return true;
	}

}
