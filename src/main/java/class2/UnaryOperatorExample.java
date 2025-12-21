// File: UnaryOperatorSolved.java
// Topic: Unary Operators (Pre & Post)
package class2;
public class UnaryOperatorExample {

    public static void main(String[] args) {

        int a = 5;

        System.out.println("Initial value of a: " + a);

        int postIncrement = a++;
        System.out.println("After a++ (post-increment): " + postIncrement);
        System.out.println("Value of a now: " + a);

        int preIncrement = ++a;
        System.out.println("After ++a (pre-increment): " + preIncrement);

        int postDecrement = a--;
        System.out.println("After a-- (post-decrement): " + postDecrement);
        System.out.println("Value of a now: " + a);

        int preDecrement = --a;
        System.out.println("After --a (pre-decrement): " + preDecrement);
    }
}
