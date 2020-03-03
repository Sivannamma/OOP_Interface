package ThreadsPractice;

public class Storage {
	private int num;
	boolean flag;

	public Storage() {
		this.num = 0;
	}

	public int get() {
		while (flag == false) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		flag = false;
		return num;

	}

	public void put(int val) {
		num = val;
		flag = true;
	}

	public int getNum() {
		return num;
	}

//	public void setNum(int num) {
//		this.num = num;
//	}

}
