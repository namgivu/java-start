package com.github.namgivu.java_start.hackerrank._vault_.regex.c171017_1311_regex_replace;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/duplicate-word/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_/regex";
	static String CHALLENGE_NAME = "c171017_1311_regex_replace";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);


		String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+"; //ref. https://stackoverflow.com/a/37143875/248616
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequents of input that match the compiled pattern
			while (m.find()) {
				String matchedText = m.group(0);
				String groupedText = m.group(1);
				input = input.replaceAll(matchedText, groupedText);
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

	}

}
