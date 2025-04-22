class Xyz{
    static int sumOfDigits(int n){
        int sum =0;
        while(n > 0 || sum > 9){
            if(n ==0){
                n = sum;
                sum =0;
            }
           sum += n%10;
           n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(875));
    }
}