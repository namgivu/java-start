package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171019_1633_array_list;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-arraylist/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171019_1633_array_list";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList< ArrayList<Integer> > a = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			//region read 01 row
			int m = scan.nextInt();
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				int num = scan.nextInt();
				row.add(num);
			}
			a.add(row);
			//endregion read 01 row
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			try {
				ArrayList<Integer> rowx = a.get(x-1);
				int v = rowx.get(y-1);
				System.out.println(v);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

	}

	//the end
}
