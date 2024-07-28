import java.util.Scanner;

public class ConcatenateStrings {
    public static String Concatenate_Strings(String s1, String s2) {
        return s1.concat(s2);
    }

    // Driver Code
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1:");
        s1=sc.nextLine();
        System.out.println("Enter string 2:");
        s2=sc.nextLine();

        System.out.println(Concatenate_Strings(s1, s2));
    }
}
