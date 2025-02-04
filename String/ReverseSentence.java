import java.util.Scanner;

public class ReverseSentence {

    static void reverseEachWordOfString(String inputString) {// Pankaj Singh Dhami
        String[] words = inputString.split(" ");
        // for (String string : words) {
        // System.out.println(string);
        // }

        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String nString = "";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                nString = ch + nString;
            }
            reverseString = reverseString + nString + " ";
        }

        System.out.println(inputString);
        System.out.println(reverseString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = sc.nextLine();
        reverseEachWordOfString(input);
    }
}
