package com.github.namgivu.java_start.hackerrank._vault_.c171016_1844_currency;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-currency-formatter/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1844_currency";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();

		String us			=	NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china	=	NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france	=	NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		String india	=	NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment); //locale for India ref. https://stackoverflow.com/a/5379337/248616

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
