package by.bntu.fitr.poisit.zavadskaya.javalabs.lab09.model;

public class Number {

	public static int countTheNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}

		int quantity = 0;
		while (number > 0) {
			quantity++;
			number /= 10;
		}
		return quantity;
	}

	public static int findTheSumOfNumbers(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static int findTheMulOfNumbers(int number) {
		if (number < 0) {
			return -1;
		}
		int mul = 1;
		while (number > 0) {
			mul *= number % 10;
			number /= 10;
		}
		return mul;
	}

	public static int findArithmeticMean(int number) {
		if (number < 0) {
			return -1;
		}

		return findTheSumOfNumbers(number) / countTheNumberOfDigits(number);
	}

	public static int findGeometricMean(int number) {
		if (number < 0) {
			return -1;
		}

		return (int) Math.pow(findTheMulOfNumbers(number), 1 / countTheNumberOfDigits(number));
	}

	public static int findTheNumberOfDigitsDivisibleByTwo(int number) {
		if (number < 0) {
			return -1;
		}
		int quantity = 0;
		while (number > 0) {
			if ((number % 10) % 2 == 0) {
				quantity++;
			}
			number /= 10;
		}
		return quantity;
	}

	public static int findTheNumberOfEvenDigits(int number) {
		if (number < 0) {
			return -1;
		}
		int quantity = 0;
		while (number > 0) {
			if ((number % 10) % 2 == 0) {
				quantity++;
			}
			number /= 10;
		}
		return quantity;
	}

	public static boolean checkForTheSameParity(int number) {

		return findTheNumberOfEvenDigits(number) == countTheNumberOfDigits(number);
	}

	public static boolean checkNumbersForEquality(int number) {
		int count = 1;
		int digit = number % 10;
		while(number > 0) {
			number /= 10;
			if(number % 10 == digit) {
				count++;
			}
		}
		return count == countTheNumberOfDigits(number);
	}
}
