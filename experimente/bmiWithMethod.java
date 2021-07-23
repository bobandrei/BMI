import java.util.Scanner;

public class BmiWithMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height: ");
        double height = input.nextDouble();
        System.out.println("Please enter your weight: ");
        double weight = input.nextDouble();

        System.out.print("Your Body Mass Index is: " + calculateBodyMassIndex(height ,weight));
    }

    public static double calculateBodyMassIndex(double height , double weight){
        return (height * height) / weight;
    }
}
