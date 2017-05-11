
import java.util.*;
import java.io.*;
import sheffield.*;



public class b2BagInFirst extends Prodn{
  final static String name = "BAG-ITEM-FIRST";
  final static String[] antes = {"step is change most efficient bag",
                                 "item to bag ?I space ?S",
                                "current bag no ?N space ?BS",
                                "most efficient bag no 1 space ?ES",
                                "bag no 1 space ?BBS"};
  final static String[] adds = {"step is get next item",
                    "bag no 1 contains ?I",
                    "bag no 1 space ?RS",
                    "current bag no 1 space ?RS"
                    };
  final static String[] dels = {"step is change most efficient bag",
                                "item to bag ?I space ?S",
                                "bag no 1 space ?ES",
                            "current bag no ?N space ?BS"
                            };
  final static String[] remarks = {"?I in bag no 1"};


  public String getName(){return name;}
  public String[] getAntes() {return antes;}
  public String[] getAdds() {return adds;}
  public String[] getDels() {return dels;}
  public String[] getRemarks(){return remarks;}


  public boolean pred(HashMap c){
    return true;

  }


  public HashMap modifyContext(HashMap c){
		Integer spaceLeft = Integer.valueOf((String) c.get("?ES"));
		Integer spaceNeeded = Integer.valueOf((String) c.get("?S"));
		c.put("?RS", String.valueOf(spaceLeft.intValue()-spaceNeeded.intValue()));
		return c;}
}
