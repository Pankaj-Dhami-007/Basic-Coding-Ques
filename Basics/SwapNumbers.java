
import java.util.Scanner;

public class SwapNumbers {
    static void swap(int a, int b){
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("After Swaping: a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int a = sc.nextInt();
        System.out.print("Enter Second no: ");
        int b = sc.nextInt();
        System.out.println("Before Swaping a = "+a+" b = "+b);
        swap(a, b);
    }
}
