import java.util.Scanner;

class Basics{
    static void printMatrix(int[][] arr, int r1, int c1){
        for(int i =0; i< r1; i++){
            for(int j=0; j <c1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }  
    }

    static void addMatrix(int[][] a, int[][] b, int r1, int c1, int r2, int c2){

        if(r1 != r2 || c1 != c2){
            System.out.println("Invalid input");
            return;
        }
        int sum[][] = new int[r1][c1];

        for(int i =0; i< r1; i++){
            for(int j=0; j< c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter Matrix values: ");
        for(int i =0; i< r1; i++){
            for(int j=0; j <c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the no of rows and columns: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter Matrix values: ");
        for(int i =0; i< r2; i++){
            for(int j=0; j <c2; j++){
                a[i][j] = sc.nextInt();
            }
        }
       
        printMatrix(a, r1, c1);
        addMatrix(a, b, r1, c1, r2, c2);
        printMatrix(a, r1, c1);
    }   
}