package Java_Scratch;
import java.util.Scanner;

public class userInput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Fahrenheit value");
        int Fahrenheit = input.nextInt();
        System.out.println("Please enter a day");
        String Day = input.next();
        System.out.println("It is " + Fahrenheit + " degrees Fahrenheit on a " + Day);
        


    }
    
}
