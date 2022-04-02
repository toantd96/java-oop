package lession_03;

public class Lab_303 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        int num;
        for (int i = 0; i < intArr.length ; i++) {
            for (int j = 0; j < i; j++) {
                if ( intArr[i] < intArr[j]){
                    num = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] =num;
                }
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}