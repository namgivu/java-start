package com.github.namgivu.java_start.hackerrank._vault_.c171018.c171019_1611_array_2d;

import com.github.namgivu.java_start.util.Util;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution {

	//challenge ref. https://www.hackerrank.com/challenges/java-2d-array/problem
	static String CODE_HOME 			= "/home/namgvu/NN/code/java-start/src/com/github/namgivu/java_start";
	static String VAULT_FOLDER		= "hackerrank/_vault_/c171018";
	static String CHALLENGE_NAME	= "c171019_1611_array_2d";

	public static void main(String[] args) throws FileNotFoundException {
		Util.redirectIO(CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);

		Scanner scan = new Scanner(System.in);
		int N = 6;
		int[][] a = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int val = scan.nextInt();
				a[i][j] = val;
			}
		}

		class duo {//duo returned values as in golang
			duo(int v, boolean e) { this.value=v; this.err=e; }
			int value;
			boolean err;
		}
		class util {
			duo sumHourGlass(int[][] a, int N, int i, int j) {
				int s = 0;
				int[] di = {0,0,0,1,2,2,2};
				int[] dj = {0,1,2,1,0,1,2};
				int n = di.length;
				for (int h=0; h<n; h++) {
					int ii=i+di[h];
					int jj=j+dj[h];
					if (ii>=0 && jj>=0 && ii<N && jj<N) {
						s += a[ii][jj];
					} else {
						return new duo(0,true);
					}
				}
				return new duo(s,false);
			}
		}

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				duo sum = new util().sumHourGlass(a, N, i,j);
				if (!sum.err) {
					if (sum.value>maxSum) {
						maxSum = sum.value;
					}
				}
			}
		}
		System.out.println(maxSum);
	}

	//the end
}
