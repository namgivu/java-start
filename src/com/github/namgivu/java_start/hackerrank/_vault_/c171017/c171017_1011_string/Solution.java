package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1011_string;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-strings-introduction/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1011_string";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B)>0? "Yes":"No");

		String A2 = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
		String B2 = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
		System.out.println(String.format("%s %s", A2, B2));
	}

}
