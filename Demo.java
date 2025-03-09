abstract class A{
    public abstract void show();
    public abstract void config();
}

// class B extends A {

//     @Override
//     public void show() {
//         System.out.println("in B show");
//     }

// }

public class Demo{
    public static void main(String[] args) {
        A obj = new A(){

            @Override
            public void show() {
                System.out.println("in anonymous abstract show");
            }

            @Override
            public void config() {
                System.out.println("in anonymous abstract config");
            }
            
        };
        obj.show();
        obj.config();

    }
}