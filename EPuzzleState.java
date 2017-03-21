
public class EPuzzleState extends SearchState {
	// display the board as an array
	private int[][] board = new int[3][3];

	// constructor
	public EPuzzleState(int[][] b) {
		this.board = b;
		
	}

	// accessor for puzzle state
	public int[][] getBoard() {
		return board;
	}

	// goal method
	public boolean goalP(Searcher searcher) {
		PuzzleSearch pS = (PuzzleSearch) searcher;
		int[][] target = pS.getTarget(); // get target amount
		return (target == board); // return if, may have to look up the syntax
									// for this
	}

	// same state
	public int[] SameState(SearchState s) {
		PuzzleState s1 = (PuzzleState) s;
		return (board = s1.getBoard());
	}

	public <ArrayList> getSuccessors(Searcher searcher){
		PuzzleSearch pS = (PuzzleSearch) searcher; 
		int tS = pS.getTarget(); //get the target
		int[][] copyBoard = EPuzzleState.getBoard(); //copy of the board 
		int[][] tempBoard = EPuzzleState.getBoard(); //used to swap two board values
		int xGap; //x co-ord of the gap
		int yGap; //y co-ord of the gap
		ArrayList<EPuzzleState> pslis=new ArrayList<EPuzzleState>(); // the list of puzzle states
		ArrayList<SearchState> slis=new ArrayList<SearchState>();
		//find the empty space, gap, in the board
		for (int i = 0; i < copyBoard.length; i++){
			for (int j = 0; j < copyBoard.length; j++){
				if (copyBoard[i][j]) == 0){
					xGap = i; 
					yGap = j;
				}
			}
		}
		//POSSIBLE WAY OF SOlVING 
		//create 4 additional boards, P1, P2, P3, P4
		//at each of the boundary cases, edit one board per boundary case 
		//pass the array as a parameter in EPuzzleState 
		//eg pslis.add(newEPuzzleState[P1]);
		//boundary cases, when y != 2, x !=2, y !=0, x!= 0
		
		//possible moves at any given state 
			if (xGap != 0 ){
				copyBoard[xGap][yGap] = copyBoard[xGap + 1][yGap];
				copyBoard[xGap  +1][yGap] = 0;
				pslis.add(new EPuzzleState(copyBoard));
			}
			if (xGap != 2){
				copyBoard[xGap][yGap] = copyBoard[xGap -1][yGap];
				copyBoard[xGap -1][yGap] = 0;
				pslis.add(new EPuzzleState(copyBoard));
			}
			if (yGap != 0){
				copyBoard[xGap][yGap] = copyBoard[xGap][yGap +1];
				copyBoard[xGap][yGap+1] =0;
				pslis.add(new EPuzzleState(copyBoard));
			}
			if(yGap != 2){
				copyBoard[xGap][yGap] = copyBoard[xGap][yGap -1];
				copyBoard[xGap][yGap-1]=0;
				pslis.add(new EPuzzleState(copyBoard));
			}
			
			//cast puzzle states to search states for slis
			for (EPuzzleState ps:pslis)slis.add((SearchState)ps);
			return slis;
		}
	public String toString(){
		for(int i = 0; i <board.length-1;i++){
			for(int j = 0; j < board.length -1; j++){
				return "Puzzle State: " + board[i][j];
			}
		}
	}
}

}
