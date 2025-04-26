
import java.util.stream.IntStream;

class Sum{
    static int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
           sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));

        //cal Sum
        int n =20;
        System.out.println(IntStream.range(1, n+1).sum());
    }
}