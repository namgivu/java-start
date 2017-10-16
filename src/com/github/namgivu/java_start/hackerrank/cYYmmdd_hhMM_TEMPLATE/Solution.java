package com.github.namgivu.java_start.hackerrank.cYYmmdd_hhMM_TEMPLATE;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/YOUR-CHALLENGE
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank";
	static String CHALLENGE_NAME	= "cYYmmdd_hhMM_TEMPLATE";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println(n);
		System.out.println(Arrays.toString(a));
	}

}
