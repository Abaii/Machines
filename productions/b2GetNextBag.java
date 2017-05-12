/**
*@author Abai Edmund
*/
import java.util.*;
import java.io.*;
import sheffield.*;



public class b2GetNextBag extends Prodn{
  final static String name = "GET-NEXT-BAG";
  final static String[] antes = {"step is change most efficient bag",
                                "current bag no ?N space ?BS",
                                "bag no ?NN space ?BSS"};
  final static String[] adds = {"current bag no ?NN space ?BSS"};
  final static String[] dels = {"current bag no ?N space ?BS"};
  final static String[] remarks = {"changing most efficient bag no"};


  public String getName(){return name;}
  public String[] getAntes() {return antes;}
  public String[] getAdds() {return adds;}
  public String[] getDels() {return dels;}
  public String[] getRemarks(){return remarks;}

  public boolean pred(HashMap c){
    Integer bagno = Integer.valueOf((String) c.get("?N"));
    Integer newbagno = Integer.valueOf((String) c.get("?NN"));
    return (bagno == newbagno -1);

  }
  public HashMap modifyContext(HashMap c){
    return c;
  }
}
