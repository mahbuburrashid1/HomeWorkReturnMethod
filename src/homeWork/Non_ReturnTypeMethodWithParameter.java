package homeWork;

public class Non_ReturnTypeMethodWithParameter {

    public void doSummationParameter(int number1,int number2) {
        int totalSumValue = number1 + number2;
        System.out.println("this is my total value of summation= " + totalSumValue);
    }






    public static void main(String[] args) {
        Non_ReturnTypeMethodWithParameter nonReturnWithPara =new Non_ReturnTypeMethodWithParameter();
        nonReturnWithPara.doSummationParameter(10,20);

    }



}
