package com.github.namgivu.java_start.hackerrank._vault_.c171016_1600_ifelse;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-if-else/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1600_ifelse";

	public static void main(String[] args) throws FileNotFoundException {
		//region io - redirect I/O to files
		String CHALLENGE_HOME	= String.format("%s/%s/%s", CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);
		String IO_FILE_INPUT		= String.format("%s/io/input.txt",  CHALLENGE_HOME);
		String IO_FILE_OUTPUT	= String.format("%s/io/output.txt", CHALLENGE_HOME);
		System.setIn(new FileInputStream(IO_FILE_INPUT)); //ref. https://stackoverflow.com/a/188654/248616
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(IO_FILE_OUTPUT)), true)); //ref. https://stackoverflow.com/a/2851254/248616
		//endregion io - redirect I/O to files

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String result="";
		/*
		If n is odd, print Weird
		If n is even and in the inclusive range of 2 to 5, print Not Weird
		If n is even and in the inclusive range of 6 to 20, print Weird
		If n is even and greater than 20, print Not Weird
		*/
		if (false) {

		} else if (n%2==1) {
			result = "Weird";

		} else if (n%2==0 && n>=2 && n<=5) {
			result = "Not Weird";

		} else if (n%2==0 && n>=6 && n<=20) {
			result = "Weird";

		} else if (n%2==0 && n>20) {
			result = "Not Weird";
		}

		System.out.println(result);
	}

}
