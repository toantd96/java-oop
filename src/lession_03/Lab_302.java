package lession_03;

public class Lab_302 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int intMin = intArr[0];
        int intMax = intArr[0];
        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intMin > intArr[elementIndex]){
               intMin = intArr[elementIndex];
            } if (intMax < intArr[elementIndex]){
                intMax = intArr[elementIndex];
            }
        }
        System.out.println("Min number is " + intMin);
        System.out.println("Max number is " + intMax);
    }
}
