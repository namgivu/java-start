package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1600_big_num;

import com.github.namgivu.java_start.util.Util;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-biginteger/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1600_big_num";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		BigInteger a = new BigInteger(s1);
		BigInteger b = new BigInteger(s2);
		BigInteger sum = a.add(b);
		BigInteger mul = a.multiply(b);
		System.out.println(sum);
		System.out.println(mul);
	}

}
