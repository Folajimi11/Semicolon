import java.util.Scanner;
	public class PrimeNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number: ");
			int number = input.nextInt();
			int counter = 0 ;
			for(int index = 2; index < number; index++){
                             if(number % index ==0);
                                 counter++;
                                 
                              }

			if(counter != 0){
                               System.out.printf("%d is not a prime number", number);
			}	
			else{
				System.out.printf("%d is a prime number", number);
                       }

			
		}
	}