import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = Arrays.asList(4, 5, 6, 8);

        int sum = 0;

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n += n)
                .reduce(0, (c, e) -> c + e);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n += n);
        // int result = s3.reduce(0, (c, e) -> c + e);

        System.out.println(result);
        // s3.forEach(n -> System.out.println(n));

        // s1.filter(n -> n%2==0)

        // Stream

        // Consumer<Integer> cons = n ->{ if (n%2 == 0) {
        // n += n;
        // sum+=n;
        // }};

        // nums.forEach(cons);

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // for (int n : nums) {

        // if (n % 2 == 0) {
        // n += n;
        // sum += n;
        // }
        // }

        // System.out.println(sum);

    }
}