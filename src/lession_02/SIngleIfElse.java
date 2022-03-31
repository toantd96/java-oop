package lession_02;

public class SIngleIfElse {
    public static void main(String[] args) {
        boolean isHeOnTime = true;
        boolean isHeAngry = true;
        System.out.println("1. Dat xe");
        System.out.println("2. Khoi dong xe");
        System.out.println("3. Chay toi quan");

        if (isHeOnTime){
            if (isHeAngry){
                System.out.println("Go home");
                return;
            }
            System.out.println("Let's talk");
        } else {
            System.out.println("Writting a letter ...");
        }

        System.out.println("1. Dat xe");
        System.out.println("2. Khoi dong xe");
        System.out.println("3. Chay toi quan");
    }
}
