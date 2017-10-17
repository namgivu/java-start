package com.github.namgivu.java_start.hackerrank._vault_.regex.c171017_1300_syntax_check;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_/regex";
	static String CHALLENGE_NAME = "c171017_1300_syntax_check";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		int i=0;
		while (i<testCases) {
			String pattern = scan.nextLine();
			i+=1;

			boolean ok;
			try {
				Pattern.compile(pattern);
				ok = true;
			} catch (Exception e) {
				ok = false;
			}

			System.out.println(ok?"Valid":"Invalid");
		}

	}

}
