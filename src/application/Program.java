package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many values? ");
		int values = sc.nextInt();
		String numbers = "[";
		
		for (int n=1; n<=values;n++) {
			System.out.print("Input number #" + n + ": ");
			int number = sc.nextInt();
			numbers += number  + ",";
		}
		System.out.println();
		System.out.println(numbers.substring(0, numbers.length()-1 ) +"]");
		sc.close();
	}
}
