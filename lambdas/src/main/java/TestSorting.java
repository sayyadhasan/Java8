import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
    public static void main(String[] args) {
        List<Developer> developerList = getDevelopers();

        // Before sort
        System.out.println("Before sort");
        for (Developer developer : developerList) {
            System.out.println(developer);
        }

        Collections.sort(developerList, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        System.out.println("After sort on age");
        for (Developer developer : developerList) {
            System.out.println(developer);
        }

        Collections.sort(developerList, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("After sort on Name");
        for (Developer developer : developerList) {
            System.out.println(developer);
        }

        developerList.sort((Developer o1, Developer o2) -> {
            return o1.getSalary().compareTo(o2.getSalary());
        });

        System.out.println("After sort on Salary");
        for (Developer developer : developerList) {
            System.out.println(developer);
        }
    }

    private static List<Developer> getDevelopers () {
        List<Developer> result = new ArrayList<>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;
    }
}
