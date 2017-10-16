package com.github.namgivu.java_start.hackerrank._vault_.c171016_1622_output_format;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-output-formatting/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_";
	static String CHALLENGE_NAME = "c171016_1622_output_format";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for (int line = 0; line < 3; line++) {
			String s = scan.next();
			int i = scan.nextInt();
			System.out.println(String.format("%-15s%03d", s, i));
		}
		System.out.println("================================");
	}

}