public class Day2 {
    public static void main(String[] args) {
        // Q1: Write a program to check if a number is even or odd
        int number = 8;
        if (number % 2 == 0) {
            System.out.println(number + " is Even ");
        } else {
            System.out.println(number + " is Odd ");
        }
        // Q2: Write a program to print numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Q3: Write a program to print multiplication table of 5
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));

        }
        // Q4: Write a program to calculate sum of digits of a number
        int numb = 123;
        int sum = 0;

        while (numb > 0) {
            int digit = numb % 10;
            sum = sum + digit;
            numb = numb / 10;
        }
        System.out.println("The sum is: " + sum);

        // Q5: Write a program to check if a number is prime
        int n = 11;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");

        }

    }
}