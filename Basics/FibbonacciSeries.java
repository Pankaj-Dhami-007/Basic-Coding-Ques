import java.util.Scanner;

public class FibbonacciSeries {
    static int nthTerm(int n){
        int num1 =0;
        int num2 = 1;
        int count = 2;
        for (int i = 3; i <= n; i++) {
            int nextTerm = num1+num2;
            num1 = num2;
            num2 = nextTerm;
            count++;
            if(count == n){
                return nextTerm;
            }

        }
        return -1;
    }
    static void printFibboSeries(int n){
        int num1 =0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i = 3; i <= n; i++) {
            int nextTerm = num1+num2;
            num1 = num2;
            num2 = nextTerm;
            System.out.print(nextTerm+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of terms: ");
        int num = sc.nextInt();
        printFibboSeries(num);
        System.out.println();
        System.out.println(nthTerm(num)+" is a "+num+"th term");
    }
}
