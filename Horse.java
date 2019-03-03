public class Horse implements Piece {
	private boolean white;
	private char label;
	private String name;
	
	Horse(boolean bool) {
		white = bool;
	}
	
	public boolean isWhite() {
		return this.white ;
	}
	
	
	public char getLabel() {
		if (white) return 'H';
		else return 'h';
	}
	
	public String getName() {
		return "Horse" ;
	}


    
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board) {
        Piece figure = board.doska[xTo][yTo];

	    if (figure == null || this.white != figure.isWhite() ) {

            if((Math.abs(xTo - xFrom) == 1) & (Math.abs(yTo - yFrom) == 2))
                return true;
            if((Math.abs(xTo - xFrom) == 2) & (Math.abs(yTo - yFrom) == 1))
                return true;
	    }
        return false;
    }

}