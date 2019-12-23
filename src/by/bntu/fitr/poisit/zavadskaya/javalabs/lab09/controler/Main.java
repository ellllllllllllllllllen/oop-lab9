package by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.controler;

import by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.view.Printer;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.model.Number;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.util.Scaner;

public class Main {

	public static void main(String[] args) {
		Printer.print("Count the number of digits: " + Number.countTheNumberOfDigits(Scaner.scan("Input number: ")));
		Printer.print("Find the sum of numbers: " + Number.findTheSumOfNumbers(Scaner.scan("\nInput number: ")));
		Printer.print("Find the mul of numbers: " + Number.findTheMulOfNumbers(Scaner.scan("\nInput number: ")));
		Printer.print("Find arithmetic mean: " + Number.findArithmeticMean(Scaner.scan("\nInput number: ")));
		Printer.print("Find geometric mean: " + Number.findGeometricMean(Scaner.scan("\nInput number: ")));
		Printer.print("Find the number of digits divisible by two: " + Number.findTheNumberOfDigitsDivisibleByTwo(Scaner.scan("Input number: ")));
		Printer.print("Find the number of even digits: " + Number.findTheNumberOfEvenDigits(Scaner.scan("\nInput number: ")));
		
		Printer.print("Check for the same parity: " + Number.checkForTheSameParity(Scaner.scan("\nInput number: ")));
		Printer.print("Check numbers for equality: " + Number.checkNumbersForEquality(Scaner.scan("\nInput number: ")));
		
	}

}
