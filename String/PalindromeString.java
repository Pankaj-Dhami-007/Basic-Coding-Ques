import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
