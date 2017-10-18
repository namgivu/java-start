package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171018_1100_prime_check;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/YOUR-CHALLENGE
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171018_1100_prime_check";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		BigInteger number = new BigInteger(n);

		System.out.println(isPrime(number)?"prime":"not prime");
	}


	//region prime check solutions

	/**
	 * prime check ref. https://stackoverflow.com/a/32035942/248616
	 */

	static boolean isPrime(BigInteger number) {
		return isPrime_JuanLopes(number); //this is slow and get timeout-terminated by hackerrank
		//return isPrime_AJNatural(number);
	}

	/**
	 * prime check by JuanLopes ref. https://stackoverflow.com/a/32035942/248616
	 */
	static boolean isPrime_JuanLopes(BigInteger number) {
		//TODO still get terminated by timeout, need improved!
		//check via BigInteger.isProbablePrime()
		if (!number.isProbablePrime(5)) {
			return false;
		}

		//check if even
		BigInteger two = new BigInteger("2");
		if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two))) {
			return false;
		}

		//find divisor if any from 3 to 'number'
		BigInteger i = new BigInteger("3");
		for (; i.multiply(i).compareTo(number) < 1; i = i.add(two)) {//start from 3, 5, etc. the odd number, and look for a divisor if any
			if (BigInteger.ZERO.equals(number.mod(i))) {//check if 'i' is divisor of 'number'
				return false;
			}
		}

		//all checked, it's a prime
		return true;
	}

	//endregion prime check solutions

	//the end
}
