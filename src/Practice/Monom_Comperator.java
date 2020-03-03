package Practice;

import java.util.Comparator;

public class Monom_Comperator implements Comparator<Monom> {
	public int compare(Monom m0, Monom m1) {
		int t = m1.getPower() - m0.getPower();
		return t;
	}
}
