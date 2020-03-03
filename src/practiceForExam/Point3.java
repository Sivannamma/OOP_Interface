package practiceForExam;

public class Point3 implements Point3Intrface {
	private double x, y, z;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Point3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point3(Point3 p) {
		this(p.getX(), p.getY(), p.getZ());
	}

	@Override
	public double distance(Point3 p) {
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
	}

	@Override
	public boolean equals(Point3 p) {
		if (p.x != x)
			return false;
		if (p.y != y)
			return false;
		if (p.z != z)
			return false;
		return true;
	}

}
