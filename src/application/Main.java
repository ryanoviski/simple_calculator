package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Main {

	private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		int option;

		do {
			printMenu();
			option = readInt("Choose an option: ");

			switch (option) {
			case 1 -> perfomAddition();
			case 2 -> perfomSubtraction();
			case 3 -> perfomMultiplication();
			case 4 -> perfomDivision();
			case 0 -> System.out.println("Exiting... Goodbye!");
			default -> System.out.println("Invalid option! Please try again.");
			}
		} while (option != 0);
	}

	private static void printMenu() {
		System.out.println("\n--- SIMPLE CALCULATOR ---");
		System.out.println("1 - Addition (+)");
		System.out.println("2 - Subtraction (-)");
		System.out.println("3 - Multiplication (*)");
		System.out.println("4 - Division (/)");
		System.out.println("0 - Exit");
	}

	private static int readInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, please enter an integer.");
			}
		}
	}

	private static double readDouble(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			try {
				return Double.parseDouble(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, please enter a decimal number.");
			}
		}
	}

	private static void perfomAddition() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		double result = Calculator.add(a, b);
		System.out.println("Result: " + result);
	}

	private static void perfomSubtraction() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		double result = Calculator.subtract(a, b);
		System.out.println("Result: " + result);
	}

	private static void perfomMultiplication() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		double result = Calculator.multiply(a, b);
		System.out.println("Result: " + result);
	}

	private static void perfomDivision() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		double result = Calculator.divide(a, b);
		System.out.println("Result: " + result);
	}
}
