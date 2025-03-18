class A extends Thread{
    public void show(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hi" );
        }
    }
    public void run(){
        show();
    }
}
class B extends Thread{
    public void show(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello" );
        }
    }
    public void run(){
        show();
    }
}

public class Demo{ 

    public static void main (String[] args){
   
        A obj = new A();
        B obj2 = new B();
        obj.start();
        obj2.start();
        // obj.show(); 
        // obj2.show(); 

    }

}