/*
ANDREI BOB
0872705507
bobandrei26@gmail.com
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BmiCalculator {
    //create Scanner to obtain input from comand window
    Scanner input = new Scanner(System.in);
    //declaring variables
    double height;
    double stones;
    double pounds;
    double feet;
    double inches;
    double kilograms;
    double centimeters;
    double weight;
    double BMI;
    double metricOrImperial;
    double totalPounds;
    double totalInches;
    
    //LET USER TO CHO0SE IN WHICH SYSTEM WANTS TO INPUT THE WEIGHT AND THE HEIGHT
    public void metricOrImperial() {
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Welcome to the BMI Calculator!\nYou can calculate your BMI in 2 ways:\n\n"
                        + "1. by entering Weight in Stones and Pounds and Height in Feet and Inches (Imperial) \nor\n"
                        + "2. by entering Weight in Kilograms and Height in Centimeters (Metric)");

                while (true) {
                    System.out.print("\nEnter 1 for Imperial OR Enter 2 for Metric: ");

                    int userInput;
                    userInput = input.nextInt();

                    if (userInput == 1) {
                        readImperial();
                        break;
                    } else if (userInput == 2) {
                        readMetric();
                        break;
                    } else {
                        System.out.println("Invalid Input, please enter 1 or 2");
                    }
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Invalid Input! You must choose between 1 or 2. Please try again.\n");
            }
        } while (continueLoop);

    } // end method metricOrImperial
    
    //ENTER WEIGHT AND HEIGHT IN IMPERIAL SYSTEM
    public void readImperial() {
        boolean continueLoop = true;
             //ENTER WEIGHT IN STONES AND POUNDS WITHIN RANGE AND CONVERT TO KILOGRAMS
        do {
            try {
                System.out.print("\nPlease enter your Weight in Stones: ");
                stones = input.nextInt();

                while (stones < 3 || stones > 30) {
                    System.out.print("Please enter a valid Weight (between 3 and 30 Stones):");
                    stones = input.nextInt();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Input invalid! You must enter a valid Weight (between 3 and 30 Stones) whole numbers only. Please try again.\n");
            }

        } while (continueLoop);

        continueLoop = true;

        do {
            try {
                System.out.print("Please enter your Weight in Pounds: ");
                pounds = input.nextInt();

                while (pounds < 0 || pounds > 15) {
                    System.out.print("Please enter a valid Weight (between 0 and 15 pounds):");
                    pounds = input.nextInt();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();

                System.out.println("Input invalid! You must enter a valid Weight(between 0 and 15 pounds)- whole numbers only. Please try again.\n");
            }
        } while (continueLoop);
        
        totalPounds = stones * 14 + pounds; //convert Stones and Pounds in totalPounds
        kilograms = totalPounds * 0.45359237; //convert totalPounds in Kilograms
        System.out.printf("Your Weight in Kilograms is: %.2f\n", kilograms);

        continueLoop = true;
        //ENTER HEIGHT IN FEET AND INCHES WITHIN RANGE AND CONVERT TO CENTIMETERS
        do {
            System.out.print("\nPlease enter your Height in Feet: ");
            try {
                feet = input.nextInt();

                while (feet < 3 || feet > 7) {
                    System.out.print("Please enter a valid Height (between 3 and 7 Feet):");
                    feet = input.nextInt();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Input invalid! You must enter a valid Height(between 3 and 7 Feet)-whole numbers only. Please try again.\n");
            }
        } while (continueLoop);

        continueLoop = true;

        do {
            System.out.print("Please enter your Height in Inches: ");
            try {

                inches = input.nextInt();

                while (inches < 0 || inches > 13) {
                    System.out.print("Please enter a valid Height (between 0 and 13 inches):");
                    inches = input.nextInt();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Input invalid! You must enter a valid Height(between 0 and 13 Inches)-whole numbers only. Please try again.\n");
            }
        } while (continueLoop);
        
        totalInches = feet * 12 + inches; //convert Feet and Inches in totalInches
        centimeters = totalInches * 2.54; //convert totalInches in Centimeters
        System.out.printf("Your height in Centimeters is: %.0f\n", centimeters);
    }//end method readImperial()
    
      //ENTER WEIGHT AND HEIGHT IN METRIC SYSTEM
    public void readMetric() {
        boolean continueLoop = true;
        //ENTER WEIGHT IN KILOGRAMS WITHIN RANGE AND CONVERT TO STONES AND POUNDS
        do {
            try {
                System.out.print("\nPlease enter your Weight in Kilograms: ");
                kilograms = input.nextDouble();

                while (kilograms < 20 || kilograms > 200) {
                    System.out.print("Please enter a valid Weight (between 20 and 200 Kilograms):");
                    kilograms = input.nextDouble();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Input invalid! You must enter a valid Weight (between 20 and 200 Kilograms)numbers only. Please try again.\n");
            }
        } while (continueLoop);

        totalPounds = kilograms * 2.204622; //convert Kilograms in totalPounds
        stones = totalPounds / 14; //convert totalPounds in Stones
        pounds = totalPounds % 14; //convert the remainder of totalPounds in Pounds
        System.out.printf("Your Weight is: %.0f Stones and %.0f Pounds ", Math.floor(stones), pounds);

        continueLoop = true;
        //ENTER THE HEIGHT IN CENTIMETERS WITHIN RANGE AND CONVERT IN FEET AND INCHES
        do {
            try {
                System.out.print("\nPlease enter your Height in Centimeters: ");
                centimeters = input.nextDouble();

                while (centimeters < 60 || centimeters > 250) {
                    System.out.print("Please enter a valid Height (between 60 and 250 Centimeters):");
                    centimeters = input.nextInt();
                }
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("Input invalid! You must enter a valid Height (between 60 and 250 Centimeters)-whole numbers only. Please try again.\n");
            }
        } while (continueLoop);

        totalInches = centimeters / 2.54; //convert Centimeters in totalInches
        feet = totalInches / 12; //convert totalInches to Feet
        inches = totalInches % 12; //convert the remainder of totalInches to Inches
        System.out.printf("Your Height is: %.0f Feet and %.0f Inches\n", Math.floor(feet), inches);
    }//end method readMetric()
    
    //method to take the Weight and Height either from readImperial or either from readMetric
    public void convertToMetric() {
        if (metricOrImperial == 1) {
            weight = (stones * 6.3502) + (pounds * 0.4536);//calculate Weight in Kilograms
            height = (feet * 0.3048) + (inches * 0.0254);//calculate Height in Metres
        } else {
            weight = kilograms;
            height = centimeters / 100;//calculate Height in Meters
        }
    }//end method convertToMteric()
    
    // method to calculate and print BodyMassIndex
    public void calculateBmi() {
        this.convertToMetric();//call convertToMetric to take Weight and Height
        BMI = weight / (height * height);
        System.out.printf("Your bmi is: %.2f", BMI);
    }//end method calculateBmi()
    
    // method to print the results
    public void printResult() {
        if (BMI < 18.5) {
            System.out.println("\nYou are underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("\nYou are healthy, normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("\nYou are overweight");
        } else if (BMI > 30) {
            System.out.println("\nYou are obese");
        }
    }//end method printResult()
}//end class BmiCalculator
