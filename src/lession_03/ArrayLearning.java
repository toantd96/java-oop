package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {
        // Index: 0,1,2,3,4
        int[] intArr = new int[5];
//        intArr[0] = 1; // Frist element
//        intArr[1] = 2;
//        intArr[2] = 3;
//        intArr[3] = 4;
//        intArr[4] = 5;

//        for (int elementIndex = 0;elementIndex < intArr.length;elementIndex++){
//            intArr[elementIndex] = elementIndex + 1;
//        }

        for (int elementIndex = 0;elementIndex < intArr.length;elementIndex++){
            intArr[elementIndex] = elementIndex + 1;
            System.out.println(intArr[elementIndex]);
        }



    }
}
