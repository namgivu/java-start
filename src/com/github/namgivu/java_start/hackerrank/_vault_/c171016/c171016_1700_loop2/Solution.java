package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1700_loop2;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-loops/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171016";
	static String CHALLENGE_NAME	= "c171016_1700_loop2";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		//a + 2^0*b + 2^1*b + ... + 2^(n-1)*b
		Scanner scan = new Scanner(System.in);
		int totalQuery = scan.nextInt();
		for (int q = 0; q < totalQuery; q++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();

			int e2 = 1;
			int s = a + e2*b;
			System.out.print(String.format("%d ",s));
			for (int i = 1; i < n; i++) {
				e2 = e2*2;
				s  = s + e2*b;
				System.out.print(String.format("%d ",s));
			}
			System.out.println();
		}
	}

}
