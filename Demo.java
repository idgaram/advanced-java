class A{
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in b show");

    }
}

public class Demo{
    public static void main(String[] args) {
        A obj = new A(){
            public void show()
            {
                System.out.println("in anonymous show");
            }
        };
        A obj1 = new A();
        
        obj.show();
        obj1.show();

    }
}