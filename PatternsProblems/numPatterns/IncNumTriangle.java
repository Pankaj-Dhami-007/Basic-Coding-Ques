/*
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5


    1
   12
  123
 1234
12345


 */

public class IncNumTriangle {
    static void print(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void printLeftTriangle(int n){
        for(int i =1; i<= n; i++){
            for(int j =1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
        printLeftTriangle(n);
    }
}
