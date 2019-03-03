public class Rook implements Piece {
	private boolean white;
	private char label;
	private String name;
	
	Rook(boolean bool) {
		white = bool;
	}
	
	public boolean isWhite() {
		return this.white ;
	}
	
	
	public char getLabel() {
		if (white) return 'R';
		else return 'r';
	}
	
	public String getName() {
		return "Rook" ;
	}

    
    public boolean isValid(int xFrom, int yFrom, int xTo, int yTo, Board board) {
      Piece figure = board.doska[xTo][yTo];
	  boolean empty = true;
	  int k;
	    if (board.doska[xTo][yTo] == null || this.white != figure.isWhite() ) {
		
            if (xTo == xFrom) {
				if (yTo > yFrom) {

					for (k = yFrom + 1; k<yTo; k++) {
						if(board.doska[xFrom][k] != null) empty = false;
					}
						if (empty) return true;
				}
				
				if (yTo < yFrom) {

					for (k = yFrom - 1; k>yTo; k--) {
						if(board.doska[xFrom][k] != null) empty = false;
					}
						if (empty) return true;
				}
			}
						
            if (yTo == yFrom) {
				if (xTo > xFrom) {

					for (k = xFrom + 1; k<xTo; k++) {
						if(board.doska[k][yFrom] != null) empty = false;
					}
						if (empty) return true;
				}
				
				if (xTo < xFrom) {

					for (k = xFrom - 1; k>xTo; k--) {
						if(board.doska[k][yFrom] != null) empty = false;
					}
						if (empty) return true;
				}
			}
		}
        return false;
    }
}