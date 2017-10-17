package com.github.namgivu.java_start.hackerrank._vault_.regex.c171017_1322_check_user;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"; //ref. https://stackoverflow.com/a/6782475/248616
}

public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/valid-username-checker/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_/regex";
	static String CHALLENGE_NAME = "c171017_1322_check_user";



	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);


		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String userName = in.nextLine();
			boolean isMatched = userName.matches(UsernameValidator.regularExpression);
			System.out.println(isMatched?"Valid":"Invalid");
		}

	}

}
