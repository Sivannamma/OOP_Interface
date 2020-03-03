package practiceForExam;

public class Ballon implements BalloonIntrface {
	Point3 center;
	double r;

	public Ballon(Point3 center, double r) {
		this.center = new Point3(center);
		this.r = r;
	}

	@Override
	public Point3 getCenter() {
		return this.center;
	}

	@Override
	public double getRadius() {
		return this.r;
	}

	@Override
	public double distCenter(Ballon p) {
		Point3 temp = p.center;
		return dist(temp);
	}

	private double dist(Point3 p) {
		return Math.sqrt(Math.pow(this.center.getX() - p.getX(), 2) + Math.pow(this.center.getY() - p.getY(), 2)
				+ Math.pow(this.center.getZ() - p.getZ(), 2));
	}

	@Override
	public boolean containPont(Point3 p) {
		return (dist(p)) <= r ? true : false;
	}

}
