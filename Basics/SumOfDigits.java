import java.util.Scanner;

public class SumOfDigits {
    static int findSum(int n){

        int sum = 0;
        while(n>0){
            int lastDigit = n %10;
            sum = sum+lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        System.out.println("sum = "+findSum(num));
    }
}
