//public class Day4 {
//    Write a method that takes two numbers and returns the bigger one.
//    public static int getBigger(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int num1 = 94;
//        int num2 = 64;
//
//        int Bigger = getBigger(num1, num2);
//        System.out.println("The bigger number is " + Bigger);
//
//    }
//}


//public class Day4 {
//    Write a method that returns the factorial of a number.
//    public static int getFactorial(int a) {
//        int result = 1;
//        for (int i =1; i<=a; i++){
//            result = result * i;
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//        int num = 5;
//
//        int Factorial = getFactorial(num);
//        System.out.println("The factorial is " + Factorial);
//
//    }
//}

//public class Day4 {
//    Write a method to check if a word is a palindrome (like “madam”).

//    public static boolean isPalindrome(String word) {
//        String reversed = new StringBuilder(word).reverse().toString();
//        return word.equals(reversed);
//
//    }
//
//    public static void main(String[] args) {
//        String TestWord = "madam";
//        if (isPalindrome(TestWord)) {
//            System.out.println(TestWord + " is Palindrome");
//        }
//        else{
//            System.out.println(TestWord + " is not Palindrome");
//        }
//
//    }
//}


//public class Day4 {
//    Write a method to calculate the sum of all elements in an array.

//    public static int getSum(int[] num) {
//        int sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {20, 20, 20, 20, 20};
//        int Total = getSum(array);
//
//        System.out.println("The sum of the given array is: " + Total);
//
//    }
//}


//public class Day4 {
//    public static void getFibonacci(int n) {
//        int first = 0;
//        int second = 1;
//
//        System.out.print("Fibonacci series: " );
//        for (int i=1; i <= n; i++){
//            System.out.print(first + " ");  // print the current number
//
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int n = 10;
//        getFibonacci(n);
//    }
//}