
public class Point implements Comparable<Point> {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point other) {
		this(other.x, other.y);
	}

	@Override
	public int compareTo(Point o) {
		if (this.distance() > o.distance())
			return 1;
		else if (this.distance() < o.distance())
			return -1;
		else
			return 0;
	}

	public double distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public String toString() {
		return "Point: (" + x + " , " + y + ")";
	}
}
