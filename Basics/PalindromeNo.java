import java.util.Scanner;

public class PalindromeNo {
    static boolean isPalindrome(int n) {
        int originalNum = n;
        int reverseNum = 0;
        while (n > 0) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return originalNum == reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
/*
 * Here, you multiply the current value of reverseNum by 10 to shift its digits
 * to the left (making space for the new last digit), and then add the extracted
 * digit to it.
 * Example:
 * If reverseNum = 43 and digit = 2, then reverseNum * 10 + 2 = 432.
 * 
 * 
 * 
 * 
 * 
 */
