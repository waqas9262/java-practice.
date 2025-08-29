//Create a class Car with fields: brand, model, and year. Create an object of the class and print its details.

//class car {
//    String brand;
//    String model;
//    int year;
//}
//
//public class Day5 {
//    public static void main(String[] args) {
//
//        car myCar = new car();
//        car friendsCar = new car();
//
//        myCar.brand = "Toyota";
//        myCar.model = "Corolla";
//        myCar.year = 2019;
//
//        friendsCar.brand = "Honda";
//        friendsCar.model = "Civic";
//        friendsCar.year = 2025;
//
//        System.out.println("My Car: ");
//
//
//        System.out.println("Brand: " + myCar.brand);
//        System.out.println("Model: " + myCar.model);
//        System.out.println("Year: " + myCar.year);
//
//        System.out.println();
//
//        System.out.println("Friends Car: ");
//
//
//        System.out.println("Brand: " + friendsCar.brand);
//        System.out.println("Model: " + friendsCar.model);
//        System.out.println("Year: " + friendsCar.year);
//
//    }
//
//
//}

//Create a class Dog with a method bark() that prints “Woof!”.

//class Dog {
//    void Bark() {
//        System.out.println("Woof!");
//    }
//}
//
//public class Day5 {
//    public static void main(String[] args) {
//
//        Dog myDog = new Dog();
//        myDog.Bark();
//    }
//}


//Create a class Calculator with methods add(), subtract(), multiply(), and divide().

//class calculator {
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    int sub(int a, int b) {
//        return a - b;
//    }
//
//    int mul(int a, int b) {
//        return a * b;
//    }
//
//    int div(int a, int b) {
//        return a / b;
//    }
//}
//
//public class Day5 {
//    public static void main(String[] args) {
//
//        calculator Mycalc = new calculator();
//
//        System.out.println("addition is :" + Mycalc.add(2, 3));
//        System.out.println("subtraction is :" + Mycalc.sub(2, 3));
//        System.out.println("multiplication is :" + Mycalc.mul(2, 3));
//        System.out.println("division is :" + Mycalc.div(10, 5));
//
//    }
//
//
//}


//Create a class Student with fields for name and marks. Write a method to calculate the average marks.

//class Student {
//    String name;
//    int[] marks;
//
//
//    double calcAverage() {
//        int sum = 0;
//        for (int i = 0; i < marks.length; i++) {
//            sum = sum + marks[i];
//        }
//        return (double) sum / marks.length;
//    }
//}
//
//public class Day5 {
//    public static void main(String[] args) {
//
//        Student stud1 = new Student();
//        stud1.marks = new int [] {24, 45, 56};
//        stud1.name = "Alice";
//        System.out.println("Name: " + stud1.name + ", " + "Average: " + stud1.calcAverage());
//    }
//}
