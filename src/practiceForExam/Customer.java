package practiceForExam;

public class Customer {
	private String name;
	private long id;

	public Customer(String name, long id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "name : " + name + " id : " + id;
	}

	public class Account {
		double balance;
		long num;

		public Account(double sum) {
			balance = sum;
		}

		public String toString() {
			return "The Account belongs to " + Customer.this.name + " and its balance is " + balance;
		}
	}

	public static void main(String[] args) {
		Customer customer = new Customer("Dany", 2929292327L);
		Customer.Account account1 = customer.new Account(2000);
		Customer.Account account2 = customer.new Account(4000);
		Customer.Account account3 = customer.new Account(3000);
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		Customer.Account accountY = new Customer("Yael", 123456789L).new Account(10000);
		System.out.println(accountY);
	}
}
