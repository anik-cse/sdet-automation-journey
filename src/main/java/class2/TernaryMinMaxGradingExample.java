// File Name: TernaryMinMaxGradingExample.java
// Topic: Ternary Operator – Min, Max and Grading System
public class TernaryMinMaxGradingExample {

    public static void main(String[] args) {


        // Min, Max Start

        int num1 = 25;
        int num2 = 40;

        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        // Min, Max End

        int marks = 82;

        String grade =
                (marks >= 90) ? "A+" :
                        (marks >= 80) ? "A" :
                                (marks >= 70) ? "B" :
                                        (marks >= 60) ? "C" :
                                                (marks >= 50) ? "D" :
                                                        "F";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
