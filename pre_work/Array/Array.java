import java.io.*;
import java.util.*;

public class Array {

	public static void print(Object s){
		System.out.print(s);
	}
	public static void println(Object s){
		System.out.println(s);
	}
	public static void printArrayD(double[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}

		System.out.println("}");
	}

	public static void printArrayI(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}

		System.out.println("}");
	}

	public static void printArrayB(boolean[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}

		System.out.println("}");
	}


	//1 The first part
	public static double[] powArray(double[] a, int n){
		double[] newArr = new double[a.length]; 
		for(int i = 0; i < a.length; i++){
			newArr[i] = Math.pow(a[i],n);
		}
		return newArr;
	}

	public static int[] histogram(int[] a, int counters){
		int[] hist = new int[counters];
		for(int i = 0; i < hist.length; i++){
			hist[i] = 0;
			for(int j = 0; j < a.length; j++){
				if(a[j]==i){
					hist[i] = hist[i] + 1;
				}
			}
		}
		return hist;
	}
	//4
	//Got some assistance on this
	public static int indexOfMax(int[] a){
		int index = 0;
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i]>max){
				index = i;
				max = a[i];
			}
		}
		return index;
	}

	//5
	//Got some help
	public static boolean checkPrime(int n){
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

	public static boolean[] sieve(int n){
		boolean[] b = new boolean[n];
		for(int i = 0; i < n; i++){
			b[i] = checkPrime(i);
		}
		return b;
	}

    public static void main(String[] args){
		double[] a = {1.0,2.0,3.0,4.0,5.0};
		printArrayD(powArray(a,2));
		int[] b = {1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,66,77,77,99};
		printArrayI(histogram(b, 100));

		println(indexOfMax(b));

		printArrayB(sieve(99));
    }
} 