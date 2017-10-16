package com.github.namgivu.java_start.hackerrank._vault_.c171016_1100_inout;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1100_inout";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
