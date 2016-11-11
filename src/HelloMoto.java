
/**
 * Created by Matt on 11/11/16.
 */

import java.util.Scanner;
public class HelloMoto {

    public static void main(String[] args) {//psvm is shortcut

        System.out.print("Hello Moto!!");//sout is shortcut
        //Two ways to declare variables/types
        byte ThisIsByte = 124;
        short ThisIsShort = 12532;
        int day = 5;
        //type of primitive always has to be declared
        float price;
        price = (float) 3.4;
        boolean sup = true;
        long ThisIsLong = 678765486;
        double ThisIsDouble = 982389327;
        char ThisIsChar = 'a';

        System.out.print("\n" + "this is byte " + ThisIsByte + "\n" +"this is float " + price + "\n" + "this is boolean " + sup
                + "This is short " + ThisIsShort + "\n" + "This is int " + day + "\n" + "This is long " + ThisIsLong + "\n"
                   + "This is double " + ThisIsDouble + "\n" + "This is char " + ThisIsChar + "\n");

        Scanner ThisIsScanner = new Scanner(System.in);
        System.out.println("Enter name pls: ");
        String name = ThisIsScanner.next();
        System.out.println("Name is :" + name);

        char choice;
        do {
            Scanner toContinue = new Scanner(System.in);
            Scanner numberScanner = new Scanner(System.in);
            System.out.println("Enter width: ");
            double width = numberScanner.nextDouble();
            System.out.println("Enter Length: ");
            double length = numberScanner.nextDouble();
            System.out.println("Perimeter is " + ((width*2) + (length*2))+ "\n" + "Continue? y/n");
            choice = toContinue.next().charAt(0);


        } while (choice == 'y');

    }
}
