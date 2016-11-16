import java.util.Scanner;

/**
 * Created by Matt on 11/15/16.
 */
public class ExceptionsAndErrorsStudents {
    public static void main(String[] args) {
        students();
    }
    public static void students(){
        String studentName;
        String studentOccupation;
        int studentAge;
        char yesOrNo;
        Scanner toContinue = new Scanner(System.in);
        Scanner getInfo = new Scanner(System.in);
//Getting student name
        System.out.println("Lemme find ou' 'bout that student's name!");
        studentName = getInfo.nextLine();
//Getting student age
        System.out.println("Thanks. How old is " + studentName + "?" );
        studentAge = tryingToGetAge();
//getting student occupation
        System.out.println("What's " + studentName + "'s occupation?");
        studentOccupation = getInfo.nextLine();
//verifying info
        System.out.println("Is all of this correct?\n" + "Student: " + studentName + "\n" + "Age: " + studentAge + "\n" + "Occupation: " + studentOccupation);
        System.out.println("y/n");
        yesOrNo = toContinue.next().charAt(0);
        if (yesOrNo == 'y'){
            System.out.println("Okay great thanks... ");
        }else {
            System.out.println("Sorry bud, too bad.");
        }

    }
    public static int tryingToGetAge(){
        int studentAge = 0;
        Scanner getInfo = new Scanner(System.in);
        try {
        studentAge = Integer.parseInt(getInfo.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Please input a number.");
           return tryingToGetAge();
        }
   return studentAge;
    }

}
