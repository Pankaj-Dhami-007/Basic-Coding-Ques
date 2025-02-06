import java.util.Scanner;

/*
 *  Java program to print each letter twice
    from a given string
 */
public class DoubleCharacters {
    static String doubleCharacters(String str){
        StringBuilder doubled = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            doubled.append(ch).append(ch);
        }
        return doubled.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String doubledString = doubleCharacters(input);
        System.out.println("Doubled characters: " + doubledString);
    }
}
