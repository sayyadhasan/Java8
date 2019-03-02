import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaffFilterNew {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("Hasan", 30, 100000),
                new Staff("Ajay", 40, 200000),
                new Staff("Virat", 35, 150000)
        );

        List<PublicStaff> result =  staff.stream().map(temp -> {
           return new PublicStaff(temp.getName(), temp.getAge(), temp.getName() == "Hasan" ? "Extra field for Hasan" : null);
        }).collect(Collectors.toList());

        System.out.println(result);
    }
}
