import java.util.Arrays;
import java.util.Scanner;

    public class AnagramDetection {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first string");
            String str1 = sc.next();
            System.out.println("Enter the second string");
            String str2 = sc.next();

            //converting strings to lower case

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            //check if both the string length is same

            if (str1.length() == str2.length()) {

                // convert strings to char array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                //sort the char array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                // if sorted char arrays are same then the string is anagram
                boolean result = Arrays.equals(charArray1, charArray2);

                if (result) {
                    System.out.println(str1 + " and " + str2 + " are Anagram.");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not Anagram.");
                    sc.close();
                }
            }

        }


    }
