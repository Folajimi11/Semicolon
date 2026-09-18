import java.util.Scanner;
       public class Case{
            public static void main(String...args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String word = input.nextLine();

                char first = word.charAt(0);
                String ch = "" + first;
            
            if(ch.equals(ch.toUpperCase())){
                System.out.println("Uppercase");
            }
            else{
                System.out.println("Lowercase");
            }
            }
       }     
