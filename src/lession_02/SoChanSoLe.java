package lession_02;

import java.util.Scanner;

public class SoChanSoLe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so vao tu ban phim");
        int number = scanner.nextInt();

        if (number %2 == 0){
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day là so le");
        }
    }
}