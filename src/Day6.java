/// /Create a base class Character with a method attack().
/// /Then create two classes Wizard and Warrior that inherit from Character and override the attack() method with their own versions.
/// /In the main method, create objects of Wizard and Warrior and call their attack() methods.
//
/// / Parent class
//class character {
//    void attack() {
//        System.out.println("character's attack ability");
//    }
//}
//
/// / Child class Wizard
//class wizard extends character {
//    @Override
//    void attack() {
//        System.out.println("Wizard can cast a fireball");
//    }
//}
//

//// Child class Warrior
//class warrior extends character {
//    @Override
//    void attack() {
//        System.out.println("Warrior can swing the sword");
//    }
//}
//
//public class Day6 {
//    public static void main(String[] args) {
//
//        character c1 = new wizard();
//        character c2 = new warrior();
//
//        c1.attack();
//        c2.attack();
//
//
//    }
//}
//
//


////Create a class hierarchy: Shape → Circle, Rectangle. Each class should have a method area() that calculates its area.

//// Parent class
//class Shape {
//    double area() {
//        System.out.println("Area not defined");
//        return 0;
//    }
//}
//
//// Circle class (child of Shape)
//class Circle extends Shape {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double area() {
//        return Math.PI * radius * radius;
//    }
//
//
//}
//

//// Rectangle class (child of Shape)
//class Rectangle extends Shape {
//    double length;
//    double width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    double area() {
//        return length * width;
//    }
//
//}
//
//public class Day6 {
//    public static void main(String[] args) {
//        Shape s1 = new Circle(5);
//        Shape s2 = new Rectangle(3,4);
//
//        System.out.println("Area for circle: " + s1.area());
//        System.out.println("Area for rectangle: " + s2.area());
//
//    }
//}


//class BankAccount {
//    double balance;
//
//    BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    void withdraw(double amount) {
//        System.out.println("Withdraw method not defined");
//    }
//}
//
//class SavingsAccount extends BankAccount {
//
//    SavingsAccount(double balance) {
//        super(balance);
//    }
//
//    @Override
//    void withdraw(double amount) {
//        if (amount <= balance) {
//            balance = balance - amount;
//            System.out.println("Withdraw: " + amount + " New balance: " + balance);
//        } else {
//            System.out.println("Not enough funds, your current balance is: " + balance);
//        }
//    }
//}
//
//class CheckingAccount extends BankAccount {
//
//    double OverDraft = 100;
//
//    CheckingAccount(double balance) {
//        super(balance);
//    }
//
//    @Override
//    void withdraw(double amount) {
//        if (amount <= balance + OverDraft) {
//            balance = balance - amount;
//            System.out.println("Withdraw :" + amount + " New balance = " + balance);
//        } else {
//            System.out.println("Not enough funds, your current balance is: " + balance + " Total overdraft limit :" + OverDraft + " Maximum withdraw limit :" + (balance + OverDraft));
//        }
//
//    }
//
//}
//
//public class Day6 {
//    public static void main(String[] args) {
//        BankAccount a1 = new CheckingAccount(500);
//        BankAccount a2 = new SavingsAccount(500);
//
////        a1.withdraw(400);
//        a1.withdraw(600);
//
////        a2.withdraw(400);
//        a2.withdraw(600);
//
//
//    }
//}

//interface Playable{
//    void play();
//}
//
//class Guitar implements Playable{
//    @Override
//    public void play() {
//        System.out.println("Strumming the Guitar");
//    }
//}
//
//class Piano implements Playable{
//    @Override
//    public void play() {
//        System.out.println("Playing the Piano");
//    }
//}
//public class Day6{
//public static void main(String[] args) {
//    Playable p1 = new Guitar();
//    Playable p2 = new Piano();
//
//    p1.play();
//    p2.play();
//}
//}