package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Como Integer.
		PrintService<Integer> psi = new PrintService<>();
		
		System.out.print("How many values? ");
		int values = sc.nextInt();
		
		for (int n=1; n<=values;n++) {
			System.out.print("Input number #" + n + ": ");
			int value = sc.nextInt();
			psi.addValue(value);
		}
		System.out.println();
		psi.print();
		Integer x = psi.first();
		System.out.println("First value: " + x);
		
		// Como String.
		PrintService<String> pss = new PrintService<>();
		
		System.out.print("How many values? ");
		int names = sc.nextInt();
		
		for (int n=1; n<=names;n++) {
			System.out.print("Input name #" + n + ": ");
			String name = sc.next();
			pss.addValue(name);
		}
		System.out.println();
		pss.print();
		String n = pss.first();
		System.out.println("First value: " + n);
		
		sc.close();
	}
}
