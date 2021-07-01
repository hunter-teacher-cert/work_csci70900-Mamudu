import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Method {

	public static boolean isDivisible(int n, int m){
    
		if(n%m==0){
			return true;
		}else{
			return false;
		}
    
	}

	public boolean isTriangle(int a, int b, int c){
    

		if(a>(b+c)){
			return false;
		}else if(b>(a+c)){
			return false;
		}else if(c>(a+b)){
			return false;
		}else{
			return true;
		
    }
	}	

	public static int ack(int m, int n){
		if(m==0){
			return n+1;
		}else if(m>0 && n==0){
			return ack(m-1,1);
		}else{
			return ack(m-1, ack(m,n-1));
		}
	}

    public static void main(String[] args){
		int p = ack(1,2);

    
    /*System.out.println("Enter the value of n: ");
    Scanner input = new Scanner(System.in);
    int n;
    n = in.nextInt();

    System.out.println("Enter the value of m: ");
    Scanner input = new Scanner(System.in);
    int m;
    int m = in.nextInt();

    System.out.println("Enter the value of a: ");
    Scanner input = new Scanner(System.in);
    int a;
    int a = in.nextInt();
    System.out.println("Enter the value of b: ");
    Scanner input = new Scanner(System.in);
    int b;
    int b = in.nextInt();
    System.out.println("Enter the value of c: ");
    Scanner input = new Scanner(System.in);
    int c;
    int c = in.nextInt();
    */

		System.out.println("This is it: "+ p);
    }
  
  
} 