
public class Segment {
	private double[] coord = new double[4];
	
	public Segment(double p1X, double p1Y, double p2X, double p2Y) {
		this.coord[0] = p1X;
		this.coord[1] = p1Y;
		this.coord[2] = p2X;
		this.coord[3] = p2Y;
	}
	
	public Segment() {
	}
	
	public double Longitud(double p1X, double p1Y, double p2X, double p2Y) {
		double longitud;
		longitud = Math.sqrt(Math.pow(p1X-p2X, 2) + Math.pow(p1Y-p2Y, 2));
		return longitud;
	}

	public double getP1X() {
		return coord[0];
	}

	public void setP1X(double p1x) {
		coord[1] = p1x;
	}

	public double getP1Y() {
		return coord[1];
	}

	public void setP1Y(double p1y) {
		coord[1] = p1y;
	}

	public double getP2X() {
		return coord[2];
	}

	public void setP2X(double p2x) {
		coord[2] = p2x;
	}

	public double getP2Y() {
		return coord[3];
	}

	public void setP2Y(double p2y) {
		coord[3] = p2y;
	}

	
	
}
