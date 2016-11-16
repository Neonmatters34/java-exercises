import java.util.Scanner;

/**
 * Created by Matt on 11/14/16.
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println(addition(5, 5));//replacing numbers in the methods below
        System.out.println(subtraction(5, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(5, 5));
        getNumber();
    }


    public static int addition(int firstNumberInput, int secondNumber) {// these inputs in the parens are replaced the number ins sout
        return firstNumberInput + secondNumber;
    }
    public static int subtraction(int firstNumberInput, int secondNumber){
        return  firstNumberInput - secondNumber;
    }
    public static int multiplication(int firstNumberInput, int secondNumber){
        return  firstNumberInput * secondNumber;
    }
    public static int division(int firstNumberInput, int secondNumber){
        return firstNumberInput / secondNumber;
    }
    public static void getNumber(){
        Scanner numberInput = new Scanner(System.in);
        System.out.println("please input a number");
        int input = numberInput.nextInt();
            int factor = 1;
        for (int i = 0; i < input; i++){
            factor += factor * i;
            System.out.println(factor);
        }
    }
}
