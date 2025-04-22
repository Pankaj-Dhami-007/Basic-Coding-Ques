/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

* * * * *       
 * * * *
  * * *
   * *
    *

   *
  * *
 *   *
*******


    *
   ***
  *****
 *******
*********



 */

public class Triangle {

    static void printOddStarTriangle(int n){

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printHollowTriangle(int n, int m){

        for(int i =0; i<n; i++){
            for(int j=0; j< m; j++){
                if(i+j == 3 || j -i == 3 || i == 3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static  void printInAnotherWay(int n){
        for(int i =1; i<= n; i++){
            for(int j =1; j<=n; j++){
                if(j <= n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void printReverseTriangle(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printTriangle(int n){
        for(int i =1; i<=n; i++){
            for(int j =0; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n =5;
        printTriangle(n);
        printReverseTriangle(n);
        printInAnotherWay(n);
        printHollowTriangle(4, 7);
        printOddStarTriangle(n);
    }
}
