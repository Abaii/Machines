
import java.util.*;
import java.io.*;
import sheffield.*;



public class b2GetNextBag{
  final static String name = "GET-NEXT-BAG";
  final static String[] antes = {"step is get the next bag",
                                "most efficient bag no ?EN space ?ES"};
  final static String[] adds = {"step is get next bag",
                                "Item ?I has space ?S"
                                "most efficient bag is no ?EN space ?RS "};
  final static String[] dels = {"step is get next bag",
                                "Item ?I has space ?S"};
  final static String[] remarks = {"changing most efficient bag no"};


  public String getName(){return name;}
  public String[] getAntes() {return antes;}
  public String[] getAdds() {return adds;}
  public String[] getDels() {return dels;}
  public String[] getRemarks(){return remarks;}


  public boolean pred(HashMap c){
    

  }
  }
  public HashMap modifyContext(HashMap c){
    //increase the most efficient bag number by 1
    Integer bagno = Integer.valueOf((String) c.get("?EN"));
		c.put("?EN", String.valueOf(bagno.intValue()+1));
      return c;}
}
