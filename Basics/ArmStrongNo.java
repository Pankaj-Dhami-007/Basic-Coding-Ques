
import java.util.Scanner;

public class ArmStrongNo {
   static boolean hasArmStrong(int n){
      int temp = n;
      int sum =0;

      while (temp!=0) {
         int lastDigit = temp % 10;
         sum +=Math.pow(lastDigit, 3);
         temp /= 10;
      }
      return sum == n;
   }
    static void isArmStrong(int n){
      int temp1 = n;
      // cal no of digits
      int count = 0;
      while(temp1 > 0){
        temp1/=10;
        count++;
      }

     int temp2 = n;
     int sum =0;
     while(temp2>0){
        int lastDig = temp2 %10;
        int prod = 1;
        for(int i =1; i<=count; i++){
             prod = prod * lastDig;
        }
        sum = sum + prod;
        temp2/=10;
     }

     if(sum == n){
        System.out.println(n+" is a armsstrong no");
     }
     else{
        System.out.println(n+" not a armstrong no");
     }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       isArmStrong(n);// 9474
       System.out.println();
       System.out.println(hasArmStrong(n));
    }
}
