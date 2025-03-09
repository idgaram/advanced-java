class Outer{
    static int age = 42;
    public void show(){
        System.out.println("data " + age);

    }
    static class Inner{
        public void config(){
            System.out.println("in config, data " + age);
        }
    }
    // class B{
    //     public void config(){
    //         System.out.println("in config");
    //     }
    // }


}
public class Demo{
    public static void main(String[] args) {
    // Outer obj = new Outer();
    // obj.show();
        
    Outer.Inner obj1 = new Outer.Inner();
    obj1.config();
    // A.B obj1 = obj.new B();
    // obj1.config();

    }
}
