import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatWords {
    static void countWordsInString(String input){
        HashMap<String, Integer> countStringMap = new HashMap<>();
        for(String s : input.split(" ")){
            if(countStringMap.containsKey(s)){
                countStringMap.put(s, countStringMap.get(s)+1);
            }
            else{
                countStringMap.put(s, 1);
            }
        }

        System.out.println(countStringMap);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = sc.nextLine();
        countWordsInString(input);
    }
    // split()-->
          //   breaking a string into an arr of substrings based on a specified delimeteror regular expression
}
