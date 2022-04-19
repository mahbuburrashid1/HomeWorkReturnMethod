package homeWork;

public class Non_ReturnTypeMethodWithOutParameter {

    public void doSum1() {
        int age1 = 12;
        int age2 = 30;
        int totalAgeTogethe = age1 + age2;
        System.out.println("Total value of addition two numbers is = "+totalAgeTogethe);
    }
//-----------------------------------------------------------------------------------------------------


    public void doSubtraction1() {
        int studentAge1 = 24;
        int studentAge2 = 20;
        int totalAgedifference = studentAge1 - studentAge2;
        System.out.println("Total value of subtraction  = " + totalAgedifference);

    }
//----------------------------------------------------------------------------------------------------
public void doMultiplication() {
    int studentFee1 = 24;
    int studentFee2= 20;
    int totalFeeMultiply= studentFee1 * studentFee2;
    System.out.println("Total value of Multiplication  = " + totalFeeMultiply);

}
//-------------------------------------------------------------------------------------------------------

    public void doDivision() {
        int studentFee1 = 24;
        int studentFee2= 2;
        int totalDivisionValue= studentFee1 /studentFee2;
        System.out.println("Total value of Division = " + totalDivisionValue);

    }


//====================================================================================================
    public static void main(String[] args) {

        Non_ReturnTypeMethodWithOutParameter nonReturnWithOutPara= new Non_ReturnTypeMethodWithOutParameter();
        nonReturnWithOutPara.doSum1();
        nonReturnWithOutPara.doSubtraction1();
        nonReturnWithOutPara.doMultiplication();
        nonReturnWithOutPara.doDivision();

    }




}
