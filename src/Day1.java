public class Day1 {
    public static void main(String[] args) {
        // Question 1: Print Hello World
        System.out.println("Hello World");

        // Question 2: Store your name in a variable and print it
        String name = "Waqas";
        System.out.println(name);

        // Question 3: Add two numbers and print the result
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        // Question 4: Swap two numbers without using a third variable
        int x = 10;
        int y = 20;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap: x = " + x + ", y = " + y);

        // Question 5: Calculate the area of a circle
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
