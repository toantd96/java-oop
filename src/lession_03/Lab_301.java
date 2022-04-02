package lession_03;

public class Lab_301 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intArr[elementIndex] % 2 == 0 && intArr[elementIndex] == 2) {
                System.out.println("phan tu " + intArr[elementIndex] + " la so chan");
            }
            if (intArr[elementIndex] % 2 != 0 && intArr[elementIndex] == 3) {
                System.out.println("phan tu " + intArr[elementIndex] + " la so le");
            }
        }
    }
}

