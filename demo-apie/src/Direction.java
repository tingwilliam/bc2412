public enum Direction {
  EAST(90, 1), NORTH(360, 2), WEST(270, -1), SOUTH(180,-2),;


  private final int degree;
  private final int value;

  private Direction (int degree, int value) {
  this.degree = degree;
  this.value = value;
}


  public int getDegree() {
    return this.degree;
}

//Direction.NORTH.oppsite() -> Direction SOUTH
  public Direction oppsite() {
    for (Direction d : values()) {
      if (d.value == this.value * -1)
      return d;
    }
    return null; //throw exception

}

public static void main(String[] args) {
    System.out.println( Direction.EAST.getDegree());
    System.out.println( Direction.NORTH.getDegree());
    System.out.println( Direction.WEST.getDegree());
    System.out.println( Direction.SOUTH.getDegree());
    System.out.println( Direction.EAST.oppsite());
}



}