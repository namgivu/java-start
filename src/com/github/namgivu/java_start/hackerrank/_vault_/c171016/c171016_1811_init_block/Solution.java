package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1811_init_block;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-end-of-file/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171016";
	static String CHALLENGE_NAME	= "c171016_1811_init_block";

	static Boolean flag = false;
	static int B;
	static int H;
	static {
		try {
			Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();

		flag = B>0 && H>0;

		if (!flag) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		if (flag) {
			int area = B*H;
			System.out.print(area);
		}
	}

}
