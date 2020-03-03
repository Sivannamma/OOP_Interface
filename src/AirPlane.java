
public class AirPlane implements IAirPlane {
	private int PlaneNum;
	private String color;
	private int fuel;

	public AirPlane(int PlaneNum, String color) {
		this.PlaneNum = PlaneNum;
		this.color = color;
		this.fuel = 100;
	}

	@Override
	public boolean moveBack(int x) {
		if (fuel - x > 0) {
			fuel = fuel - x;
			return true;
		}
		return false;
	}

	@Override
	public boolean moveForward(int x) {
		if (fuel - x > 0) {
			fuel = fuel - x;
			return true;
		}
		return false;
	}

	@Override
	public boolean moveUp(int x) {
		if (fuel - x > 0) {
			fuel = fuel - x;
			return true;
		}
		return false;
	}

	@Override
	public boolean moveDown(int x) {
		if (fuel - x > 0) {
			fuel = fuel - x;
			return true;
		}
		return false;
	}

	public int PlaneNum() {
		return PlaneNum;
	}

	public String color() {
		return color;
	}

	public String toString() {
		return "plane num " + PlaneNum + " , Plane color: " + color + " fuel left: " + fuel + "";
	}

}
