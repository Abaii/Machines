import java.util.*;

public class EPuzzleState extends SearchState {
	// display the board as an array
	private int[][] board = new int[3][3];
	private int g; //local cost
	private int estRemCost ;//underestimate of the true cost
	// constructor
	public EPuzzleState(int[][] b, int lc, int eSC) {
		this.board = b;
		this.g = lc;
		this.estRemCost eSC;
 	}

	// accessor for puzzle state
	public int[][] getBoard() {
		return board;
	}
	public int getLocalCost(){
		return g;
	}
	public int getRemCost(){
		return estRemCost;
	}

	// goal method
	public boolean goalP(Search searcher) {
		PuzzleSearch pS = (PuzzleSearch) searcher;
		int[][] target = pS.getTarget(); // get target amount
		for (int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if (board[i][j] != target[i][j]){
					return false;
				}
			}

		}
		return true; // return if, may have to look up the syntax
									// for this
	}

	// same state
	public boolean sameState(SearchState s) {
		EPuzzleState s1 = (EPuzzleState) s;
		int[][] s2 = s1.getBoard();
		for(int i = 0; i < s2.length; i++){
			for(int j = 0; j < s2.length; j++){
				if (board[i][j] != s2[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	//hamming heurisitic
	public int Hamming(int[][] b){
		int lc = 8; //local cost
		PuzzleSearch pS = (PuzzleSearch) searcher;
		int tS = pS.getTarget(); //get the target
		int[][] copyBoard = b;
		for (int i =0; i < 3; i++){
			if (copyBoard[i][j] == tS[i][j] && copyBoard[i][j] != 0){
				lc -= 1; //minus 1 from local cost
			}else{
				lc += 1; //add one to local cost
			}
		}
		return lc;
	}
	//manhattan heuristic
	public int Manhattan(int[][] b ){
		int distance;
		int copyBoard = b;
		int[][] target = {{1,2,3},{4,5,6}{7,8,0}};
		PuzzleSearch pS = new PuzzleSearch();
		for (int i = 0; i < copyBoard; i++){
			for (int j = 0; j < copyBoard; j++){
				for (int k = 0; k < target; k++){
					for (int l = 0; l < target; l++){

					}
				}
			}
		}
	}

	public ArrayList<SearchState> getSuccessors(Search searcher){
		PuzzleSearch pS = (PuzzleSearch) searcher;
		//int tS = pS.getTarget(); //get the target
		EPuzzleState cB = new EPuzzleState(board);
		int[][] copyBoard = new int[3][3];
		int[][] p1 = new int[3][3];
		int[][] p2 = new int[3][3];
		int[][] p3 = new int[3][3];
		int[][] p4 = new int[3][3];
		//create replicas of the board
		for(int i = 0; i < 3; i++){

			copyBoard[i] = board[i].clone();
			p1[i] = board[i].clone();
			p2[i] = board[i].clone();
			p3[i] = board[i].clone();
			p4[i] = board[i].clone();
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
		//move up
			if (xGap != 0 ){

				for(int i = 0; i < 3; i++){

					p1[i] = board[i].clone();

				}
				p1[xGap][yGap] = p1[xGap - 1][yGap];
				p1[xGap  -1][yGap] = 0;
				pslis.add(new EPuzzleState(p1, 1, Hamming());
				System.out.println("x !=0 reached");
			}
			//move down
			if (xGap != 2){

				for(int i = 0; i < 3; i++){

					p2[i] = board[i].clone();

				}
				p2[xGap][yGap] = p2[xGap+1][yGap];
				p2[xGap +1][yGap] = 0;
				pslis.add(new EPuzzleState(p2,1,Hamming()));

				System.out.println("x !=2 reached");
			}
			//move left
			if (yGap != 0){
				for(int i = 0; i < 3; i++){

					p3[i] = board[i].clone();

				}
				p3[xGap][yGap] = p3[xGap][yGap -1];
				p3[xGap][yGap-1] =0;
				pslis.add(new EPuzzleState(p3, 1, Hamming()));

				System.out.println("y !=0 reached");
			}
			//move right
			if(yGap != 2){
				for(int i = 0; i < 3; i++){

					p4[i] = board[i].clone();

				}
				p4[xGap][yGap] =p4[xGap][yGap+1];
				p4[xGap][yGap+1]=0;
				pslis.add(new EPuzzleState(p4, 1, Hamming()));

				System.out.println("y !=2 reached");
			}

			//cast puzzle states to search states for slis
			for (EPuzzleState ps:pslis)slis.add((SearchState)ps);
			return slis;
		}
	public String toString(){
		String output = new String();
		for(int i = 0; i <board.length;i++){
			output = output +"\n"; //print a new line every 3 numbers
			for(int j = 0; j < board.length ; j++){

				output = output+board[i][j];
			}
		}
		return output; //print the board
	}
}
