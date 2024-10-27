package Java_HW_Variables_Operations;

public class PrimitiveOperations {
    public static void main(String[] args){

            // Declare and initialize two variables, then print them
            long firstValue;
            firstValue = 100L;
            double secondValue;
            secondValue = 1000D;
            System.out.println("The first value is " + firstValue);
            System.out.println("The second value is " + secondValue);

            // Multiply variables together
            double resultValue = firstValue * secondValue;
            System.out.println("The multiplication of the first and second value is " + resultValue);

            // Converting first variable to floating point
            float convertedFirstValue = (float)firstValue;
            System.out.println("The converted integer to floating point value is " + convertedFirstValue);

            // Converting second variable to integer type
            int convertedSecondValue = (int) secondValue;
            System.out.println("The converted floating point to integer value is " + convertedSecondValue);

            // Declare, assign, and print a char variable
            char thirdValue;
            thirdValue = 'B';
            System.out.println("The uppercase char variable is " + thirdValue);

            // Turn char variable into lower case using numerical operation
            int convertedThirdValue = (int)thirdValue;
            convertedThirdValue = convertedThirdValue + 32;
            
            // I'm not sure how to achieve a lower case result without assigning final value to a new variable.
            char finalThirdValue = (char) convertedThirdValue;
            System.out.println("The lower case char variable is " + finalThirdValue);



    }
}
