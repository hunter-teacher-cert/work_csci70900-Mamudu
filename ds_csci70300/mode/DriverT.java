//collaborators mamudu	wilsoneg3	mlaks23

import java.io.*;
import java.util.*;

public class DriverT{

    public static void main(String[] args) {
	      ModeT m = new ModeT();

	      System.out.println(m);

        //System.out.println("The smallest value is " + m.findSmallestValue() + ".");

        System.out.println("Your value occurs " + m.frequency(10) + " times.");

        System.out.println("Your mode is " + m.calcModeT() + ".");
    }

}
