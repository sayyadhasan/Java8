import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> alphas = Arrays.asList("a", "b", "c", "d", "e", "f");

        // Before Java 8
        List<String> upperAlphas = new ArrayList<>();
        for (String alpha:
             alphas) {
            upperAlphas.add(alpha.toUpperCase());
        }
        System.out.println(alphas);
        System.out.println(upperAlphas);

        // With Java8
        List<String> collect = alphas.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);

        // Streams with Integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> collectNum = nums.stream().map(n -> n * 3)
                                                .filter(n -> n%2 == 0)
                                                .collect(Collectors.toList());
        System.out.println(collectNum);
    }
}
