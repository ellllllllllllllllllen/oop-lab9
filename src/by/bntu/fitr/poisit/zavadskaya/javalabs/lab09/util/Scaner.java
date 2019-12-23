package by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.util;

import java.util.Scanner;

public class Scaner {

	private static Scanner scanner = new Scanner(System.in);

	public static int scan(String message) {
		System.out.print(message);
		return scanner.nextInt();
	}
}
