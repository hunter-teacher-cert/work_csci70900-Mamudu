// Brian Mueller
// Mamudu Wally
//Peter Tsun

import java.io.*;
import java.util.*;

public class SortDemoDriverT {
  public static void main(String[] args) {

    SortDemoT sd = new SortDemoT(); // default size: 15
    System.out.println(sd);

    SortDemoT sd2 = new SortDemoT(20);
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