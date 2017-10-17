package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_102_substring;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-substring/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_102_substring";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(s.substring(start,end));
	}

}
