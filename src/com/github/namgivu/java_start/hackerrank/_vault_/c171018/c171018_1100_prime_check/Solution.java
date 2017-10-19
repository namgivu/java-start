package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171018_1100_prime_check;

import com.github.namgivu.java_start.util.Util;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-primality-test/problem
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
	 * prime check MAIN
	 */
	static boolean isPrime(BigInteger number) {
		//return isPrime_JuanLopes(number); //this is slow and get timeout-terminated by hackerrank
		return isPrime_AJNatural(number); //TODO hope this approach may pass the timeout
	}


	/**
	 * prime check by JuanLopes ref. https://stackoverflow.com/a/32035942/248616
	 */
	static boolean isPrime_JuanLopes(BigInteger number) {
		//This get terminated by timeout, need improved!
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


	/**
	 * prime check by AJNatural ref. https://stackoverflow.com/a/3886003/248616
	 */
	static boolean isPrime_AJNatural(BigInteger number) {
		/*
		def isPrime(number):
			if number == 2: return True
			if number < 2 or number % 2 == 0: return False
			return not any(number % i == 0 for i in range(3, int(sqrt(number)) + 1, 2))
		 */
		BigInteger two = new BigInteger("2");
		if (number.compareTo(two) == 0) { return true; }
		if (number.compareTo(two)<0 || number.mod(two).compareTo(BigInteger.ZERO)==0) { return false; }

		/**
		 *sqrt for BigInteger ref. https://stackoverflow.com/a/16804098/248616
		 */
		class util {
			BigInteger SqrtBigInteger(BigInteger x) {
				BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
				BigInteger div2 = div;
				// Loop until we hit the same value twice in a row, or wind up alternating.
				for(;;) {
					BigInteger y = div.add(x.divide(div)).shiftRight(1);
					if (y.equals(div) || y.equals(div2))
						return y;
					div2 = div;
					div = y;
				}
			}
		}

		BigInteger n = new util().SqrtBigInteger(number);
		boolean isPrime = true;
		for (BigInteger i=new BigInteger("3"); i.compareTo(n)<=0; i=i.add(two)) {
			if (number.mod(i).compareTo(BigInteger.ZERO)==0) {
				isPrime=false;
				break;
			}
		}

		return isPrime;
	}


	//endregion prime check solutions

	//the end
}
