package com.github.namgivu.java_start.hackerrank._vault_.c171016_1611_type_printing;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-stdin-stdout/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1611_type_printing";

	public static void main(String[] args) throws FileNotFoundException {
		//region io - redirect I/O to files
		String CHALLENGE_HOME	= String.format("%s/%s/%s", CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);
		String IO_FILE_INPUT		= String.format("%s/io/input.txt",  CHALLENGE_HOME);
		String IO_FILE_OUTPUT	= String.format("%s/io/output.txt", CHALLENGE_HOME);
		System.setIn(new FileInputStream(IO_FILE_INPUT)); //ref. https://stackoverflow.com/a/188654/248616
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(IO_FILE_OUTPUT)), true)); //ref. https://stackoverflow.com/a/2851254/248616
		//endregion io - redirect I/O to files

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Double d = scan.nextDouble();
		scan.nextLine(); //skip empty value by int/double lines
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
