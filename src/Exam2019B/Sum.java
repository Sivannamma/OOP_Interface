package Exam2019B;

class Sum implements function {
	private function _f1, _f2;

	public Sum(function f1, function f2) {
		_f1 = f1;
		_f2 = f2;
	}

	public double f(double x) {
		return _f1.f(x) + _f2.f(x);
	}

	public String toString() {
		return "" + _f1 + "+" + _f2;
	}
}