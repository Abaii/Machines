<<<<<<< HEAD

public class PuzzleSearch extends Search {
	// instance variables
	//private int[] board = new int[];
	private int target;
	private int gap;

	// constructor
	public PuzzleSearch(int t, int g) {
		//board = b (may need to add this back in, I'm not sure if the board state needs to be here
		target = t;
		gap = g;
	}

	// accessors
	public int[] getBoard() {
		return board;
	}

	public int getTarget() {
		return target;
	}

	public int getGap() {
		return gap;
	}

}
=======

public class PuzzleSearch extends Search {
	// instance variables

	private int[][] target;


	// constructor
	public PuzzleSearch(int[][] t) {
		this.target = t;

	}

	// accessor

	public int[][] getTarget() {
		return target;
	}


}
>>>>>>> 62145eca4e0b88139ae369a83bcbdfb25573182a
