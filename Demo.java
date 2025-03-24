import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();

        for (int i = 0; i < 10000; i++) {
            nums.add(ran.nextInt(100));
        }

        Long startSeq1 = System.currentTimeMillis();

        // int sum1 = nums.stream()
        // .map(i -> i * 2)
        // .reduce(0, (c, e) -> c + e);

        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();

        Long endSeq1 = System.currentTimeMillis();

        Long startSeq2 = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();

        Long endSeq2 = System.currentTimeMillis();

        // nums.forEach(n -> System.out.println(n));
        System.out.println(sum2 + " " + sum3);
        System.out.println("sum2 : " + (endSeq1 - startSeq1));
        System.out.println("sum3 : " + (endSeq2 - startSeq2));
    };
}