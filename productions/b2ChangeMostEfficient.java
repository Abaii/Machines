/**
* prod1
* 2013 version
*/

import java.util.*;
import java.io.*;
import sheffield.*;

public class b2ChangeMostEfficient extends Prodn {
	final static String name = "CHANGE-MOST-EFFICIENT";
	final static String[] antes = {"step is change most efficient bag",
	                               "current bag no ?N space ?BS",
															 	"item to bag ?I space ?S",
																"most efficient bag no ?EN space ?ES"};
	final static String[] adds = {"most efficient bag no ?N space ?BS"};
	final static String[] dels = {"most efficient bag no ?EN space ?ES"};
	final static String[] remarks = {"changing most efficient bag "};


	public String getName(){return name;}
	public String[] getAntes() {return antes;}
	public String[] getAdds() {return adds;}
	public String[] getDels() {return dels;}
	public String[] getRemarks(){return remarks;}

	/**
	* Calculate the most efficient bag to place the item in
	* Most efficient if theres enough space for the item to fit and
	* the bag has the smallest amount of space available compared to the other
	* bags in memory that also have enough space for the item to fit. 
	*/
	public boolean pred(HashMap c){
		Integer spaceLeft = Integer.valueOf((String) c.get("?BS"));
	 Integer spaceNeeded = Integer.valueOf((String) c.get("?S"));
	 Integer efficientSpace = Integer.valueOf((String) c.get("?ES"));
	 return (spaceLeft.intValue()>=
					 spaceNeeded.intValue() && spaceLeft.intValue() < efficientSpace.intValue());
	}
	public HashMap modifyContext(HashMap c){
		return c;}

}
