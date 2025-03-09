interface A{
    int age = 20;
    String message = "message";

    void show();
    void config();
}
// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }

class B implements A{

    @Override
    public void show() {
        System.out.println("in B show");
    }

    @Override
    public void config() {
        System.out.println("in B config");
    }
    
}

public class Demo{
    public static void main(String[] args) {

        A obj;
        obj = new B();

        obj.show();
        obj.config();

//        obj.age = 18; cannot modify variables in interface because they are final

        System.out.println(obj.age);
    }
}