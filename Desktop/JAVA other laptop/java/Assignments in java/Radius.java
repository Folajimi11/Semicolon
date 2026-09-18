import java.util.Scanner;
	public class Radius{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius: ");
		Double radius = input.nextDouble();
		Double pie = 3.14159;
		Double Diameter = 2 * radius;
		Double circumference = 2 * radius * radius;
		Double area = radius * radius * radius;

		System.out.println("The diameter of the circle is: " + Diameter );
		System.out.println("The circumference of the circle is: " + circumference );
		System.out.println("The are of the circle is: " + area );
		}	
	}