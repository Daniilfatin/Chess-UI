public class King implements Piece {
	private boolean white;
	private char label;
	private String name;
	
	King(boolean bool) {
		white = bool;
	}
	
	public boolean isWhite() {
		return this.white ;
	}
	
	
	public char getLabel() {
		if (white) return 'K';
		else return 'k';
	}
	
	public String getName() {
		return "King" ;
	}


    
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board) {
        Piece figure = board.doska[xTo][yTo];

	    if (figure == null || this.white != figure.isWhite() ) {
		   
           if ((Math.abs(xTo - xFrom) <= 1) & (Math.abs(yTo - yFrom) <= 1))
		      return true;

		}
        return false;
    }

}