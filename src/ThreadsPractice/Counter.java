package ThreadsPractice;

public class Counter extends Thread {
	private Storage s;
	private int a = 10;

	public Counter() {
		s = new Storage();
	}

	public Counter(Storage s) {
		this.s = s;
	}

	public void run() {
		while (a > 0) {
			this.s.put(this.s.getNum() + 1);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
		}

	}

}
