public class Bishop implements Piece {
	private boolean white;
	private char label;
	private String name;
	
	Bishop(boolean bool) {
		white = bool;
	}
	
	public boolean isWhite() {
		return this.white ;
	}
	
	
	public char getLabel() {
		if (white) return 'B';
		else return 'b';
	}
	
	public String getName() {
		return "Bishop" ;
	}


    
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board) {
       Piece figure = board.doska[xTo][yTo];
	   boolean empty = true;
	   int k;
	   int r;
	    if (figure == null || this.white != figure.isWhite() ) {

            if(Math.abs(xTo - xFrom) == Math.abs(yTo - yFrom)) {
				if ((xTo > xFrom) && (yTo > yFrom)) {
					
					r = yFrom;
					for (k = xFrom + 1; k<xTo; k++) {
						r = r + 1;
						if(board.doska[k][r] != null) empty = false;
					}
						if (empty) return true;
                }
				if ((xTo > xFrom) && (yTo < yFrom)) {
					
					r = yFrom;
					for (k = xFrom + 1; k<xTo; k++) {
						r = r - 1;
						if(board.doska[k][r] != null) empty = false;
					}
						if (empty) return true;
                }
				if ((xTo < xFrom) && (yTo > yFrom)) {
					
					r = yFrom;
					for (k = xFrom - 1; k>xTo; k--) {
						r = r + 1;
						if(board.doska[k][r] != null) empty = false;
					}
						if (empty) return true;
                }
				if ((xTo < xFrom) && (yTo < yFrom)) {
					
					r = yFrom;
					for (k = xFrom - 1; k>xTo; k--) {
						r = r - 1;
						if(board.doska[k][r] != null) empty = false;
					}
						if (empty) return true;
                }
			}
	    }
        return false;
    }

}