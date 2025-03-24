
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        List<String> names = Arrays.asList("benoit", "catherine", "clara", "romane", "john");

        // String name = names.stream()
        // .filter(n -> n.contains("x"))
        // .findFirst().orElse("no name with this sequence was found");

        // System.out.println(name);

        Optional<String> name = names.stream()
                .filter(n -> n.contains("x"))
                .findFirst();

        System.out.println(name.orElse("no name with this sequence was found"));
    };
}