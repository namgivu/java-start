package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1300_string_token;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-string-reverse
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1300_string_token";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] tokens = s.split(" |!|,|\\?|\\.|_|'|@", -1); //split by multiple delimiters ref. https://stackoverflow.com/a/41247883/248616

		List<String> r = new ArrayList<>(); //list in java ref. https://stackoverflow.com/questions/858572/how-to-make-a-new-list-in-java
		for (String t: tokens) {
			if (!t.isEmpty()) { r.add(t); }
		}
		System.out.println(r.size());
		r.forEach(t -> System.out.println(t) ); //one-line print list/array ref. https://stackoverflow.com/a/12887865/248616
	}

}
