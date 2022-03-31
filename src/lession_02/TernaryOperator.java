package lession_02;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean isHeOnTime = false;
//        int hour = -1;
//        if (isHeOnTime){
//            hour = 7;
//        }
        // Toan tu 3 ngoi, Tenary Operator
        int hour = isHeOnTime ? 7 : -1;
        System.out.println(hour);
    }
}
