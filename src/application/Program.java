package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int values = sc.nextInt();
		
		for (int n=1; n<=values;n++) {
			System.out.print("Input number #" + n + ": ");
			int value = sc.nextInt();
			ps.addValue(value);
		}
		System.out.println();
		ps.print();
		System.out.println("First value: " + ps.first());
		
		sc.close();
	}
}
