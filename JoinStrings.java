import java.util.Scanner;

public class JoinStrings {
    public static String joinStrings(String S) {
        int l = S.length(); // storing the length of the string

        int c = (int) S.chars().filter(ch -> ch == ' ').count(); // counting the number of whitespaces

        S = S.replace(" ", ""); // removing all the whitespaces

        S = S.substring(0, l - c); // resizing the string to l-c
        return S;
    }

    // Driver Code
    public static void main(String[] args) {
        String S;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        S=sc.nextLine();

        System.out.println(joinStrings(S));
    }
}
