import java.util.Scanner;
	public class Checkboard{
		public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
		while(repeat){
		System.out.print("Enter Password: ");
		String password = input.next();
		
		if(password.equalsIgnoreCase("1234$A")){
		System.out.print("Correct password");
		repeat = false;
		}
		else{
		System.out.println("Wrong Password, try again!!!");
		}
		}
		}
	}
		


