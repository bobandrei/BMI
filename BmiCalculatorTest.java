/*
ANDREI BOB
0872705507
bobandrei26@gmail.com
*/

//create BmiCalculator object and invoke the  methods
public class BmiCalculatorTest {

    public static void main(String[] args) {
        //initialize BmiCalculator object  with constructor bmi
        BmiCalculator bmi = new BmiCalculator();

        bmi.metricOrImperial();//read which system was chosen
        bmi.calculateBmi();//read the result Of BMI calculator
        bmi.printResult();//read the information about BMI
        
    }
}//end class BmiCalculatorTest
