package Java_Scratch;
import java.text.DecimalFormat;

public class decimalDemo {

    public static void main(String[] args){

        DecimalFormat formatter1 = new DecimalFormat("0.0");
        DecimalFormat formatter2 = new DecimalFormat("00.00");
        DecimalFormat formatter3 = new DecimalFormat(".00");
        DecimalFormat formatter4 = new DecimalFormat("0.00%");
        DecimalFormat formatter5 = new DecimalFormat("#.00");
        String displayedValue = formatter5.format(500.867345);

        System.out.println("0.0 format: " + formatter1.format(.85));
        System.out.println("00.00 format: " + formatter2.format(.85));
        System.out.println(".00 format: " + formatter3.format(.85));
        System.out.println("0.00% format: " + formatter4.format(.8555));
        System.out.println(".00 format: " + formatter3.format(.85));
        System.out.println(displayedValue);

        // Alternatively, we can assign formatter1.format to a variable and display that

    }
    
}
