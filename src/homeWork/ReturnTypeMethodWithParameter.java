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

//===================================================================================================

    public static void main(String[] args) {
        ReturnTypeMethodWithParameter myStudent= new ReturnTypeMethodWithParameter();
        myStudent.studentInformation("Mahir Sahrier Navid"); // calling method by object
        myStudent.doSummation(80,90);


    }



}
