package test;

import java.util.*;

public class Task4 {
	public static String mixString(String a, String b) {
		char[] strA = a.toCharArray();
		char[] strB = b.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < strA.length || i < strB.length; i++) {
			if (i < strA.length)
				sb.append(strA[i]);
			if (i < strB.length)
				sb.append(strB[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(mixString(scanner.nextLine(), scanner.nextLine()));
	}
	
}
