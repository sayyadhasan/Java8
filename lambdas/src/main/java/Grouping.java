import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("banana", "papaya", "orange",
                "apple", "banana", "apple", "watermelon");

        Map<String, Long> result = items.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );

        System.out.println(result);

        Map<String, Long> finalResul = new LinkedHashMap<>();

        result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()
                                            .reversed()).forEachOrdered(e -> finalResul.put(e.getKey(), e.getValue()));

        System.out.println(finalResul);
    }
}
