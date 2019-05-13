
public class Segment {
	private double p1X, p1Y, p2X, p2Y;
	
	public Segment(double p1X, double p1Y, double p2X, double p2Y) {
		this.setP1X(p1X);
		this.setP1Y(p1Y);
		this.setP2X(p2X);
		this.setP2Y(p2Y);
	}
	
	public Segment() {
	}
	
	public double Longitud(double p1X, double p1Y, double p2X, double p2Y) {
		double longitud;
		longitud = Math.sqrt(Math.pow(p1X-p2X, 2) + Math.pow(p1Y-p2Y, 2));
		return longitud;
	}

	public double getP1X() {
		return p1X;
	}

	public void setP1X(double p1x) {
		p1X = p1x;
	}

	public double getP1Y() {
		return p1Y;
	}

	public void setP1Y(double p1y) {
		p1Y = p1y;
	}

	public double getP2X() {
		return p2X;
	}

	public void setP2X(double p2x) {
		p2X = p2x;
	}

	public double getP2Y() {
		return p2Y;
	}

	public void setP2Y(double p2y) {
		p2Y = p2y;
	}

	
	
}
