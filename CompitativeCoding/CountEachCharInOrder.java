
import java.util.Map;
import java.util.TreeMap;

public class CountEachCharInOrder {

    public static void countEachCharInOrder(String input){

        Map<Character,Integer> orderMap = new TreeMap<>();
        char[] charArr = input.toCharArray();
        for(char ch : charArr){
            if (orderMap.containsKey(ch)) {
                orderMap.put(ch, orderMap.get(ch)+1);
            }
            else{
                orderMap.put(ch, 1);
            }
        }

        System.out.println(orderMap);
    }

    public static void main(String[] args) {
        String s = "coodinning";
        countEachCharInOrder(s);
    
    }
}
