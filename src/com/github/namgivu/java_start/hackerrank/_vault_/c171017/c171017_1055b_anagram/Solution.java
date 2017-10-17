package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1055b_anagram;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-string-reverse
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1055b_anagram";

	static boolean isAnagram(String a, String b) {
		//sort string ref. https://stackoverflow.com/a/28820537/248616
		String sortedA = a.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		String sortedB = b.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		return sortedA.equals(sortedB);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		System.out.println(isAnagram(a,b)? "Anagrams":"Not Anagrams");
	}

}
