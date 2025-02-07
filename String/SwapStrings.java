
import java.util.Scanner;




public class SwapStrings {
    static void swapping(String str1, String str2){
        str1 = str1+str2;

        str2 = str1.substring(0, str1.length()- str2.length());
         str1 = str1.substring(str2.length());
        System.out.println("After swapping: str1 = " + str1 + ",str2 = " + str2);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println("Before swapping: str1 = " + str1 + ",str2 = " + str2);
       swapping(str1, str2);
        
        
    }
}
