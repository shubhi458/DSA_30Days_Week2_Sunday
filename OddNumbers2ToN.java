import java.util.*;

public class OddNumbers2ToN {
    // Function to calculate Sum of elements at even and odd index positions separately
    static void OddNumbers(int n)
    {
        System.out.println(2);
        for (int i = 2; i <= n; i++) {
            // Loop to find odd numbers
            if ( i % 2 != 0 )
                System.out.println(i);
        }

    }

    // Driver Function
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        System.out.println("Odd numbers from 2 to n:");
        // Call the OddNumbers function
        OddNumbers(n);
    }
}

