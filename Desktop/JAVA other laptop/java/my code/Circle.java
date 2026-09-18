public class Circle{
    public static void main(String...args){
        
        int radius = 2;
        double pie = 3.14159;
        int diameter = radius * radius;
        double circumference = 2 * pie * radius;
        double area = pie * diameter;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
