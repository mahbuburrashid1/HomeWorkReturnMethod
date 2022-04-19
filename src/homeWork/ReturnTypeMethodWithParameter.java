package homeWork;

public class ReturnTypeMethodWithParameter {

    public String studentInformation(String stName){ // single parameter
        System.out.println("student name is: "+ stName);
        return stName;
    }
    //===============================================================================================
    public int doSummation(int firstNumber,int secondNumber) {
        int totalSumValue = firstNumber + secondNumber;
        System.out.println("this is my total value of summation= " + totalSumValue);
        return totalSumValue;  // Return key word should be end of the method
    }
//------------------------------------------------------------------------------------------------------
    public int doSubtraction(int firstNumber,int secondNumber) {
        int totalSubValue = firstNumber - secondNumber;
        System.out.println("this is my total value of subtraction= " + totalSubValue);
        return totalSubValue;  // Return key word should be end of the method
    }
        //------------------------------------------------------------------------------------------------
        public int doMultiplication( int firstNumber , int secondNumber) {

            int totalMultiValue= firstNumber*secondNumber;
            System.out.println("this is my total value of Multiplication= " + totalMultiValue);
            return totalMultiValue;
        }

//===================================================================================================
 public int doDivision(int firstNumber,int secondNumber){

    int totalDivision= firstNumber/secondNumber;
    System.out.println("this is my total value of Division= " + totalDivision);
    return totalDivision;
}

    //-------------------------------------------------------------------------------------------------

    public boolean tomorrowSunday( boolean tomorrowIsOff) {

        System.out.println("Office is off tomorrow  " +tomorrowIsOff);
        return tomorrowIsOff;
    }

//------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        ReturnTypeMethodWithParameter myStudent= new ReturnTypeMethodWithParameter();
        myStudent.studentInformation("Mahir Sahrier Navid"); // calling method by object
        myStudent.doSummation(80,90);
        myStudent.doSubtraction(100,80);

            myStudent.doMultiplication(2,80);
           myStudent.doDivision(50,25);
        myStudent.tomorrowSunday(true);







        }}