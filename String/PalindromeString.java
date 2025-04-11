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
    static boolean isPalindrome2(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }

    static boolean isPalindrome3(String s){//racecar, noon, level, madam

        for(int i =0; i< s.length()/2; i++){
          if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
          }
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

        System.out.println(isPalindrome3(input));
    }
}
