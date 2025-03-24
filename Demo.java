import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        List<String> names = Arrays.asList("benoit", "catherine", "clara", "romane", "john");

        List<String> capitalNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // List<String> capitalNames = names.stream()
        // .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
        // .collect(Collectors.toList());

        // capitalNames.add("andré");

        // List<String> finalCapitalNames = names.stream()
        // .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
        // .toList();

        // finalCapitalNames.add("andré");

        capitalNames.forEach(System.out::println);
        System.out.println(capitalNames);
        // System.out.println(finalCapitalNames);

    };
}