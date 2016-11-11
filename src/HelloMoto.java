/**
 * Created by Matt on 11/11/16.
 */
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
                   + "This is double " + ThisIsDouble + "\n" + "This is char " + ThisIsChar);



    }
}
