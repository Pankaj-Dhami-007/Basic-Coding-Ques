import java.util.Scanner;

class Reverse{
    static String reverseString(String str){

        String temp ="";
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            temp = ch + temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = sc.nextLine();
        System.out.println(reverseString(input));
    }
}