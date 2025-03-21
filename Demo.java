import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class A {
    public static List<Integer> lister(int targetNumber) {
        List<Integer> result = new ArrayList<>();
        while (targetNumber > 0) {
            result.add(targetNumber % 10);
            targetNumber /= 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static List<Integer> stringLister(int targetNumber) {
        return String.valueOf(targetNumber) // Convert to String
                .chars() // Get character stream
                .mapToObj(c -> c - '0') // Convert char to integer
                .collect(Collectors.toList()); // Collect into a list
        // return String.valueOf(targetNumber)
        // .chars()
        // .mapToObj(c -> c - '0')
        // .collect(Collectors.toList());

    }

}

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else {
                    return -1;
                }
            };
        };

        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>();

        myList1.add(121);
        myList1.add(985);
        myList1.add(16);

        // System.out.println(A.lister(5984));
        // System.out.println(A.lister(myList1.get(0)));
        // System.out.println(A.stringLister(myList1.get(0)));

        Collections.sort(myList1);
        System.out.println(myList1);
        Collections.sort(myList1, comp);
        System.out.println(myList1);

        myList2.add(412);
        myList2.add(47856);
        myList2.add(2254);
    }
}