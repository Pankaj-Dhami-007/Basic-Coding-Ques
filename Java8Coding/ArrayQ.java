
import java.util.Arrays;
import java.util.List;

public class ArrayQ {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        //Write a Program To Find Common Element Between Two Array List
        //System.out.println(list1.stream().filter(list2 :: contains).toList());
        System.out.println(list1.stream().filter(i-> list2.contains(i)).toList());


        

    }
}
