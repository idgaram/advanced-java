import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student arg0) {
        return this.age > arg0.age ? 1 : -1;
    }

}

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Comparator<Student> comp = (arg0, arg1) -> arg0.age > arg1.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(20, "Benoit"));
        studs.add(new Student(27, "Carmen"));
        studs.add(new Student(14, "Nathan"));
        studs.add(new Student(12, "Nathan"));
        studs.add(new Student(64, "Nathan"));
        studs.add(new Student(4, "Nathan"));

        // Student student1 = new Student(20, "Benoit");

        Collections.sort(studs, comp);

        for (Object elem : studs) {
            System.out.println(elem);
        }

        Collections.sort(studs);

        for (Object elem : studs) {
            System.out.println(elem);
        }
    }
}