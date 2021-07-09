import java.io.*;
import java.util.*;

public class Date {
	public static void main(String[] args) {
		String date = "Friday";
		int day = 18;
		String month = "June";
		int year = 2021;
		System.out.println("American format:");
		//System.out.print("Today's date is ");
		System.out.print(date + ", ");
		System.out.print(month + " ");
		System.out.print(day + ", ");
		System.out.println(year);

		System.out.println("European format:");
		System.out.print(date + " ");
		System.out.print(day + " ");
		System.out.print(month + " ");
		System.out.println(year);
	}
}