
import java.util.ArrayList;

public class FirstLastInArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Mango");

        if (!list.isEmpty()) {
            String firstElement = list.get(0);
            String lastElement = list.get(list.size() - 1);
            System.out.println("firstElement :" + firstElement);
            System.out.println("lastElement: " + lastElement);
        } else {
            System.out.println("Empty");
        }

    }
}
