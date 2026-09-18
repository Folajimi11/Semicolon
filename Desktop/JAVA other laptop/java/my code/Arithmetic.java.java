import java.util.Scanner;
	public class Arithmetic{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first integer: ");
		double firstDigit = input.nextDouble();
		System.out.println("Enter second integer: ");
		double secondDigit = input.nextDouble();

		double firstSquare = firstDigit * firstDigit;
		double secondSquare = secondDigit * secondDigit;

		double sum = firstSquare + secondSquare;
		
		double difference = firstSquare - secondSquare;
		
		System.out.printf(
            "The square of the first integer is: %f%n" +
            "The square of the second integer is: %f%n" +
            "The sum of the squares is: %f%n" +
            "The difference in the squares is: %f%n",
            firstSquare, secondSquare, sum, difference  );

		}
	}