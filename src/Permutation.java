import java.util.Scanner;

public class Permutation {

    static void permute(String a, String b) {
        /*
         * initial length of a string is equal to zero
         */
        if (a.length() == 0) {
            System.out.print(b + "  ");
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            String left_substr = a.substring(0, i);
            String right_substr = a.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, b + ch);
        }
    }

    public static void main(String args[]) {
        /**
         * creating instance of a scanner class
         */
        Scanner scan = new Scanner(System.in);

        /**
         * declaring variables a and b string type
         */
        String a;
        String b = " ";

        System.out.print("Enter the string : ");
        a = scan.next(); // taking from input

        System.out.print("\nAll possible strings are : ");
        /**
         * calling method permute to perform permutation
         */
        permute(a, b);
        scan.close();
    }
}

