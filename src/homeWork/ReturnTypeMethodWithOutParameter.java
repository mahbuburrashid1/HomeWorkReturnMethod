package homeWork;

public class ReturnTypeMethodWithOutParameter {




        public int doSum() {
            int firstNumber = 100;
            int secondNumber = 39999;
            int totalSumValue = firstNumber + secondNumber;
            System.out.println("this is my total value of summation= " + totalSumValue);
            return totalSumValue;    // this totalSumValue is holding my all value and my return type is "int" so this "totalSumValue" variable is holding also "int" datatype.
        }
//==============================================================================================

        public double doSubtraction() {
            double firstNumber = 44444.3333;
            double secondNumber = 33333.5000;
            double totalSubValue = firstNumber - secondNumber;
            System.out.println("this is my total value of subtraction= " + totalSubValue);
            return totalSubValue;
        }

//==============================================================================================

        public int doMultiplication() {
            int firstNumber = 500 ;
            int secondNumber = 25;
            int totalMultiValue= firstNumber*secondNumber;
            System.out.println("this is my total value of Multiplication= " + totalMultiValue);
            return totalMultiValue;
        }

        //=====================================================================================================
        public int doDivision() {
            int firstNumber = 500 ;
            int secondNumber = 100;
            int totalDivision= firstNumber/secondNumber;
            System.out.println("this is my total value of Division= " + totalDivision);
            return totalDivision;
        }

        //===================================================================================================


        public boolean tomorrowsunday() {
            boolean tomorrowIsOff=true;
            System.out.println("Office is off tomorrow ? "+"\n" +tomorrowIsOff);
            return tomorrowIsOff;
        }




        public static void main(String[] args) {
            ReturnTypeMethodWithOutParameter parameterObj=new ReturnTypeMethodWithOutParameter();
            parameterObj.doSum();

            parameterObj.doSubtraction();
            parameterObj.doMultiplication();
            parameterObj.doDivision();
            parameterObj.tomorrowsunday();













        }
    }







