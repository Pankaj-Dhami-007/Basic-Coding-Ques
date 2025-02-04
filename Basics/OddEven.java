import java.util.Scanner;

class OddEven{
    static String check(int n){
        if(n %2 == 0){
            return "even no";
        }
        return "odd no";
    }
    static void checkNum(int n){
        if(n %2 == 0){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        //checkNum(num);
        System.out.println(check(num));
    }
}