/**
* prod1
* 2013 version
*/

import java.util.*;
import java.io.*;
import sheffield.*;

public class b2ChangeMostEfficient extends Prodn {
	final static String name = "CHANGE-MOST-EFFICIENT";
	final static String[] antes = {"step is get change most efficient bag",
	                               "current bag no ?N space ?S"};
	final static String[] adds = {"step is check bag",
							      						"most efficient bag no ?EN space ?ES"};
	final static String[] dels = {"step is check bag"};
	final static String[] remarks = {"changing most efficient bag "};


	public String getName(){return name;}
	public String[] getAntes() {return antes;}
	public String[] getAdds() {return adds;}
	public String[] getDels() {return dels;}
	public String[] getRemarks(){return remarks;}


	public boolean pred(HashMap c){
		return true;
	}
	public HashMap modifyContext(HashMap c){
		Integer bagno = Integer.valueOf((String) c.get("?N"));
		Integer space = Integer.valueOf((String) c.get("?S"));
		c.put("?EN", String.valueOf(bagno.intValue()));
		c.put("?ES", String.valueOf(space.intValue()));
		return c;}

}
