import java.util.Scanner;
	public class Student{
		public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();

		if(age <= 18){
		System.out.println("You're not Eligible");
		   }
		else {
		System.out.println("You're Eligible");
		}
          }
}
