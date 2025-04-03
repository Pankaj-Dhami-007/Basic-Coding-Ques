import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateStringInList {
    public static void main(String[] args) {
         List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");


        //   HashSet<String> set = new HashSet<>();

        // System.out.println(set.add("apple"));  // true (first time adding "apple")
        // System.out.println(set.add("banana")); // true (first time adding "banana")
        // System.out.println(set.add("apple"));  // false (because "apple" is already in the set)
        // System.out.println(set.add("grape"));  // true (first time adding "grape")

        //  ArrayList<String> list = new ArrayList<>();

        // System.out.println(list.add("apple"));  // true
        // System.out.println(list.add("banana")); // true
        // System.out.println(list.add("apple"));  // true (duplicates allowed)
        // System.out.println(list.add("grape"));  // true

        Set<String> uniqueString = new HashSet<>();
        
        List<String> duplicates = list.stream().filter(s-> !uniqueString.add(s)).collect(Collectors.toList());

        System.out.println(duplicates);


        List<Integer> numbers = Arrays.asList(1, 2, 2, 1, 3, 4, 5, 5 ,6 ,7);
        Set<Integer> uniqueElements = new HashSet<>();
        System.out.println(numbers.stream().filter(n-> uniqueElements.add(n)).toList());


    }
}
