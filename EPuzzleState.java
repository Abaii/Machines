import java.util.*;

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
	public boolean goalP(Search searcher) {
		PuzzleSearch pS = (PuzzleSearch) searcher;
		int[][] target = pS.getTarget(); // get target amount
		return (target == board); // return if, may have to look up the syntax
									// for this
	}

	// same state
	public boolean sameState(SearchState s) {
		EPuzzleState s1 = (EPuzzleState) s;
		return (board == s1.getBoard());
	}

	public ArrayList<SearchState> getSuccessors(Search searcher){
		PuzzleSearch pS = (PuzzleSearch) searcher;
		//int tS = pS.getTarget(); //get the target
		EPuzzleState cB = new EPuzzleState(board);
		int[][] copyBoard = cB.getBoard();
		int[][] p1 = copyBoard;
		int[][] p2 = copyBoard;
		int[][] p3 = copyBoard;
		int[][] p4 = copyBoard;
		//print the board -- TEST
		for(int i = 0; i < copyBoard.length ; i++){
			for (int j = 0; j < copyBoard.length; j++){
				System.out.println(board[i][j]);
			}
		}



		int xGap=0; //x co-ord of the gap
		int yGap=0; //y co-ord of the gap
		ArrayList<EPuzzleState> pslis=new ArrayList<EPuzzleState>(); // the list of puzzle states
		ArrayList<SearchState> slis=new ArrayList<SearchState>();
		//find the empty space, gap, in the board
		for (int i = 0; i < copyBoard.length; i++){
			for (int j = 0; j < copyBoard.length; j++){
				if (copyBoard[i][j] == 0){
					xGap = i;
					yGap = j;
					System.out.println("xGap = " + xGap);
					System.out.println("yGap = "+yGap);

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
				p1[xGap][yGap] = p1[xGap - 1][yGap];
				p1[xGap  -1][yGap] = 0;
				pslis.add(new EPuzzleState(p1));
				System.out.println("x !=0 reached");
			}
			if (xGap != 2){
				p2[xGap][yGap] = p2[xGap +1][yGap];
				p2[xGap +1][yGap] = 0;
				pslis.add(new EPuzzleState(p2));

				System.out.println("x !=2 reached");
			}
			if (yGap != 0){
				p3[xGap][yGap] = p3[xGap][yGap -1];
				p3[xGap][yGap-1] =0;
				pslis.add(new EPuzzleState(p3));

				System.out.println("y !=0 reached");
			}
			if(yGap != 2){

				p4[xGap][yGap] = p4[xGap][yGap+1];
				p4[xGap][yGap+1]=0;
				pslis.add(new EPuzzleState(p4));

				System.out.println("y !=2 reached");
			}

			//cast puzzle states to search states for slis
			for (EPuzzleState ps:pslis)slis.add((SearchState)ps);
			return slis;
		}
	public String toString(){
		for(int i = 0; i <board.length;i++){
			for(int j = 0; j < board.length ; j++){
				return "board" + board[i][j];
			}
		}
		return "No Puzzle state";
	}
}
