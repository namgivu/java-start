package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1833_datetime;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-date-and-time/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171016";
	static String CHALLENGE_NAME	= "c171016_1833_datetime";

	public static String getDay(String dd, String mm, String yyyy) {
		int year	= Integer.parseInt(yyyy);
		int month	= Integer.parseInt(mm);
		int day		= Integer.parseInt(dd);

		//get weekday from dd mm yyyy ref. https://stackoverflow.com/a/33895008/248616
		LocalDate ld = LocalDate.of(year, month, day);
		DayOfWeek dow = ld.getDayOfWeek();
		String output = dow.getDisplayName(TextStyle.FULL, Locale.US);

		return output.toUpperCase();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String mm = scan.next();
		String dd = scan.next();
		String yyyy = scan.next();
		System.out.println(getDay(dd, mm, yyyy));
	}

}
