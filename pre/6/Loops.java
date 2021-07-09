import java.io.*;
import java.util.*;

public class Loops {

	public static void print(Object s){
		System.out.print(s);
	}
	public static void println(Object s){
		System.out.println(s);
	}
	//3
	public static double power(double x, int n){
		double value = x;
		for(int i =0;i<n;i++){
			value = value*x;
		}
		return value;
	}
	//4
	public static int factorial(int n){
		int value = 1;
		for(int i=1;i<=n;i++){
			value = value*n;
		}
		return value;
	}
	//5
	public static double myexp(double x, int n){
		double value = 1;

		double num = 1;
		int den = 1;

		for(int i=1;i<=n;i++){
			num = num*x;
			den = den*i;
			value = value + (num/den);
		}
		return value;
	}

	public static void check(double x, int n){
		print(x);
		print("     ");
		print(myexp(x,n));
		print("     ");
		println(Math.exp(x));
	}

    public static void main(String[] args){
		check(1,14);
		check(3,10);
		for(double i = .1;i<=100;i=i*10.0){
			check(i,5);
		}
		//varies a lot maybe because negatives adding to positives
		for(double i = .1;i<=100;i=i*10.0){
			check((-1.0*i),5);
		}
    }
} 