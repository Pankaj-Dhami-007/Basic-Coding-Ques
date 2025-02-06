import java.util.Scanner;

public class RemoveSpace {
    static String removeSpacesString(String str){

        String result="";
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                result = result+str.charAt(i);
            }
        }
        return result;
    }
    static String removeSpaces(String str){

        StringBuilder result = new StringBuilder();
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) != ' '){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
         
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        String stringWithoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " +
                stringWithoutSpaces);
                System.out.println(removeSpacesString(input));
    }
}
