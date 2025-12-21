// File Name: FruitShopArithmeticAssignment.java
// Topic: Arithmetic Operators – Real Case Assignment (Fruits)
package class2;
public class FruitShopArithmeticAssignment {
    public static void main(String[] args) {

        // Quantity of fruits sold
        int apples = 12;
        int bananas = 18;
        int oranges = 10;

        // Price per fruit
        int applePrice = 20;
        int bananaPrice = 10;
        int orangePrice = 15;

        // Addition: Total fruits sold
        int totalFruitsSold = apples+bananas+oranges;

        // Multiplication: Total bill per fruit type
        int appleTotal = apples * applePrice;
        int bananaTotal = bananas * bananaPrice;
        int orangeTotal = oranges * orangePrice;

        // Addition: Grand total bill
        int totalBill = appleTotal + bananaTotal + orangeTotal;

        // Division: Average price per fruit
        int averagePrice = totalBill / totalFruitsSold;

        // Subtraction: Remaining fruits in stock
        int totalStock = 100;
        int remainingFruits = totalStock - totalFruitsSold;

        // Modulus: Check even/odd order number
        int orderNumber = 28;
        boolean isEvenOrder = orderNumber % 2 == 0;

        // All outputs
        System.out.println("Total Fruits Sold: " + totalFruitsSold);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Average Price Per Fruit: " + averagePrice);
        System.out.println("Remaining Fruits in Stock: " + remainingFruits);

        // Check the order Even or Odd
        if (isEvenOrder) {
            System.out.println("Order Number is Even");
        }

        else {
            System.out.println("Order Number is Odd");
        }


    }
}
