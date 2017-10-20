package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171019_1644_1d_leap_game;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-1d-array/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171019_1644_1d_leap_game";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int qi = 0; qi < q; qi++) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}

			boolean hasWon = canWin(leap, a);
			System.out.println(hasWon?"YES":"NO");
		}

	}

	private static boolean canWin(int leap, int[] game) {
		ArrayList<Integer> C = new ArrayList<>(); //C for current cell
		ArrayList<Integer> nx;										//nx for next cell
		int n = game.length;
		boolean[] visit = new boolean[n]; //marking which cell is visited

		int i=0;
		C.add(i);
		visit[i]=true;
		boolean hasWon = false;
		int[] goNext = { -1, 1, leap };
		while (true) {
			//region finding

			//try to find new cells to leap next
			int iNext;
			nx = new ArrayList<>();
			for (Integer c: C) {
				//get victory?
				if (c+1>=n || c+leap>=n) {
					hasWon = true;
					break;
				}

				//can go i-1? i+1? i+leap?
				for (int gn: goNext) {
					iNext = c+gn;
					if (iNext>=0 && iNext<n && game[iNext]==0) { //iNext is within 'a' array and is zero
						if (!visit[iNext]) { //we only find new/unvisited cells to leap
							nx.add(iNext);
							visit[iNext]=true;
						}
					}
				}
			}

			if (hasWon) { break; }

			//cannot find new cells to leap => stop finding
			if (nx.size() == 0) { break; }

			//we found new cells, continue to look for next leap
			C = nx;

			//endregion finding
		}
		return hasWon;
	}

	//the end
}
