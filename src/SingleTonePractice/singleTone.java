package SingleTonePractice;

public class singleTone {
	private static singleTone single_tone;

	public static singleTone getInstance() {
		if (single_tone == null) {
			synchronized (singleTone.class) {
				if (single_tone == null)
					single_tone = new singleTone();
			}
		}
		return single_tone;
	}

}
