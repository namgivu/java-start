package com.github.namgivu.java_start.hackerrank.cYYmmdd_hhMM_TEMPLATE;

import java.io.*;
import java.util.Scanner;


public class Solution {
	static String CHALLENGE_NAME	= "hackerrank/cYYmmdd_hhMM_TEMPLATE";
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";

	public static void main(String[] args) throws FileNotFoundException {
		//region io - redirect I/O to files
		String CHALLENGE_HOME	= String.format("%s/%s", CODE_HOME, CHALLENGE_NAME);
		String IO_FILE_INPUT		= String.format("%s/io/input.txt",  CHALLENGE_HOME);
		String IO_FILE_OUTPUT	= String.format("%s/io/output.txt", CHALLENGE_HOME);
		System.setIn(new FileInputStream(IO_FILE_INPUT)); //ref. https://stackoverflow.com/a/188654/248616
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(IO_FILE_OUTPUT)), true)); //ref. https://stackoverflow.com/a/2851254/248616
		//endregion io - redirect I/O to files

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
