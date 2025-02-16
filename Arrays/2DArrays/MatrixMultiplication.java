public class MatrixMultiplication {

    static void multiplication(int[][] a, int[][] b, int r, int c){


        /*
         * // Get the dimensions of the matrices
        int r1 = a.length;        // Number of rows in matrix a
        int c1 = a[0].length;     // Number of columns in matrix a
        int r2 = b.length;        // Number of rows in matrix b
        int c2 = b[0].length;     // Number of columns in matrix b
         */

            // Check if the matrices can be multiplied
        // if (c1 != r2) {
        //     System.out.println("Matrices cannot be multiplied. Number of columns in matrix A must equal number of rows in matrix B.");
        //     return;
        // }
        
        int[][] result = new int[r][c];
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
               result[i][j] = 0;
               for(int k =0; k<a[0].length; k++){
                result[i][j] += a[i][k] * b[k][j];
               }
            }
        }
        printMatrix(result, r, c);
    }
    static void printMatrix(int[][] matrix, int r, int c){

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6},
            {4, 5, 6, 7}
        };
       
        int[][] b = {
            {11, 22, 3, 4},
            {2, 5, 4, 8},
            {3, 33, 5, 6},
            {4, 12, 6, 77}
        };

        int r = 4;
        int c = 4;
        multiplication(a, b, r, c);
    }
}
