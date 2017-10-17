package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1055_anagram;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-string-reverse
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME	= "c171017_1055_anagram";

	static boolean isAnagram(String a, String b) {
		//region function in function
		class UtilClass {
			public java.util.Map<String, Integer> countChar(String s) {
				java.util.Map<String, Integer> m = new java.util.HashMap<String, Integer>(); //python-alike dictionary in java ref. https://stackoverflow.com/questions/13543457/how-do-you-create-a-dictionary-in-java
				for (int i = 0; i < s.length(); i++) {
					String c = s.substring(i,i+1).toLowerCase();
					Integer v = m.get(c); //character 'c' appear 'v' times in string 's'
					if (v == null) { //not seen 'c' yet
						m.put(c, 1);
					} else {
						m.put(c, v+1);
					}
				}
				return m;
			}
		}
		UtilClass u = new UtilClass();
		//endregion function in function

		java.util.Map<String, Integer> countA = u.countChar(a);
		java.util.Map<String, Integer> countB = u.countChar(b);
		System.out.println(countA);
		System.out.println(countB);

		//region compare character maps
		if (countA.size()!=countB.size()) {
			return false;

		} else {//size/length is equal, we go deeper into each character
			//foreach java Map ref. https://stackoverflow.com/a/46908/248616
			boolean check = true;
			for (java.util.Map.Entry<String, Integer> en : countA.entrySet()) {
				String k = en.getKey();
				if (!countB.containsKey(k)) { //a character 'k' in 'a' but not in 'b'
					check=false;
					break;

				} else {
					Integer v = en.getValue();
					Integer v2 = countB.get(k);
					if (v!=v2) {
						check=false;
						break;
					}
				}
			}
			return check;
		}
		//endregion compare character maps
	}

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		System.out.println(isAnagram(a,b)? "Anagrams":"Not Anagrams");
	}

}
