package homeWork;

public class Non_ReturnTypeMethodWithParameter {

    public void doSummationParameter(int number1,int number2) {
        int totalSumValue = number1 + number2;
        System.out.println("this is my total value of summation= " + totalSumValue);
    }
//----------------------------------------------------------------------------------------

    public void doSubtractionParameter(int number1,int number2) {
        int totalSubValue = number1 - number2;
        System.out.println("this is my total value of subtraction " + totalSubValue);
    }
//---------------------------------------------------------------------------------------------


    public void doMultiplicatipnParameter(int number1,int number2) {
        int totalMultiValue = number1 * number2;
        System.out.println("this is my total value of Multiplication " + totalMultiValue);
    }
//------------------------------------------------------------------------------------------------------
public void doDivisionParameter(int number1,int number2) {
    int totalDivisionValue = number1 / number2;
    System.out.println("this is my total value of Division" + totalDivisionValue);
}

 //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Non_ReturnTypeMethodWithParameter nonReturnWithPara =new Non_ReturnTypeMethodWithParameter();
        nonReturnWithPara.doSummationParameter(10,20);
        nonReturnWithPara.doSubtractionParameter(40,20);

        nonReturnWithPara.doMultiplicatipnParameter(40,20);
        nonReturnWithPara.doDivisionParameter(40,20);

    }



}
