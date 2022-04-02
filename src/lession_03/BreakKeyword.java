package lession_03;

public class BreakKeyword {
    public static void main(String[] args) {
        int [] intArr = {12, 32, 56, 78, 11, 9, 4, 23};
        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            System.out.println(intArr[elementIndex]);
            if (intArr[elementIndex] == 32){
                System.out.println("The number " + 32 + " is at index " + elementIndex + " of the array");
                break;
            }
        }
    }
}
