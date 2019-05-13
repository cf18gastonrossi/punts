
public class Segment {
	private Punt p1;
	private Punt p2;
	
	public Segment(Punt p1, Punt p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double longitud(Punt p1, Punt p2) {
		double longitud;
		longitud = (double)(Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2)));
		return longitud;
	}

}
