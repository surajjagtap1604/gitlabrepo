import java.util.Scanner;

public class SumOfLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = Math.max(Math.max(num1, num2), num3);
        int sum = num1 + num2 + num3;

        System.out.println("Sum of the largest number: " + (sum - largest));

        scanner.close();
    }
}
