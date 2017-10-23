package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171020_1400_array_list;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-list/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171020_1400_array_list";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			int ai = scan.nextInt();
			a.add(ai);
		}

		//run operators
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			String op = scan.next();
			if (false) {}

			else if (op.compareTo("Insert")==0) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				a.add(x, y);
			}
			else if (op.compareTo("Delete")==0) {
				int x = scan.nextInt();
				a.remove(x);
			}
		}

		//output
		a.forEach( i -> System.out.print(String.format("%d ", i)) );
		System.out.println();
	}

	//the end
}
