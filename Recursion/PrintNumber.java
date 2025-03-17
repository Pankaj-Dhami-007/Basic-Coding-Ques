class PrintNumber{
    static void printDesc(int n){// n =5, 5 to 1 

        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDesc(n-1);// 4 to 1
    }
    static void printInc(int n){// 5-> 1 to 5

        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);// 1 to 4
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printInc(5);
        System.out.println();
        printDesc(5);
    }
}