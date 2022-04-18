package homeWork;

public class Non_ReturnTypeMethodWithOutParameter {

    public void doSum1() {
        int age1 = 12;
        int age2 = 30;
        int totalAgeTogethe = age1 + age2;
        System.out.println("Total value of addition two numbers is = "+totalAgeTogethe);
    }


    public static void main(String[] args) {

        Non_ReturnTypeMethodWithOutParameter nonReturnWithOutPara= new Non_ReturnTypeMethodWithOutParameter();
        nonReturnWithOutPara.doSum1();
    }




}
