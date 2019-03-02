import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffFilterOld {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("Hasan", 30, 100000),
                new Staff("Ajay", 40, 200000),
                new Staff("Virat", 35, 150000)
        );

        System.out.println(convertToPublicStaff(staff));
    }

    private static List<PublicStaff> convertToPublicStaff(List<Staff> staff) {
        List<PublicStaff> publicStaff = new ArrayList<>();

        for (Staff s : staff) {
            publicStaff.add(
                    new PublicStaff(s.getName(), s.getAge(), s.getName() == "Hasan" ? "Extra field for Hasan" : null)
            );
        }

        return publicStaff;
    }
}
