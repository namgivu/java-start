package com.github.namgivu.java_start.hackerrank._vault_.c171016.c171016_1755_data_type;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-datatypes/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_";
	static String CHALLENGE_NAME = "c171016_1755_data_type";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int totalTestcase = scan.nextInt();
		for (int t = 0; t < totalTestcase; t++) {
			try {

				long i = scan.nextLong();
				System.out.println(i + " can be fitted in:");

				List<String> outputs = new ArrayList<>();

				if (Byte.MIN_VALUE<=i			&&	i<=Byte.MAX_VALUE) 		{ outputs.add("byte"); }
				if (Short.MIN_VALUE<=i		&&	i<=Short.MAX_VALUE) 	{ outputs.add("short"); }
				if (Integer.MIN_VALUE<=i	&&	i<=Integer.MAX_VALUE) { outputs.add("int"); }
				if (Long.MIN_VALUE<=i			&&	i<=Long.MAX_VALUE) 		{ outputs.add("long"); }

				for (String output: outputs) {
					System.out.println(String.format("* %s", output));
				}

			} catch (Exception e) {
				System.out.println(scan.next() + " can't be fitted anywhere.");
			}
		}
	}

}
