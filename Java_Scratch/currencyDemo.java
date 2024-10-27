package Java_Scratch;
import java.text.NumberFormat;
import java.util.Scanner;

public class currencyDemo {

    public static void main(String[] args){

            int items;
            double itemCost;
            double total;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of items");
            items = input.nextInt();
            System.out.println("Enter the cost per item");
            itemCost = input.nextDouble();
            total = items * itemCost;
            System.out.println();
            System.out.println("Unformatted Total: " + total);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            System.out.println("Formatted Total: " + currencyFormat.format(total));


    }
    
}
