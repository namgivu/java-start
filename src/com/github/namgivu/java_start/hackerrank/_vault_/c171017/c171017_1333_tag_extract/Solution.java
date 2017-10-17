package com.github.namgivu.java_start.hackerrank._vault_.c171017.c171017_1333_tag_extract;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/tag-content-extractor/problem
	static String CODE_HOME = "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER = "hackerrank/_vault_/c171017";
	static String CHALLENGE_NAME = "c171017_1333_tag_extract";


	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		int i=0;
		while (i<testCases) {
			String line = scan.nextLine();
			i += 1;

			//regex in java usage ref. https://www.hackerrank.com/challenges/duplicate-word
			//- declare regex matcher 'm'
			//- matcher 'm' usage 1) m.find(), 2) m.group(1)
//			String regex = "<[^>]+>([^<]+?)</[^>]+>"; Pattern p = Pattern.compile(regex); Matcher m = p.matcher(line);
			String regex = "<([^>]+)>([^<]+?)</\\1>"; Pattern p = Pattern.compile(regex); Matcher m = p.matcher(line);

			List<String> values = new ArrayList<String>();
			boolean found=false;
			while (m.find()) {
				String tagName = m.group(1);
				String tagContent = m.group(2);
				values.add(tagContent);
				found=true;
			}

			if (found) {
				values.forEach(v -> System.out.println(v));
			} else {
				System.out.println("None");
			}
		}

		//the end
	}

}
