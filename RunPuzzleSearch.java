import sheffield.*;
import java.util.*;

public class RunPuzzleSearch {
	public static void main(String[] args){
		//create easy writer
		EasyWriter screen = new EasyWriter();
		int[][] gState = {
			{ 1, 2, 3},
			{ 4, 5, 6},
			{ 7, 8, 0}
		};
		int[][] aP1 =  {
			{ 1, 0, 3},
			{ 4, 2, 6},
			{ 7, 5, 8}
		};
		int[][] aP2 =  {
			{ 4, 1, 3},
			{ 7, 2, 5},
			{ 0, 8 ,6}
		};
		int[][] aP3 =  {
			{ 2 ,3 ,6},
			{ 1 ,5 ,8},
			{ 4 ,7 ,0}
		};

		//create a puzzlesearcher //with parameters for the goal state and gap in the board respectively
		PuzzleSearch searcher = new PuzzleSearch(gState);

		//these are the 3 initial states that will be used
		SearchState P1 = (SearchState) new EPuzzleState(aP1);
		SearchState P2 = (SearchState) new EPuzzleState(aP2);
		SearchState P3 = (SearchState) new EPuzzleState(aP3);

		//run the breadth first searches
		String resd = searcher.runSearch(P3, "breadthFirst");
		screen.println(resd);//how to run a search with one of the inital states.
	}
}
