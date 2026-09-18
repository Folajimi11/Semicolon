import java.util.Scanner;
       public class LenghtOfString{
            public static void main(String...args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String word = input.nextLine();

            if(word.length() < 5){
                System.out.println("Short String");
            }
            else if(word.length() <= 10){
                 System.out.println("Medium String");
            }
            else{
                 System.out.println("Long String");
            }
            }
    }
