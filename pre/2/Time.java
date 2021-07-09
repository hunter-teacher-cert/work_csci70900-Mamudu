import java.io.*;
import java.util.*;

public class Time {
	public static void main(String[] args) {

		int hour = 18;
		int minute = 26;
		int second = 40;
		float percentOfDayPassed;

		int numberOfSecondsSinceMidnight = 3600 * hour + 60 * minute + second;
		System.out.println("The number of seconds since midnight: " + numberOfSecondsSinceMidnight + " seconds");
		int numberOfSecondsRemainingInTheDay = 3600 * 24 - numberOfSecondsSinceMidnight;
		System.out.println("The number of seconds remaining in the day: " + numberOfSecondsRemainingInTheDay + " seconds");
		percentOfDayPassed = (float) numberOfSecondsSinceMidnight *100 / (3600 * 24);
		System.out.println("The percentage of the day that has passed: " + percentOfDayPassed + " %");

		hour = 19;
		minute = 10;
		second = 30;

		int elapsedTime = 3600 * hour + 60 * minute + second - numberOfSecondsSinceMidnight;
		System.out.println("THe elapsed time since starting this exercise is " + elapsedTime + " seconds");
	
	}

}