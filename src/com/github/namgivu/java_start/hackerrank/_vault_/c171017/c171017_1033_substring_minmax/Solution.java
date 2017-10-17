package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1033_substring_minmax;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-substring/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1033_substring_minmax";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		int len_k = s.length()-k;
		String minStr = "";
		String maxStr = "";
		for (int i = 0; i <= len_k; i++) {
			String t = s.substring(i,i+k);
			if (minStr=="" || t.compareTo(minStr)<0) {
				minStr = t;
			}
			if (maxStr=="" || t.compareTo(maxStr)>0) {
				maxStr = t;
			}
		}
		System.out.println(minStr);
		System.out.println(maxStr);
	}

}
