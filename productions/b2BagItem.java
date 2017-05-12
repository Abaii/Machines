/**
*@author Abai Edmund
*
*/
import java.util.*;
import java.io.*;
import sheffield.*;



public class b2BagItem extends Prodn{
  final static String name = "BAG-ITEM";
  final static String[] antes = {"step is change most efficient bag",
                                 "item to bag ?I space ?S",
                                "current bag no ?N space ?BS",
                                "most efficient bag no ?EN space ?ES",
                                "bag no 1 space ?BBS"};
  final static String[] adds = {"step is get next item",
                    "bag no ?EN contains ?I",
                    "bag no ?EN space ?RS",
                    "current bag no 1 space ?BBS"
                    };
  final static String[] dels = {"step is change most efficient bag",
                                "item to bag ?I space ?S",
                                "bag no ?EN space ?ES",
                            "current bag no ?N space ?BS"
                            };
  final static String[] remarks = {"?I in bag no ?EN"};


  public String getName(){return name;}
  public String[] getAntes() {return antes;}
  public String[] getAdds() {return adds;}
  public String[] getDels() {return dels;}
  public String[] getRemarks(){return remarks;}

  /**
  *Place item in bag if the bag number is valid. 
  */
  public boolean pred(HashMap c){
    Integer bagno = Integer.valueOf((String) c.get("?EN"));
    return (Integer.valueOf(bagno) != 0);

  }

  /**
  * Calculate the space remaining once an item has been bagged
  */
  public HashMap modifyContext(HashMap c){
		Integer spaceLeft = Integer.valueOf((String) c.get("?ES"));
		Integer spaceNeeded = Integer.valueOf((String) c.get("?S"));
		c.put("?RS", String.valueOf(spaceLeft.intValue()-spaceNeeded.intValue()));
		return c;}
}
