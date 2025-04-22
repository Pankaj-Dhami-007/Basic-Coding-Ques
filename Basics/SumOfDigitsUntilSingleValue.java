public class SumOfDigitsUntilSingleValue {
    static int sumAnotherWay(int n){
int sum =0;
        while(n > 9){
            sum =0;
            while(n > 0){
                sum += n %10;
                n /= 10;
            }
            n = sum;
        }
      return sum;  
    }
    static int sum(int n){
        int sum =0;
        while(n > 0 || sum > 9){
            if(n == 0 ){
              n = sum;
              sum =0;
            }
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(877));
        System.out.println(sumAnotherWay(877));
    }
}
