package lession_02;

import java.util.Scanner;

public class MultipleIfElese {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Khong ban");
        } else if (age >= 18 && age <= 50) {
            System.out.println("Unlimited");
        } else {
            System.out.println("Ban 2 chai");
        }
    }
}
