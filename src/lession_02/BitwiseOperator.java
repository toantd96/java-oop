package lession_02;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        if (name != null && name.length() > 1){
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }
    }
}
