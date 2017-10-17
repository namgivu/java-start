package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1611_bnum_sort;

import com.github.namgivu.java_start.util.Util;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-bigdecimal/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1611_bnum_sort";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[]s = new String[n];
		for (int i = 0; i < n; i++) {
			String l = scan.nextLine();
			s[i] = l;
		}

		//the challenge force us to start here with n, s
		class Elem {
			int 				index; //index in array 's' as input
			String			text;	 //value in array 's' as input
			BigDecimal	big;	 //value as big number type
		}

		List<Elem> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Elem e = new Elem();
			e.index	= i;
			e.text	= s[i];
			e.big		= new BigDecimal(e.text);
			arr.add(e);
		}

		//sort
		for (int i = 0; i < n; i++) {
			Elem ei = arr.get(i);
			for (int j = i+1; j < n; j++) {
				Elem ej = arr.get(j);
				if (ei.big.compareTo(ej.big)<0) {
					arr.set(i, ej); arr.set(j, ei); ei = ej; //swap ei vs ej
				} else if (ei.big.compareTo(ej.big)==0) {
					if (ei.index>ej.index) {
						arr.set(i, ej); arr.set(j, ei); ei = ej; //swap ei vs ej
					}
				}
			}
		}

		//output
		for (int i = 0; i < n; i++) {
			s[i] = arr.get(i).text;
		}

		//the challenge force us to output using s
		for (String e: s) {
			System.out.println(e);
		}
	}

}
