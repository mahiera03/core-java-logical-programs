package NumberPrograms;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
