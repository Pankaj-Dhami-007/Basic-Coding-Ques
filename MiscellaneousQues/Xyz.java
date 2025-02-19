
public class Xyz {
    static void reverseEachWordOfString(String input){

        String[] words = input.split(" ");
        System.out.println(input);
      
        String reverseString = "";
        for(int i =0; i< words.length; i++){
            String word = words[i];
            String newString ="";
            char ch;
            for(int j =0; j< word.length(); j++){
                ch = word.charAt(j);
                newString = ch+ newString;
            }
            reverseString = reverseString + newString + " ";
        }

        System.out.println(reverseString);
    }
    public static void main(String[] args) {
        String input = "Pankaj Singh Dhami";
        reverseEachWordOfString(input);
    }
}
