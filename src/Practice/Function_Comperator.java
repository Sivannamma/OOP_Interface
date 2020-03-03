package Practice;

import java.util.Comparator;

public class Function_Comperator implements Comparator<Function> {
	private double _x0;

	public Function_Comperator(double x0) {
		_x0 = x0;
	}

	public int compare(Function f0, Function f1) {
		int ans = 0;
		double df = f1.f(_x0) - f0.f(_x0);
		if (df > 0) {
			ans = 1;
		}
		if (df < 0) {
			ans = -1;
		}
		return ans;
	}
}
