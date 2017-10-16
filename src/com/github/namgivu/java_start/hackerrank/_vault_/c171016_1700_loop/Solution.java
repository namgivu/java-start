package com.github.namgivu.java_start.hackerrank._vault_.c171016_1700_loop;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-loops-i/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_";
	static String CHALLENGE_NAME	= "c171016_1700_loop";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			//N x i = result
			int mul = N*i;
			System.out.println(String.format("%d x %d = %d", N, i, mul));
		}
	}

}
