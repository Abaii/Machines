<<<<<<< HEAD
/**
* b1Start_new_bag
* bagger 1 prodns
* start a new bag
* 2013 version
*/

import java.util.*;
import java.io.*;
import sheffield.*;

public class b1StartNewBag extends Prodn {
	final static String name = "START-NEW-BAG";
	final static String[] antes = {"step is bag item",
	                               "current bag no ?N space ?BS"};
	final static String[] adds = {"current bag no ?NB space 100"};
	final static String[] dels = {"current bag no ?N space ?BS"};
	final static String[] remarks = {"Starting bag ?NB"};


	public String getName(){return name;}
	public String[] getAntes() {return antes;}
	public String[] getAdds() {return adds;}
	public String[] getDels() {return dels;}
	public String[] getRemarks(){return remarks;}


	public boolean pred(HashMap c){return true;}

	public HashMap modifyContext(HashMap c){
		Integer bagno = Integer.valueOf((String) c.get("?N"));
		c.put("?NB", String.valueOf(bagno.intValue()+1));
		return c;}

=======
/**
* b1Start_new_bag
* bagger 1 prodns
* start a new bag
* 2013 version
*/

import java.util.*;
import java.io.*;
import sheffield.*;

public class b1StartNewBag extends Prodn {
	final static String name = "START-NEW-BAG";
	final static String[] antes = {"step is bag item",
	                               "current bag no ?N space ?BS"};
	final static String[] adds = {"current bag no ?NB space 100"};
	final static String[] dels = {"current bag no ?N space ?BS"};
	final static String[] remarks = {"Starting bag ?NB"};


	public String getName(){return name;}
	public String[] getAntes() {return antes;}
	public String[] getAdds() {return adds;}
	public String[] getDels() {return dels;}
	public String[] getRemarks(){return remarks;}


	public boolean pred(HashMap c){return true;}

	public HashMap modifyContext(HashMap c){
		Integer bagno = Integer.valueOf((String) c.get("?N"));
		c.put("?NB", String.valueOf(bagno.intValue()+1));
		return c;}

>>>>>>> 62145eca4e0b88139ae369a83bcbdfb25573182a
}
