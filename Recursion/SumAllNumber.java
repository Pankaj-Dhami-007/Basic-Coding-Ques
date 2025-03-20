public class SumAllNumber {
    static int findSum(int n){
        if(n == 1) return n;
        return n+ findSum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));
    }
}
