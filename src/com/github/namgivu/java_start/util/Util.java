package com.github.namgivu.java_start.util;

import java.io.*;

public class Util {

	public static void redirectIO(String CODE_HOME, String VAULT_FOLDER, String CHALLENGE_NAME) throws FileNotFoundException {
		//region io - redirect I/O to files
		String CHALLENGE_HOME	= String.format("%s/%s/%s", CODE_HOME, VAULT_FOLDER, CHALLENGE_NAME);
		String IO_FILE_INPUT	= String.format("%s/io/input.txt",  CHALLENGE_HOME);
		String IO_FILE_OUTPUT	= String.format("%s/io/output.txt", CHALLENGE_HOME);
		System.setIn(new FileInputStream(IO_FILE_INPUT)); //ref. https://stackoverflow.com/a/188654/248616
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(IO_FILE_OUTPUT)), true)); //ref. https://stackoverflow.com/a/2851254/248616
	}

}
