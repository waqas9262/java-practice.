//public class Day7 {
//    public static void main(String[] args) {
//        try {
//            int a = 10;
//            int b = 2;
//
//            int result = (a/b);
//            System.out.println(" Result = " + result);
//        }
//
//        catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero my man");
//        }
//
//
//    }
//}

//public class Day7 {
//    public static void main(String[] args) {
//        try {
//            String text = "abc";
//            int number = Integer.parseInt(text);
//            System.out.println("Converted number: " + number);
//        }
//        catch (NumberFormatException e) {
//            System.out.println("Error: Cannot convert text to number!");
//        }
//    }
//}


//import java.util.ArrayList;
//
//public class Day7 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Peach");
//        list.add("lemon");
//        list.add("Java");
//
//        for (String item : list){
//            System.out.println(item);
//        }
//    }
//}


//import java.util.HashMap;
//public class Day7 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> Students = new HashMap<>();
//
//    Students.put("Alice", 60);
//    Students.put("Bob", 80);
//    Students.put("John", 90);
//
//for (HashMap.Entry<String, Integer> entry : Students.entrySet()){
//    System.out.println(entry.getKey() + ": " + entry.getValue());
//}





//import java.util.HashMap;
//
//public class Day7 {
//    public static void main(String[] args) {
//        String sentence = "apple banana apple orange banana apple";
//        String[] words = sentence.split(" ");
//
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        for (String word : words) {
//            if (wordCount.containsKey(word)) {
//                wordCount.put(word, wordCount.get(word) + 1);
//            } else {
//                wordCount.put(word, 1);
//            }
//        }
//
//        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}


//import java.util.*;
//
//public class Day7 {
//    public static void main(String[] args) {
//        // 1. Filter even numbers
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> evens = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .toList();
//        System.out.println("Even numbers: " + evens);
//
//        // 2. Convert strings to uppercase
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        List<String> upperWords = words.stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println("Uppercase words: " + upperWords);
//
//        // 3. Find sum of numbers
//        int sum = numbers.stream()
//                .mapToInt(n -> n)
//                .sum();
//        System.out.println("Sum: " + sum);
//    }
//}