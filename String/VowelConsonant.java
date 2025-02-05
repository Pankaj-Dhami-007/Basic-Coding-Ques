public class VowelConsonant {
    static void vowelConsonantCount(String str1) {

        int vowels = 0;
        int consonants = 0;
        str1 = str1.toLowerCase();
        char[] c = str1.toCharArray();
        for (char ch : c) {
            if(ch >= 'a' && ch <= 'z'){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {

                consonants++;
            }
            }

        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);

    }

    public static void main(String[] args) {
        String str = "Hello World";
        vowelConsonantCount(str);
    }
}
