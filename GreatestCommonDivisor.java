/** GreatestCommonDivsor.java - A program that determines the common divisor between 2 integers
 * @author Admiral Kain
 */
import java.util.Scanner;
public class Main {
    public static void greatestCommonDivisor(int first, int second){
        int remainder;

        while(second != 0){
            remainder = first % second;
            first = second;
            second = remainder;
        }

        System.out.println("The common divisor is: " +first);
    }

    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        int first, second;
        System.out.println("Enter an integer:");
        first = userInput.nextInt();
        System.out.println("Enter another integer:");
        second = userInput.nextInt();

        greatestCommonDivisor(first, second);
    }
}
