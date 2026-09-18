import java.util.Scanner;
public static void main(String[] args){
	Scanner input = new Scanner(System.in){

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int days = number % 7;

	if(days == 0){
		System.out.println("Tuesday");
		}

	else if(days == 1){
		System.out.println("Wednesday");
		}

	else if(days == 2){
		System.out.println("Thursday");
		}

	else if(days == 3){
		System.out.println("Friday");
		}

	else if(days == 4){
		System.out.println("Saturday");
		}

	else if(days == 5){
		System.out.println("Sunday");
		}

	else if(days == 6){
		System.out.println("Monday");
		}

		}
	}
}






