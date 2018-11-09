package temp;

public class Coordinate {
	
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getters and setters
	public int getX() {
		return x;
	}
	void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	void setY(int y) {
		this.y = y;
	}
	// equals hashCode toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + x + ";" + y + ")";
	}
}
