import java.util.Scanner;

public class PrimeNo {
    static boolean isPrime(int n){
        for(int i =2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is Prime no");
        }
        else{
            System.out.println(num+" is not a Prime no");
        }
    }
}
