// File Name: Identifiers.java
// Topic: Java Identifiers (Rule-wise VALID examples only)

package class1;

public class Identifiers {

    //RULE 1: Identifiers can contain letters, digits, $ and _

    int age;
    int age1;
    int _count;
    int $price;
    String userName;

    //RULE 2: Identifiers must NOT start with a digit

    int value10;
    double totalAmount;
    String studentName;

    //RULE 3: Identifiers must NOT contain spaces

    int studentAge;
    int totalMarks;
    double accountBalance;

    //RULE 4: Java identifiers are case-sensitive

    int Score;
    int score;   // Different from 'Score'

    //RULE 5: Reserved keywords are NOT used as identifiers

    int classNumber;
    String publicAccess;
    boolean staticFlag;


    //Different Types of VALID Identifiers

    // Method identifier
    void calculateResult() {
        int finalScore = 85; // Local variable identifier
        System.out.println("Final Score: " + finalScore);
    }

    // Constant identifier (Best Practice)
    static final double MAX_MARKS = 100.0;

    //Main Method

    public static void main(String[] args) {

        Identifiers obj = new Identifiers();
        obj.calculateResult();

        System.out.println("Max Marks: " + MAX_MARKS);
    }
}
