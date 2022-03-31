package lession_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // 5 chia 2 = 2 du 1
        int nguyen = 5/2;
        int soDu = 5%2;
        System.out.printf("%d chia %d = %d du %d", 5, 2, nguyen, soDu);
    }
}
