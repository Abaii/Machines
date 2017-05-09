
public class EPuzzleState extends SearchState {
	// display the board as an array
	private int[] board = new int[];


	// constructor
	public EPuzzleState(int[] b) {
		this.board = b;
	}

	// accessor for puzzle state
	public int[] getBoard() {
		return board;
	}

	// goal method
	public boolean goalP(Searcher searcher) {
		PuzzleSearch pS = (PuzzleSearch) searcher;
		int[] target = pS.getTarget(); // get target amount
		return (target == board); // return if, may have to look up the syntax
									// for this
	}

	// same state
	public int[] SameState(SearchState s){
		PuzzleState s1 = (PuzzleState) s;
		return (board = s1.getBoard())s;
	}
	// fuk knows how getSuccessors works
	// wait i might know ..
	// check tomorrow too

	public <ArrayList> getSuccessors(Searcher searcher){
		EPuzzleState ep = (EPuzzleState) searcher; 
		int bS = ep.getBoard(); //get the state of the board
		//find where the gap is
		
		
		}
	}

}
