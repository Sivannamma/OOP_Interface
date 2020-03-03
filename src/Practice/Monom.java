package Practice;

public class Monom implements Function {
	private double a;
	private int b;

	public Monom(double a, int b) {
		this.a = a;
		this.b = b;
	}

	public Monom(Monom ot) {
		this.a = ot.getA();
		this.b = getPower();
	}

	public void add(Monom m) {
		this.a = this.a + m.getA();
	}

	public void multiply(Monom m) {
		this.a = this.a * m.getA();
	}

	@Override
	public double f(double x) {
		return Math.pow(x * a, b);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public int getPower() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean equals(Monom m) {
		return a == m.getA() && b == m.getPower();
	}
}
