// Brian Mueller
// Mamudu Wally
//Peter Tsun
//Lyuba Fridman

import java.io.*;
import java.util.*;

public class SortDemoDriverT1 {
  public static void main(String[] args) {

    SortDemoT1 sd = new SortDemoT1(); // default size: 15
    System.out.println(sd);

    SortDemoT1 sd2 = new SortDemoT1(20);
    System.out.println(sd2);

    /* part 2 test lines */

    int i;
    i = sd.findSmallestIndex(10);
    System.out.println("sd["+ i + "] = "+sd.get(i)+" : " + sd);

    i = sd2.findSmallestIndex(15);
    System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);


    /* part 3 test lines */

    System.out.println(sd);
    sd.sort();
    System.out.println(sd);

  }
}