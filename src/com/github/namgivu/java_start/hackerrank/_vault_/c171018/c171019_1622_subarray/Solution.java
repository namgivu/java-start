package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171019_1622_subarray;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-2d-array/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171019_1622_subarray";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int count = 0;

		for (int len=1; len<=n; len++) {
			for (int start=0; start<=n-len; start++) {
				int sum = 0;
				for (int i=0; i<len; i++) {
					sum += a[start+i];
				}
				if (sum<0) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

	//the end
}
