import java.util.Scanner;

public class CountWords {
    static int count(String s){
        int count = 1;
        for(int i =0; i< s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = sc.nextLine();
        System.out.println("No of words is : "+count(input));
    }
}
