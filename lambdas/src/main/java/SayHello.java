import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SayHello {
    Map<Character, Runnable> commands = new HashMap<>();

    //type psvm and press tab
    public static void main(String[] args) {
        SayHello program = new SayHello();

        program.commands.put('h', () -> System.out.println("Hello Sana Sayyad"));
        program.commands.put('q', () -> System.out.println("Got bored, time to quit"));

        while (true) {
            // Print Menu
            System.out.println("Menu");
            System.out.println("h) Help");
            System.out.println("q) Quit");

            // User input
            char key = new Scanner(System.in).nextLine().charAt(0);

            // Run selected command
            if (program.commands.containsKey(key))
                program.commands.get(key).run();
        }
    }
}
