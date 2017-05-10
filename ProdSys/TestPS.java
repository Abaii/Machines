
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
      bagger2.add(new b2BagInCurrent());
      bagger2.add(new b2StartNewBag());


   //initial facts

   ArrayList<String> stm = new ArrayList<String>();
   stm.add("step is start bagging");
   stm.add("trolley contains bread space 30");
   stm.add("trolley contains spuds space 50");
   stm.add("trolley contains cornflakes space 40");

   TrolleyGen tg = new TrolleyGen(12345,10);
   String[] trolley= tg.fillTrolley();
   //prod sys engine

   ProdSys ps=new ProdSys(bagger2);

   ArrayList<String> res=ps.RunPS(stm);
   scr.println("final STM ");
   scr.println(res);
  }
}
