
public class Xyz {
    
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        x = x++ + ++x;
        System.out.println(x);
    }
}
