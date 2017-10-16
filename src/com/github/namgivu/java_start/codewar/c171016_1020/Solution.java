package com.github.namgivu.java_start.codewar.c171016_1020;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "codewar";
	static String CHALLENGE_NAME	= "cYYmmdd_hhMM_TEMPLATE";

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
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println(n);
		System.out.println(Arrays.toString(a));
	}

}
