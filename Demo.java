import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = Arrays.asList(4, 5, 6, 8);

        Predicate<Integer> p = n -> n % 2 == 0;

        Function<Integer, Integer> f1 = n -> n * 2;
        // Function<Integer, Integer> f1 = new Function<Integer, Integer>() {

        // @Override
        // public Integer apply(Integer n) {
        // {
        // return n * 2;
        // }
        // }

        // };

        int result = nums.stream()
                .filter(p)
                .map(f1)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

    };
}