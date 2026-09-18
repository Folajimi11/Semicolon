import java.util.Scanner;
	public class Kingsley{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();

		int counter = 0;

		for (int index = 2; index <= number/2; index++){
			if(number % index == 0){
				counter++;
			}
		}
		if(counter > 0){
			System.out.println(number + " is not a prime number");
			
		}
		else{
			System.out.println(number + " is a prime number");
		}
		}
	}