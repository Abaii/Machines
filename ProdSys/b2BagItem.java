
import java.util.*;
import java.io.*;
import sheffield.*;



public class b2GetNextBag{
  final static String name = "BAG-ITEM";
  final static String[] antes = {"step is bag item",
                                 "item to bag ?I",
                                 "bag no ?EN"};
  final static String[] adds = {"step is get next item",
                    "bag no ?EN contains ?I"
                    };
  final static String[] dels = {"step is bag item",
                                "item to bag ?I",
                                "bag no ?EN"};
  final static String[] remarks = {"?I in bag no ?EN"};


  public String getName(){return name;}
  public String[] getAntes() {return antes;}
  public String[] getAdds() {return adds;}
  public String[] getDels() {return dels;}
  public String[] getRemarks(){return remarks;}


  public boolean pred(HashMap c){


  }
  }
  public HashMap modifyContext(HashMap c){
    int i = 1;
    c.put("?EN", String.valueOf(1))
}
