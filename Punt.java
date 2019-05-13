public class Punt {
	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punt() {
		this(0, 0);
	}

	private int x, y; // coordenades del punt

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
		System.out.println("Set y");
	}

    public void suma(Punt p) { x+=p.x; y+=p.y; }
}