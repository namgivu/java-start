package com.github.namgivu.java_start.hackerrank._vault_.c171016_1800_eof;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-end-of-file/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1800_eof";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int i=1;
		while (scan.hasNext()) {
			String l = scan.nextLine();
			System.out.println(String.format("%d %s", i, l));
			i+=1;
		}
	}

}
