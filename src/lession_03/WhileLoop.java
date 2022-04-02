package lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoop  {
    public static void main(String[] args) {
        /*
        * lucky: 7
        * guesstime: maximum 3
        * Right: Hooray!!!
        * Wrong: See you next time!
         */
        boolean answerIsRight = false;
        int MAXIMUM_GUESS_TIME = 3;
        int guessTime = 0;
        // 0 ---> 5
        int randomLuckyNumber = new SecureRandom().nextInt(6);
        System.out.println(randomLuckyNumber);//Exclusive
        while (!answerIsRight && guessTime < MAXIMUM_GUESS_TIME){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your number:....");
            int userInput = scanner.nextInt();
            // User can play here

            // If user is right: userInput == 7
            if (userInput == randomLuckyNumber){
                answerIsRight = true;
                System.out.println("Hooray!!!");
            } else {
                guessTime++;
            }
        }
        if (guessTime == MAXIMUM_GUESS_TIME){
            System.out.println("See you next time!");
        }
    }
}
