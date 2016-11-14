import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by Matt on 11/14/16.
 */
public class controlStructures {
    public static void main(String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
        long twos = 2;
        do {
            System.out.println(twos);
            twos *= twos;
        } while (twos < 1000000);
        for (int l = 1; l <= 100; l++) {
            if (l % 15 == 0){
                System.out.println("fizzbuzz");
            }else if (l % 3 == 0){
                System.out.println("fizz");
            }else if (l % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(l);
            }
        }
        Scanner getNumber = new Scanner(System.in);
        System.out.println(" \nWelcome to Squarer Cuber. \n Where we square and cube numbers. \n Please enter a number ");
        double square = getNumber.nextLong();
        for (double i = 1; i <= square; i++){
            double isSquared = Math.pow(i, 2);
            System.out.println(i + " Squared is: " + isSquared);
            double isCubed = Math.pow(i, 3);
            System.out.println(i + " Cubed is: " + isCubed);
        }
    }
}
