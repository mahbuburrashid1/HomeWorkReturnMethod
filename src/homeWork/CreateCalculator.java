package homeWork;

import java.util.Scanner;

public class CreateCalculator {


    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.println("this is my calculator");
        System.out.println("this addition");
        System.out.println("enter your first number");
        int number1 = calculator.nextInt();
        System.out.println("enter your second number");
        int number2 = calculator.nextInt();
        int total = number1 + number2;
        System.out.println("total addition " + total);


//========================================================================================
        System.out.println("this is subtraction");
        System.out.println("enter your first number");
        int sub1 = calculator.nextInt();
        System.out.println("enter your second number");
        int sub2 = calculator.nextInt();
        int totalSub = sub1 - sub2;
        System.out.println("total subtraction" + totalSub);
//============================================================================================

        System.out.println("this is multiplication");
        System.out.println("enter your first number");
        int multi1 = calculator.nextInt();
        System.out.println("enter your second number");
        int multi2 = calculator.nextInt();
        int totalMulti = multi1 * multi2;
        System.out.println("total multiplication   " + totalMulti);
//===========================================================================

        System.out.println("this is Division");
        System.out.println("enter your first number");
        int div1 = calculator.nextInt();
        System.out.println("enter your second number");
        int div2 = calculator.nextInt();
        int totalDiv = div1 / div2;
        System.out.println("total Division   " + totalDiv);
        calculator.close();

    }


}


























