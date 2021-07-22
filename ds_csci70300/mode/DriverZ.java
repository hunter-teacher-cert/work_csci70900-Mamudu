import java.io.*;
import java.util.*;

public class DriverZ{

    public static void main(String[] args) {
	long start,elapsed;
	int mode;
	ModeZ m = new ModeZ(100000);
	start = System.currentTimeMillis();
	mode = m.calcModeZ();
	//System.out.println(m);
	System.out.println(mode);
	elapsed = System.currentTimeMillis()-start;
	System.out.println(elapsed);
    }
    
}