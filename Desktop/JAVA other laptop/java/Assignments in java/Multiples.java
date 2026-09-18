import java.util.Scanner;
	
	public class Multiples{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
				
			System.out.print("Enter numberOne: ");
			int numberOne = input.nextInt();
			
			System.out.print("Enter numberTwo: ");
			int numberTwo = input.nextInt();

			numberOne = numberOne * 3;
			numberTwo = numberTwo * 2;
			
			if(numberOne % numberTwo == 0){
			}
			System.out.print("NumberOne is a multiple of " + numberTwo);

			if(numberOne % numberTwo != 0){
			}
			System.out.print("NumberOne is not a multiple of " + numberTwo );
		}
	}