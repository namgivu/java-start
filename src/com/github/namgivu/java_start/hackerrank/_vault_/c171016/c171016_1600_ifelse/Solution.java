package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1600_ifelse;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-if-else/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171016";
	static String CHALLENGE_NAME	= "c171016_1600_ifelse";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String result="";
		/*
		If n is odd, print Weird
		If n is even and in the inclusive range of 2 to 5, print Not Weird
		If n is even and in the inclusive range of 6 to 20, print Weird
		If n is even and greater than 20, print Not Weird
		*/
		if (false) {

		} else if (n%2==1) {
			result = "Weird";

		} else if (n%2==0 && n>=2 && n<=5) {
			result = "Not Weird";

		} else if (n%2==0 && n>=6 && n<=20) {
			result = "Weird";

		} else if (n%2==0 && n>20) {
			result = "Not Weird";
		}

		System.out.println(result);
	}

}
