package java_chobo2.ch12;

public enum Direction {
	EAST(1), SOUTH(5), WEST(10), NORTH(15);
	
	private final int values;

	private Direction(int values) {
		this.values = values;
	}

	public int getValue() {
		return values;
	}
	
	
}
