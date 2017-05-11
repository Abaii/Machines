import java.util.*;
import java.io.*;
import sheffield.*;

public class b2BagInCurrent extends Prodn {

  	final static String name = "BAG-IN-CURRENT";
  	final static String[] antes = {"step is bag item",
  	                               "item to bag ?I space ?S",
  	                               "bag no ?EN space ?BS"};
  	final static String[] adds = {"step is get next item",
                      "bag no ?EN space ?BS",
  							      "bag no ?EN contains ?I"
                      };
  	final static String[] dels = {"step is bag item",
  	                              "item to bag ?I space ?S",
  	                              "bag no ?EN space ?BS"};
  	final static String[] remarks = {"?I in bag no ?EN"};

  	public String getName(){return name;}
  	public String[] getAntes() {return antes;}
  	public String[] getAdds() {return adds;}
  	public String[] getDels() {return dels;}
  	public String[] getRemarks(){return remarks;}


  	public boolean pred(HashMap c){
  		return true;
    }

  	public HashMap modifyContext(HashMap c){
  		Integer spaceLeft = Integer.valueOf((String) c.get("?BS"));
  		Integer spaceNeeded = Integer.valueOf((String) c.get("?S"));
  		c.put("?RS", String.valueOf(spaceLeft.intValue()-spaceNeeded.intValue()));
      
      return c;}


}
