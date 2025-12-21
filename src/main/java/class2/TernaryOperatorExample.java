// File Name: TernaryOperatorExample.java
// Topic: Ternary Operator in Java

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int age = 20;

        // Ternary Operator: condition ? value_if_true : value_if_false
        String eligibility = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";

        System.out.println(eligibility);

        int number = 15;

        // Check even or odd using ternary operator
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println(result);
    }
}
