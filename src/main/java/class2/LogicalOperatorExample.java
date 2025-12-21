// File Name: LogicalOperatorExample.java
// Topic: Logical Operators in Java

public class LogicalOperatorExample {

    public static void main(String[] args) {

        int age = 17;
        boolean hasID = true;
        boolean hasTicket = false;

        // Logical AND (&&)
        boolean canEnterCinema = (age >= 18) && hasID;
        System.out.println("Can enter cinema (age >= 18 AND has ID): " + canEnterCinema);

        // Logical OR (||)
        boolean canGetTicket = hasTicket || hasID;
        System.out.println("Can get ticket (has ticket OR has ID): " + canGetTicket);

        // Logical NOT (!)
        boolean isMinor = !(age >= 18);
        System.out.println("Is minor (NOT age >= 18): " + isMinor);
    }
}
