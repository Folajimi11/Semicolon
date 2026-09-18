import java.util.Scanner;

	public class Divisible{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number: ");
	int first = input.nextInt();

	System.out.println("Enter number: ");
	int second = input.nextInt();

	if (first % 3 == 0){
	System.out.print("First number is divisible by 3");	
	}
	if (first % 3 != 0){
	System.out.print("Fist number is not divisible by 3");
	}
	if (second % 3 == 0){
	System.out.print("Second number is divisible by 3");
	}
	if (second % 3 != 0){
	System.out.print("Second number is not divisible by 3");
	
}
}
}