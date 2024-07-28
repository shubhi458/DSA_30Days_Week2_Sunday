// Java program for the sum of the digits present in the number
import java.lang.*;
import java.util.Scanner;

class SumOfDigits {

    // Function to check sum of digit using tail recursion
    static int sum_of_digit(int n, int val)
    {
        if (n < 10) {
            val = val + n;
            return val;
        }
        return sum_of_digit(n / 10, (n % 10) + val);
    }

    // Driven code
    public static void main(String args[])
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        // Function call
        int result = sum_of_digit(num, 0);
        System.out.println(result);
    }
}
