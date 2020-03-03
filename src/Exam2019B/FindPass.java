package Exam2019B;

public class FindPass {
	private static int min = 0, max = 1000 * 1000 * 100, LENGTH = 8;

	public static String findPass() throws InterruptedException {
		String ans = null;
		int ind = min;
		while (ans == null && ind < max) {
			String test = getStringfromInt(ind, LENGTH);
			if (Password.testPass(test)) {
				ans = test;
			} // done!
			ind++;
		}
		return ans;
	} // findPass

	public static String getStringfromInt(int I, int l) throws InterruptedException {
		String s = "" + I;
		while (s.length() < l) {
			s = "0" + s;
		}
		return s;
	}

}