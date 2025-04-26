
import java.util.Comparator;
import java.util.stream.Stream;

public class StringQ {
    public static void main(String[] args) {
        
        // Find the Longest Word In a String
        String s = "Pankaj Singh Dhami";
        Stream.of(s.split(" ")).reduce((a,b)-> a.length()> b.length() ? a : b).ifPresent(lw-> System.out.println(lw));
    }
}
