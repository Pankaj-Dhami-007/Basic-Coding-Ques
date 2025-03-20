
class A{
    int x =10;

}
public class Xyz {
    
    public static void main(String[] args) {
       A a = new A();
       A a2 = a;
       a2.x = 20;
       System.out.println(a.x);
    }
}
