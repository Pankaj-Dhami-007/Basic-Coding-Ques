
import java.util.Scanner;

public class Factorial {
    static int findFactorial(int n){
        int fact =1;
       for (int i = 1; i <= n; i++) {
           fact = fact*i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any no: ");
        int num = sc.nextInt();
        System.out.println(findFactorial(num));
    }
}
