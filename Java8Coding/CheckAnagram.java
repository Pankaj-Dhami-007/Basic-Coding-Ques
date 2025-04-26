
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {

    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";

        s1 = Stream.of(s1.split("")).map(str -> str.toUpperCase()).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(str -> str.toUpperCase()).sorted().collect(Collectors.joining());
        if (s1.equals(s2)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        // More efficient implementation
        boolean isAnagram = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of(s2.split(""))
                                .map(String::toUpperCase)
                                .sorted()
                                .collect(Collectors.joining())
                );

        System.out.println(isAnagram ? "1" : "0");

        // Remove case sensitivity and sort characters
        char[] chars1 = s1.toUpperCase().toCharArray();
        char[] chars2 = s2.toUpperCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(Arrays.equals(chars1, chars2) ? "1" : "0");
    }
}
