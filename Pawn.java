public class Pawn implements Piece {
	private boolean white;
	private char label;
	private String name;
	
	Pawn(boolean bool) {
		white = bool;
	}
	
	public boolean isWhite() {
		return this.white ;
	}
	
	
	public char getLabel() {
		if (white) return 'P';
		else return 'p';
	}
	
	public String getName() {
		return "Pawn" ;
	}
   
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board) {
        Piece figure = board.doska[xTo][yTo];

	    if (figure == null || this.white != figure.isWhite() ) {
		   
		    if((this.white) && (figure != null) && (Math.abs(xTo - xFrom) == 1 && yTo == yFrom + 1))
			   return true;
		    if((this.white) && (figure == null) && (xTo == xFrom) && (yTo == yFrom + 1))
               return true;
		    if((!this.white) && (figure != null) && (Math.abs(xTo - xFrom) == 1 && yTo == yFrom - 1))
			   return true;
            if((!this.white) && (figure == null) && (xTo == xFrom) && (yTo == yFrom - 1))
               return true;
		}
        return false;
    }
	

}