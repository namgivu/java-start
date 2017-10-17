package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1822_itos;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-int-to-string/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171016";
	static String CHALLENGE_NAME	= "c171016_1822_itos";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String s = Integer.toString(i);
		int n = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(i==n);
	}

}
