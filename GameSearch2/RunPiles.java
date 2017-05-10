<<<<<<< HEAD
/**
 * RunPiles.java
 * Run GameTree search for Piles (Grundy's game)
 * @author Phil Green
 * First Version 12/1/2004
 * */

import sheffield.*;
import java.util.*;
import java.math.*;

public class RunPiles
{
 public static void main(String[] arg) {
   // create objects for input and output
   EasyWriter scr = new EasyWriter();
   EasyWriter scrf = new EasyWriter("piles_results.txt");

   int[] ss = {15}; //init state

   PilesSearch psearch = new PilesSearch(); //the search engine
   GameSearchState initState = (GameSearchState) new PilesState(ss); //initial state - 1 pile of 5
   String ans = psearch.runGameSearch(initState); //run the search
   scr.println(ans);
  }
}
=======
/**
 * RunPiles.java
 * Run GameTree search for Piles (Grundy's game)
 * @author Phil Green
 * First Version 12/1/2004
 * */

import sheffield.*;
import java.util.*;
import java.math.*;

public class RunPiles
{
 public static void main(String[] arg) {
   // create objects for input and output
   EasyWriter scr = new EasyWriter();
   EasyWriter scrf = new EasyWriter("piles_results.txt");

   int[] ss = {15}; //init state

   PilesSearch psearch = new PilesSearch(); //the search engine
   GameSearchState initState = (GameSearchState) new PilesState(ss); //initial state - 1 pile of 5
   String ans = psearch.runGameSearch(initState); //run the search
   scr.println(ans);
  }
}
>>>>>>> 62145eca4e0b88139ae369a83bcbdfb25573182a
