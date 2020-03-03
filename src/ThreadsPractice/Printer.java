package ThreadsPractice;

public class Printer extends Thread {
	private Storage s;
	int a = 10;

	public Printer() {
		this.s = new Storage();
	}

	public Printer(Storage s) {
		this.s = s;
	}

	public void run() {
		while (a > 0) {
			System.out.println(s.get());
			a--;
		}
	}

}
