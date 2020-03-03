package Exam2019B;

class Monom implements function {
	private double _a;
	private int _b;

	public Monom(double a, int b) {
		_a = a;
		_b = b;
	}

	public double f(double x) {
		double ans = _a * Math.pow(x, _b);
		return ans;
	}
}
