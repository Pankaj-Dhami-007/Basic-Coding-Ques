import java.util.HashMap;
import java.util.Scanner;

class DuplicateCharacter {
    static void findDuplicate(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>(); 
        char[] strArray = input.toCharArray();
        for (char c : strArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) +1);
            }
            else{
                charCountMap.put(c, 1);
            }
        }

        for (char key : charCountMap.keySet()) {
            if(charCountMap.get(key) > 1){
                System.out.println(key+" : "+charCountMap.get(key));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = sc.nextLine();
        findDuplicate(input);
    }
    //toCharArray()--> method of styring class
}