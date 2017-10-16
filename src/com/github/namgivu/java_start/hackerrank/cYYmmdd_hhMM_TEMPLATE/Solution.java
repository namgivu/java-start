package com.github.namgivu.java_start.hackerrank.cYYmmdd_hhMM_TEMPLATE;

import java.io.*;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		//region io - redirect to files
		String IO_FILE_INPUT	= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start/hackerrank/cYYmmdd_hhMM_TEMPLATE/io/input.txt";
		String IO_FILE_OUTPUT	= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start/hackerrank/cYYmmdd_hhMM_TEMPLATE/io/output.txt";
		System.setIn(new FileInputStream(IO_FILE_INPUT)); //ref. https://stackoverflow.com/a/188654/248616
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(IO_FILE_OUTPUT)), true)); //ref. https://stackoverflow.com/a/2851254/248616
		//endregion io - redirect to files

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
