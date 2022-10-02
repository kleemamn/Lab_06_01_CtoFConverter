import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double FRACTION_FORMULA = 0.556;
        final double DIFFERENCE_FORMULA = 32;
        double fahrenheitTemp;
        double celsiusTemp;
        String trash = "";

        Scanner in = new Scanner (System.in);
        System.out.print("Enter the temperature in celsius: ");

        if(in.hasNextDouble())
        {
            celsiusTemp = in.nextDouble();
            in.nextLine();
            fahrenheitTemp = (celsiusTemp * FRACTION_FORMULA) + DIFFERENCE_FORMULA;
            System.out.printf("The temperature in degrees fahrenheit is: %.2f" , fahrenheitTemp);
            System.out.println();
        }

        else
        {
            trash = in.nextLine();
            System.out.println("\n You said the temperature was " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
    }
}