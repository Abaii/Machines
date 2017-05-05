
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
