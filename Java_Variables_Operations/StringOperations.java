package Java_HW_Variables_Operations;

public class StringOperations {
    public static void main(String[] args){

        // Create a new string object and assign it my name
        String obj1 = new String("Shafin");
        System.out.println("The name assigned to the string object is " + obj1);

        // First letter of name replaced with "A", last letter replaced with "Z"
        String manipulatedString = obj1.replace('S', 'A').replace('n','Z');
        System.out.println("The manipulated string name is now " + manipulatedString);

        // Declare a new string
        String gaAddress = "www.gatech.edu";
        System.out.println("The URL is " + gaAddress);

        // Return a concatenated substring for "gatech1331"
        String appendedValue = new String("1331");
        String subStringAddress = gaAddress.substring(4, 10);
        String finalAddress = subStringAddress.concat(appendedValue);
        System.out.println("The concatenated substring is " + finalAddress);


    }
    
}

