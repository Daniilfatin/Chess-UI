public interface Piece {
	public boolean isWhite();
	public char getLabel();
	public String getName();
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board);	
  }