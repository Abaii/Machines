
/**
* TestPS
* testing prodn systems
* 2013 Version
*/

import sheffield.*;
import java.util.*;
import java.math.*;
import pmatch.*;

public class TestPS
{
 public static void main(String[] arg) {
   // create objects for input and output
   EasyWriter scr = new EasyWriter();

      ArrayList<Prodn> bagger2 = new ArrayList<Prodn>(); //make the bagger1 rules
      bagger2.add(new b2Start());
      bagger2.add(new b2GetNextItem());
      bagger2.add(new b2ChangeMostEfficient());
      bagger2.add(new b2GetNextBag());
      bagger2.add(new b2BagInFirst());
      bagger2.add(new b2BagItem());
      bagger2.add(new b2StartNewBag());


   //initial facts

   ArrayList<String> stm = new ArrayList<String>();
   stm.add("step is start bagging");

   TrolleyGen tg = new TrolleyGen(13245,500);
   String[] trolley= tg.fillTrolley();
   //prod sys engine
   for (int i = 0; i < trolley.length; i++){
     stm.add(trolley[i]);
   }
   ProdSys ps=new ProdSys(bagger2);

   ArrayList<String> res=ps.RunPS(stm);
   scr.println("final STM ");
   scr.println(res);
  }
}
