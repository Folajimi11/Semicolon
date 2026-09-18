import java.util.*;

public class Main {
    public static void main(String[] args) {
      int age = 26;
      int year = 2025;
      
      double price = 19999.99;
      double gpa = 3.5;
      double temperature = -12.5;

      char grade = 'A';
      char symbol = '!';
      char currency = '$';

      boolean isStudent = false; 
      boolean forSale = true;
      boolean isOnline = true;


      String name = " adeyemi";
      String food = "pizza";
      String email = "fake123@gmail.com";
      String car = "Mustang";
      String color = "Red";

      System.out.println("your choice is a " + color + " " + year + " " + car);
      System.out.println("the price is: " + currency + price);

      if(forSale){
        System.out.print("there is a " + car +" " + "for sale");
      }
      else{
        System.out.print("the " + car + " is not for sale");
      }
    }
}