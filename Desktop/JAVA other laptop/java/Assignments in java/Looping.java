import java.util.Scanner;
	public class Looping{
		public static void main(String[] args){
			Scanner input = new Scanner (System.in);

                        System.out.println("Enter a number to multiply: ");
                        int number = input.nextInt();
				
				for(int counter = 1; counter <= 20; counter++){
					int multiply = counter * number;
					System.out.println(number + " x " + counter + " = " + multiply);  
                                        
                                      } 
				
		}
	}
