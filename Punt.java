public class Punt {
	public Punt(int x, int y) {
		this.coord[0] = x;
		this.coord[1] = y;
	}

	public Punt() {
		this(0, 0);
	}

	private int[] coord = new int[2]; // coordenades del punt

	public int getX() {
		return coord[0];
	}

	public int getY() {
		return coord[1];
	}

	public void setX(int x) {
		this.coord[0] = x;
	}

	public void setY(int y) {
		this.coord[1] = coord[1];
		System.out.println("Set y");
	}

    public void suma(Punt p) { coord[0]+=p.coord[0]; coord[1]+=p.coord[2]; }
}