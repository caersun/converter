package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		int menuSelection = 0;
		double unit;
		
		while (menuSelection != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			menuSelection = collectInput();
			
			switch (menuSelection) {
				case 1: {
					System.out.println("How many cups?");
					unit = collectUnit();
					System.out.println("Teaspoons: " + (unit * 39.97));
					System.out.println();
					break;
				}
				case 2: {
					System.out.println("How many miles?");
					unit = collectUnit();
					System.out.println("Kilometers: " + (unit * 1.61));
					System.out.println();
					break;
				}
				case 3: {
					System.out.println("How many US gallons?");
					unit = collectUnit();
					System.out.println("Imperial gallons: " + (unit * 0.83));
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("Goodbye!");
					break;
				}
				default: {
					System.out.println("Please choose a valid selection");
					System.out.println();
				}
			}
		}
		
	}
	
	public static int collectInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static double collectUnit() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
	
	
}
