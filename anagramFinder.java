import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // take input from users
        System.out.print("ENTER THE TEXT: ");
        String inp1 = scanner.nextLine();
        System.out.print("Enter THE TEXT: ");
        String inp2 = scanner.nextLine();

        // check if length is same
        if(inp1.length() == inp2.length()) {

            // convert strings to char array
            char[] charArray1 = inp1.toCharArray();
            char[] charArray2 = inp2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            if(Arrays.equals(charArray1, charArray2)) {
                System.out.println("IT IS AN ANAGRAM");
            }
            else {
                System.out.println("IT IS NOT AN ANAGRAM");
            }
        }
        else {
            System.out.println("IT IS NOT AN ANAGRAM");
        }

        scanner.close();
    }
}