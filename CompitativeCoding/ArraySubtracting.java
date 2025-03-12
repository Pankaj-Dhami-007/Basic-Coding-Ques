
import java.util.Scanner;

public class ArraySubtracting {
    static int findSubtraction(int[] arr1, int[] arr2, int n1, int n2){

        int num1 = convertArrToNum(arr1);
        int num2 = convertArrToNum(arr2);
        int subtract;
        if(num1 > num2){
             subtract = num1 - num2;
        }
        else{
            subtract = num2 - num1;
        }
        return subtract;
}
static int convertArrToNum(int[] arr){
    int num = 0;
    for(int i : arr){
        int digit = i%10;
       num = num *10 + digit;
    }
    return num;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Array size: ");
        int n = sc.nextInt();
        System.out.println();

        int[] arr1 = new int[n];
        System.out.println("Enter elements: ");
         for(int i =0; i< n; i++){
            arr1[i] =sc.nextInt();
         }

        System.out.print("Enter second Array size: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements: ");
         for(int i =0; i< m; i++){
            arr2[i] =sc.nextInt();
         }
        
    System.out.println(findSubtraction(arr1, arr2, n, m));  
    }
}
