package lession_02;

import java.util.Scanner;

public class BMILap02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in meter: ");
        float height = scanner.nextFloat();
        System.out.println("Enter your weight in kg: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);

        if (BMI < 18.5){
            System.out.println("Underweight");
        } else if (BMI < 24.9){
            System.out.println("Normal weight");
        } else if (BMI < 29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

    }
}
